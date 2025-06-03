package LibraryManagementSystem.Newspapers;

abstract class Newspaper {

    private final String id;
    private final String date;
    private final String name;
    private final double price;

    Newspaper(String id, String date,String name, double price){
        this.id = id;
        this.date = date;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    abstract void review();

    void newspaper(){
        System.out.println("this is a newspaper" + this.name +" having the id: " + this.id + " of " +this.date+ " and the price of this book is" + this.price);
    }
}
