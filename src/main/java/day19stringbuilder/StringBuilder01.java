package day19stringbuilder;

public class StringBuilder01 {

    public static void main(String[] args) {

        //What is "StringBuilder class"? StringBuilder is a class, every class is data types.
        //"String Builder" Class is for creating "Mutable Strings".
        //If you want to create a String you can use that class. In java names summarize the functionality.

        //We use "String Class" to create a String, why or when we will need "StringBuilder Class"?
        //String class is "immutable", StringBuilder Class is "mutable". mutable==>degisken, immutable==>degismez,sabit

        //String class is "immutable" because of that, it does not change existing value. If you want to assign a new value to a variable, Java will create a new container inside
        //the String Pool, ===String Pool contains all Strings inside the Heap memory===. We put new value in it, then changes the address pointer to the new container.
        //Java has "Garbage Collector". Garbage Collector scans the memory constantly. If any container has no address pointer, Garbage Collector removes the container from
        //the memory. If Java does not scan the memory, memory will be so dirty-unclean. To make memory clean Java created Garbage Collector System, if a container does not
        //have a pointer, it will be removed. When Java scans the memory, it will find many things to remove but at the beginning Java finalize them after it collects the
        //Garbage's and remove them all. Before removing things from memory, Java "finalize" them. Without finalizing Java doesn't remove anything from memory. Java does
        //"finalizing" and "removing garbage's" by itself. It does not let developers work with them. It is very important for Java to make memory clean.

        String name = "Tom"; //When you write that code, Java will create a resort area in memory and name it as name. When you type it Java will put "Tom" in container.
        //And if you put sth in heap memory Java will create an address in Stack memory.
        name = "Mark"; //Here we change the name into a new value. Java doesn't change Tom to Mark. Java creates a String pool at the beginning which includes name container.
        //Java will create another String container in that String Pool and put new value(Mark) in it. Java changes the address point to new container in the String Pool.
        //This is the structure of String Class. Java is not change the existed value. Immutable means existing value will not change.

        //Benefits of immutability.
        String s = "Jhon";
        String r = "Jhon";//If different variables has same values. Java creates 1 container to keep them all in, it just creates different address pointers for them separately.
        //This is the benefit of being immutable.
        r = "Sam";//When you type that code Java creates another container and put the new value in it and change the pointer of the variable that has been changed. In this
        //scenario the container that was created for this variables won't be removed because it still has pointer because of the first variable.

        //I want a separate container whose value is "Jhon".
        String u = new String("Jhon");//When you use new keyword you tell I need a new container, and it will be created.

        //The other benefit of immutability is security. There are a couple of pointers to container which has same value from different variables. When you have different
        //methods that uses the value that has different variables, one method may affect each other but in immutability, because the changing value will be put another
        //container, methods will be working separately.

        //If you want to change the value directly, without creating new container in memory you can use "StringBuilder" Class.
        StringBuilder sb = new StringBuilder("Clara");//You can put a different variable in StringBuilder container. You can only change the value into another value. When
        //you change the values that was put in the StringBuilder variable, all StringBuilder variables will be changed into that value. All pointers will see the updated name
        //This is mutability. It is changing the existed value, it does not create new containers.

        //How to create a "StringBuilder" object.
        //1.Way
        StringBuilder sb1 = new StringBuilder("Clara");

        //2.Way
        StringBuilder sb2 = new StringBuilder();//Empty StringBuilder.
        sb2.append("Clara ");//This method is to use adding values in a StringBuilder variable. .append() method can be used repeatedly.
        sb2.append("Ocean ");//It will concatenate.
        sb2.append("Miami ").append("FL ").append("USA");//You can use .append() method as method chain.
        System.out.println(sb2);

        //How to learn the capacity in a StringBuilder.

        StringBuilder sb3 = new StringBuilder();

        sb3.append("Jackson");
        sb3.append("Mexico");
        sb3.append("The USA");
        sb3.append("123456789012345");


        int numOfChars = sb3.length();
        System.out.println(numOfChars);

        int cap = sb3.capacity();//It shows you how many box Java created for an empty StringBuilder.
        System.out.println(cap);

        //What is capacity? When you create an empty StringBuilder Java will give you 16 empty box. When you need more boxes Java  will add cap*2+2 more boxes.







    }
}
