package LibraryManagementSystem.Newspapers;

public class TodaysNewspapaer extends Newspaper{
    public TodaysNewspapaer(String id, String date, String name, double price) {
        super(id, date, name, price);
    }

    void review(){
        System.out.println("today election result is quite satisfying");
    }
}
