package CompetetiveCoding;

import java.util.*;

class InvalidTransactions {

    static class Transaction {
        String name, city;
        int time, amount;
        String original;

        public Transaction(String transaction) {
            String[] parts = transaction.split(",");
            this.name = parts[0];
            this.time = Integer.parseInt(parts[1]);
            this.amount = Integer.parseInt(parts[2]);
            this.city = parts[3];
            this.original = transaction;
        }
    }

    public List<String> invalidTransactions(String[] transactions) {
        List<Transaction> transList = new ArrayList<>();
        Set<String> invalid = new HashSet<>(); // Store invalid transactions

        // Step 1: Parse transactions into objects
        for (String trans : transactions) {
            transList.add(new Transaction(trans));
        }

        // Step 2: Check for invalid transactions
        for (int i = 0; i < transList.size(); i++) {
            Transaction t1 = transList.get(i);

            // If amount exceeds $1000, it's invalid
            if (t1.amount > 1000) {
                invalid.add(t1.original);
            }

            // Check for same-name transactions within 60 minutes but different cities
            for (int j = 0; j < transList.size(); j++) {
                if (i == j) continue; // Skip itself

                Transaction t2 = transList.get(j);

                if (t1.name.equals(t2.name) && !t1.city.equals(t2.city) && Math.abs(t1.time - t2.time) <= 60) {
                    invalid.add(t1.original);
                    invalid.add(t2.original);
                }
            }
        }

        // Convert set to list and return
        return new ArrayList<>(invalid);
    }

    public static int twoCitySchedCost(int[][] costs) {
        // Sort based on cost difference: (bCost - aCost)
        Arrays.sort(costs, (c1, c2) -> (c1[1] - c1[0]) - (c2[1] - c2[0]));

        int totalCost = 0;
        int n = costs.length / 2;

        // Send the first n people to City A, and the rest to City B
        for (int i = 0; i < costs.length; i++) {
            if (i < n) {
                totalCost += costs[i][1];  // Send first n people to City B
            } else {
                totalCost += costs[i][0];  // Send the rest to City A
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {
        InvalidTransactions it = new InvalidTransactions();
        String[] transactions = {
                "alice,20,1220,mtv","alice,20,1220,mtv"
        };
        System.out.println(it.invalidTransactions(transactions));

        int[][] costs = new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};

        twoCitySchedCost(costs);
    }
}
