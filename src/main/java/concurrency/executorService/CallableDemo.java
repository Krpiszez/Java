package concurrency.executorService;

import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> submit;

        try {
            submit = executorService.submit(new ReturnValueTask());
            System.out.println("Task submitted!: " + submit.get(3, TimeUnit.SECONDS));
            boolean done = submit.isDone();
            System.out.println(done + " Task is completed!");
        } finally {
            executorService.shutdown();
        }
    }

}

class ReturnValueTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        return 3;
    }
}
