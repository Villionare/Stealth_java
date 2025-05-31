package ZERO;

//control statements helps in controlling flow of the program
//Java compiler executes the code from top to bottom.
//The statements in the code are executed according to the order in which they appear.
//However, Java provides statements that can be used to control the flow of Java code.
//Such statements are called control flow statements. It is one of the fundamental features of Java,
//which provides a smooth flow of program.

//java provides 3 basic control statements:
//loops statements(for, while, do while,for-each),
// decision making(if-else, ternary, switch),
// jump statements(break and continue)

public class ControlStatements {
    public static void main(String[] args) {
        //if statements
        //simple if
        //if-else
        //if-else-if
        //nested if
        int x = 10;
        int y = 12;
        if(x+y > 20) {
            System.out.println("x + y is greater than 20");
        }

        if(x+y < 10) {
            System.out.println("x + y is less than 10");
        }   else {
            System.out.println("x + y is greater than 20");
        }

        //if-else-if ladder
        String city = "Delhi";
        if(city == "Meerut") {
            System.out.println("city is meerut");
        }else if (city == "Noida") {
            System.out.println("city is noida");
        }else if(city == "Agra") {
            System.out.println("city is agra");
        }else {
            System.out.println(city);
        }

        //nested if-else
        String ac = "this is a str";

        if(ac.contains("this")){
            if(ac.contains("is")){
                if(ac.contains("a")){
                    if (ac.contains("str")){
                        System.out.println("so the string is " + ac);
                    } else {
                        System.out.println("no the string dosent contains 'str' ");
                    }
                }else {
                    System.out.println("no the string dosent contains 'a' ");
                }
            }else {
                System.out.println("no the string dosent contains 'is' ");
            }
        } else {
            System.out.println("no the string dosent contains 'this' ");
        }

        //switch statements
        int p = 7;

        switch (p){
            case 0 -> {
                System.out.println("number is 0");
                break;
            }
            case 1 -> {
                System.out.println("number is 1");
                break;
            }
            default -> System.out.println(p);
        }

        //loop statements
        //for
        for (int i = 0; i < 100; i++){
            System.out.println("the count is " + i);
        }

        //for-each loop or advanced for loop
        int[] thi = {1,2,3,4,5,6,7,8,9};
        int ii = 0;
        for(int i: thi){
            System.out.printf("array element at index thi[%d] and the value is %d \n",ii, i);
            ii++;
        }

        //while loop
        boolean isOkay = false;
        int kk = 0;
        while (!isOkay){
            System.out.println(kk);
            kk++;
            if (kk == 10){
                isOkay = true;
            }
        }

        //do-while
        int vo = 0;
        do {
            System.out.println("hi,");
            vo++;
        } while (vo != 10);

        //jump statements break and continue

        //labelled break
        //A labeled break in Java allows you to break out of a specific loop or block, rather than just the innermost loop.
        // This is useful when dealing with nested loops, where you need to exit an outer loop from within an inner loop.
        labelName:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    break labelName; // Exit from the outer loop,
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Loop exited.");


        //labelled continue
        voooo:
        for(int i =0; i<=7; i++){
            for (int j = i; j<=7; j++){
                if (j==5){
                    continue voooo;
                }
                System.out.printf("%d %d \n",i,j);
            }
        }
    }
}

