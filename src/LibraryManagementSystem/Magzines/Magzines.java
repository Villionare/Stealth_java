package LibraryManagementSystem.Magzines;

abstract class Magzines {

        private final String id;
        private final String name;
        private final double price;

        Magzines(String id, String name, double price){
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

        abstract void bestPage();

    void magzine(){
        System.out.println("this is a Magzine" + this.name + " of " +this.id+ " and the price of this book is" + this.price);
    }
}
