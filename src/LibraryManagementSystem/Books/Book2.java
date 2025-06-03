package LibraryManagementSystem.Books;

public class Book2 extends Books{
    public Book2(){
        super("lll", "harry potter", 60);
    }

    @Override
    void review(){
        System.out.println("i love tom riddle");
    }
}
