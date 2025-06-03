package LibraryManagementSystem.Books;

public class Book3 extends Books{
    public Book3(){
        super("opi", "The Black Diamond", 20);
    }

    @Override
    void review(){
        System.out.println("God Level!!!");
    }
}

