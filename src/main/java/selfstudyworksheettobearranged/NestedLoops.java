package selfstudyworksheettobearranged;

import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {

        /*  Question 1

         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *

         */
//        int row = 5;
//        for (int i= 1; i<=row; i++){
//            for (int k = 0; k<row;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }




//---------------------------------------------------------

        /*  Question 2

         * * * * *
         * * * *
         * * *
         * *
         *

         */

//        int row = 5;
//
//        for (int i=row;i>0;i--){
//            for (int k=i;k>0;k--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//------------------------------------------------------------




        /*  Question 3


         *
         * *
         * * *
         * * * *
         * * * * *

         */

//        int row = 5;
//
//        for (int i=1; i<=row; i++){
//            for (int k=1; k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//------------------------------------------------------------




/*  Question 4


0
1 1
2 2 2
3 3 3 3
4 4 4 4 4



 */

//        int row = 5;
//
//        for (int i=0; i<row;i++){
//
//            for (int k=0;k<=i;k++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }


//------------------------------------------------------------


/*  Question 5

0 1 2 3 4
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8

*/


//        int row = 5;
//
//        for (int i=0;i<row;i++){
//            for (int k =0;k<row;k++){
//                System.out.print(i+k);
//            }
//            System.out.println();
//        }

//------------------------------------------------------------


/*  Question 6



 /*

  *
  * *
  * * *
  * * * *
  * * * * *
  * * * *
  * * *
  * *
  *

  */

//        int row = 5;
//
//        for (int i=1;i<=row;i++){
//            for (int k = 1;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i = row-1;i>0;i--){
//            for (int k = i;k>1;k--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//


//------------------------------------------------------------


        /*  Question 7


         *
         * *
         * * *
         * * * *
         * * * * *

         */


//------------------------------------------------------------




/*  Question 8

/*
         *
       * *
     * * *
   * * * *
 * * * * *

 */

//        int row = 5;
//
//        for (int i = 1; i<=row; i++){
//            for (int l=row; l>i;l--){
//                System.out.print("  ");
//            }
//            for (int k = 1; k<=i; k++){
//                System.out.print(" *");
//            }
//            System.out.println();}





//------------------------------------------------------------


/*  Question 9

    0
   1 1
  2 2 2
 3 3 3 3
4 4 4 4 4


  */

//         int row = 5;
//
//        for (int i = 0; i<row; i++){
//            for (int l=row; l>=i;l--){
//                System.out.print(" ");
//            }
//            for (int k = 0; k<=i; k++){
//                System.out.print(" "+i);
//            }
//            System.out.println();}


//------------------------------------------------------------


        /*  Question 10

         * * * *
         * * *
         * *
         *

         */

//        int row = 4;
//
//        for (int i = 0; i<row; i++){
//
//            for (int k = row; k>i; k--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//------------------------------------------------------------


/*  Question 11

   1
  2 2
 3 3 3
4 4 4 4
 3 3 3
  2 2
   1


 */
//    int row = 4;
//
//    for (int i = 1; i<=row; i++){
//        for (int l = row; l>i; l--){
//            System.out.print(" ");
//        }
//        for (int k = 1; k<=i; k++){
//            System.out.print(" "+i);
//        }
//        System.out.println();
//    }
//    for (int i = row-1; i>0; i--){
//        for (int l = i; l<row; l++){
//            System.out.print(" ");
//        }
//        for (int k = i; k>=1; k--){
//            System.out.print(" "+i);
//        }
//        System.out.println();
//    }



//------------------------------------------------------------


/*  Question 12

    5
   4
  3
 2
1

??
 */

//        int row = 5;
//
//        for (int i = 1; i<=row; i++){
//            for (int l=row; l>i;l--){
//                System.out.print(" ");
//            }
//            for (int k = 1; k==1; k--){
//                System.out.print(i);
//            }
//            System.out.println();}

//---------------------------------------------------------


/*  Question 13

/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


 */



//        int row = 5, a=1;
//
//        for (int i = 1; i<=row ; i++){
//
//            for (int k = 1; k<= i; k++){
//
//                System.out.print(a++ + " ");
//            }
//            System.out.println();
//        }

//---------------------------------------------------------



/*  Question 14


A
B C
D E F
G H I J
K L M N O

*/

//        int row = 5;
//        int a =65;
//        for (int i=1; i<=row; i++){
//            for (int k = 1; k<=i; k++){
//                System.out.print((char)a++ + " ");
//            }
//            System.out.println();
//        }

//---------------------------------------------------------


/*  Question 15


 /*

A
A B
A B C
A B C D
A B C D E

  */

//        int row = 5;
//        int a = 65;
//
//        for (int i = 1; i<=row; i++){
//
//            for (int k = 0; k<i; k++){
//                System.out.print((char)(a+k) +" ");
//            }
//            System.out.println();
//        }
//

//---------------------------------------------------------

//  Question 16


/*

   A
  B C
 D E F
G H I J
 K L M
  N O
   P


 */

//        int row = 4;
//        int a = 65;
//        int b = 75;
//
//        for (int i=1; i<=row; i++){
//            for (int j = row; j>i; j--){
//                System.out.print(" ");
//            }
//            for (int k = 0; k<i; k++){
//                System.out.print((char)(a++) + " ");
//            }System.out.println();
//        }
//        for (int i = row-1; i>0; i--){
//            for (int j=i; j<row-1;j++){
//                System.out.print(" ");
//            }for (int k =i; k>=1;k--){
//                System.out.print(" "+(char)b++);
//            }
//            System.out.println();
//        }




//---------------------------------------------------------

/*  Question 17



/*

   A
  A B
 A B C
A B C D


 */

//        int row = 4;
//        int a =65;
//
//        for (int i = 0; i<row; i++){
//            for (int k = 2; k>=i; k--){
//                System.out.print(" ");
//            }
//            for (int l = 0; l<=i;l++){
//                System.out.print((char)(a + l) + (" ") );
//            }
//            System.out.println();
//        }


        //---------------------------------------------------------------------------------


 /*  Question 18

      /*

       *****
       *   *
       *   *
       *   *
       *****


       */

//        int row = 5;
//        for (int i = 1; i<=row; i++){
//            for (int k = 1; k<=row; k++){
//                if (k==1||i==1||k==row||i==row){
//                    System.out.print("*");
//                }else System.out.print(" ");
//            }System.out.println();
//        }

/*
 ****
  ****
   ****
    ****
 */

//        int row = 4;
//        for (int i =1; i<=row; i++){
//            for (int l = 1;l<i;l++){
//                System.out.print(" ");
//            }
//
//            for (int k = 1; k<=row; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
         */

//        int row = 5;
//
//        for (int i= 1; i<=row; i++){
//            for (int k = row; k>i; k--){
//                System.out.print(" ");
//            }
//            for (int l=1; l<=i; l++ ){
//                System.out.print(" " + l);
//            }
//            System.out.println();
//        }

        /*
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
         */


//        int row = 5;
//
//        for (int i = 1; i<=row; i++){
//            for (int k =row;k>i;k--){
//                System.out.print("  ");
//            }
//            for (int l = 1; l<=i; l++){
//                System.out.print(" " + l);
//            }
//            System.out.println();
//        }



    }
}
