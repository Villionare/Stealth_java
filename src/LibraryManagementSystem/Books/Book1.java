package LibraryManagementSystem.Books;

public class Book1 extends Books{
    public Book1(){
        super("abc", "lord of the rings", 55.7);
    }

    @Override
    void review(){
        System.out.println("wow i have read the part 1, that is sooo grate i will  read the other 2 asap!");
    }
}
