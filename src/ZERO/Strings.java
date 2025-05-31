package ZERO;

public class Strings {

    public static void main(String[] args) {


        //strings are stored in a special location called "String Constant Pool"
        //A string class implements to the following charSequence, Serialization, Comparable

        //there are two places where a string can be stored 1) heap memory 2) String constant pool
        //any same string inside the string constant pool will be created ones and the other string variables with the same values
        //will be referenced to that....hence proper memory utilisation

        char[] lala = {'t','h','i','s'};
        String str = new String(lala);;
        //str == a
        String a = "this";
        System.out.println(System.identityHashCode(a));
        a = "now";
        System.out.println(System.identityHashCode(a));


        //the string in the constant pool will have the same memory address and will point to same object
        String cc = "pool";
        String dd = "pool";
        System.out.println(cc == dd);

        //but the string object created sung new keyword and is stored in the heap memory will have different addresses
        String aa = new String("pool");
        String bb = new String("pool");
        System.out.println(aa == bb);

        //if any string object is created using new keyword we can store it in the pool by adding .intern() at the end
        String ee = new String("pool").intern();
        System.out.println(cc == ee);
        System.out.println(dd == ee);

        //creating a subset of a string
        char[] str2 = {'t','h','i','s','-','i','s','-','a','-','s','t','r','i','n','g','-','2'};
        //3 is the strting index and 4 is till how many steps
        String sub = new String(str2, 3, 4);
        System.out.println(sub);

        String s="Sachin";
        String la = s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects
        System.out.println(la);

        //string comparison
        System.out.println(cc.equals(dd));
        System.out.println(cc.compareTo(dd));

        //since strings are immutable java provides two ways for mutable string operations
        //string buffer and string loader

        StringBuilder sb = new StringBuilder("this is a string of a string builder");
        sb.append(" so the will be at the end");
        System.out.println(sb);
        //method chaining is possible in string builder


    }
}
