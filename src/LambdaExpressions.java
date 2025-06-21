public class LambdaExpressions{

    public static void main(String[] args) {
        TemproryOne temp = name -> System.out.println("this is from the Overridden Method " + name);
        temp.doSomething("steath");


        System.out.println("so this is how wee will use lambda expressions");
    }
}
