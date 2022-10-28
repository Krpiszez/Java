package selfstudyworksheettobearranged;

public class JavaSlides181 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4,"ccc");
        System.out.println(sb);

        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        if (s1.equals(s2.toString())) {System.out.println("1");}

        String numbers = "012345678";
        System.out.println(numbers.substring(1,3));//12
        System.out.println(numbers.substring(7,7));//7
        System.out.println(numbers.substring(7));//78

        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1,2).length();
        total += letters.substring(6,6).length();
//        total += letters.substring(6,5).length();
        System.out.println(total);


        JavaSlides181 rope = new JavaSlides181();
        rope.play();
        JavaSlides181 rope2 = new JavaSlides181();
        rope2.play();

        int value = 9;
        long result = square(value);
        System.out.println(value);//9
    }


    public static long square(int x){
        long y = x * (long) x;
        x = -1;
        return y;
    }

    public static void swing(){
        System.out.println("swing");
    }

    public static void climb(){
        System.out.println("climb");
    }

    public static void play(){
        swing();
        climb();
    }

//    public void moreA(int... nums){}
//    public void moreB(String values, int... nums){}
//    public void moreC(int... nums, String values){}
//    public void moreD(String... values, int... nums){}
//    public void moreE(String[] values, int... nums){}
//    public void moreF(String... values, int[] nums){}
//    public void moreG(String[] values, int[] nums){}


}
