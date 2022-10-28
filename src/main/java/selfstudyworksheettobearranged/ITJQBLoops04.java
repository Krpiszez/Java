package selfstudyworksheettobearranged;

public class ITJQBLoops04 {

    public static void main(String[] args) {

        //14) Type code to find the multiplication of the integers from 3 to 9

//        int mult=1;
//
//        for (int i = 3;i<10;i++){
//            mult = mult*i;
//        }
//        System.out.println(mult);

//        int i = 3;

//        while (i<10){
//            mult = mult*i;
//            i++;
//        }
//        System.out.println(mult);

//        do {
//            mult=mult*i;
//            i++;
//        }while (i<10);
//        System.out.println(mult);

        //15) Type code to print characters from 'C' to 'A' on the console by using do-while loop

//        char a = 'C';
//        String res = "";
//        do {
//            res = res + a;
//            a--;
//        }while (a>='A');
//        System.out.println(res);
        //16) Type all characters before the first occurrence of 'm' in a String

//        String name = "AMdromeda";
//        String res = "";
//        for (int i =0; i<name.length();i++){
//
//            String a = name.substring(i, i+1);
//            if (a.equals("m")){
//                break;
//            }
//            res = res+a;
//        }System.out.print(res);
//        int i = 0;
//        while (i<name.length()){
//            String a = name.substring(i, i+1);
//            if (a.equals("m")){
//                break;
//            }
//            res = res + a;
//            i++;
//        }
//        System.out.println(res);

//        do {
//            String a = name.substring(i, i+1);
//            if (a.equals("m")){
//                break;
//            }
//            res=res+a;
//            i++;
//        }while (i< name.length());
//        System.out.println(res);

        //17) Type code to find the sum of the digits in an integer

//        int num = 199234;
//        int sum = 0;

//        for (int i = num;i>0;i/=10){
//
//            sum=sum+i%10;
//
//        }
//        System.out.println(sum);
//        int i = num;
//        while (i>0){
//            sum=sum+i%10;
//            i/=10;
//        }
//        System.out.println(sum);
//        do {
//            sum = sum +i%10;
//            i=i/10;
//        }while (i>0);
//        System.out.println(sum);

        //18) Type code to print unique characters in a String. For example; Hello ==> Heo

//        String name = "Hello!";
//        String unique = "";

//        for (int i = 0;i<name.length();i++){
//
//            String ch = name.substring(i, i+1);
//
//            if (name.indexOf(ch)==name.lastIndexOf(ch)){
//                unique = unique+ch;
//            }
//
//
//        }System.out.print(unique);
//        int i = 0;
//        while (i<name.length()){
//
//            String a = name.substring(i, i+1);
//
//            if (name.indexOf(a)==name.lastIndexOf(a)){
//                System.out.print(a);
//            }i++;
//        }
//        do {
//            String a = name.substring(i, i+1);
//            if (name.indexOf(a)==name.lastIndexOf(a)){
//                System.out.print(a);
//            }
//            i++;
//        }while (i<name.length());


    }

}
