package LibraryManagementSystem.Books;

abstract class Books {
    private final String id;
    private final String name;
    private final double price;

    Books(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    abstract void review();

    void book(){
        System.out.println("this is a Book" + this.name + " of " +this.id+ " and the price of this book is" + this.price);
    }

}
