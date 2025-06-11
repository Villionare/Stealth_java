package ZERO;

public class Books implements Printable{
    private String title;
    private String author;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void printDetails(){
        System.out.println("Name of the Book is: " + this.title + "\n" + "and the author is: " + this.author);
    }
}
