package LibraryManagementSystem;

import LibraryManagementSystem.Books.Book1;
import LibraryManagementSystem.Books.Book2;
import LibraryManagementSystem.Books.Book3;
import LibraryManagementSystem.Magzines.Magzine1;
import LibraryManagementSystem.Magzines.Magzine2;
import LibraryManagementSystem.Newspapers.TodaysNewspapaer;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean status = true;
        Scanner scanner = new Scanner(System.in);

        Book1 b1 = new Book1();
        Book2 b2 = new Book2();
        Book3 b3 = new Book3();

        Magzine1 m1 = new Magzine1("yuu", "fashion sense", 88);
        Magzine2 m2 = new Magzine2("mnh", "dragon men sense", 90);

        TodaysNewspapaer news1 = new TodaysNewspapaer("xxx", LocalDate.now().toString(), "Express Hindustan", 10);

        System.out.println("Welcome to the Library!");
        while(status != false){
        System.out.println("Please Choose any option below:\n1 - Show Books\n2 - Show Magazines\n3 - Show Newspapers\n4 - Issue a Book\n5 - Return a Book\n6 - Read a magazine\n7 - Read Today Newspaper\n8 - Exit");
        int option = scanner.nextInt();

        switch (option){
            case 1 -> {
                System.out.println("Listing all the Books available:");
                System.out.println(b1.getId() +" "+b1.getName());
                System.out.println(b2.getId() +" "+b2.getName());
                System.out.println(b3.getId() +" "+b3.getName());
            }
            case 2 -> {
                System.out.println("Listing all the Magazines available:");
                System.out.println(m1.getName());
                System.out.println(m2.getName());
            }
            case 3 -> {
                System.out.println("showing Today's Newspaper:");
                System.out.println(news1.getName()+" "+news1.getDate());
            }
            case 4 -> {
                System.out.println("Enter the Book id:");
                scanner.nextLine();
                String str = scanner.nextLine().trim();
                if (str.equals(b1.getId()) || str.equals(b2.getId()) || str.equals(b3.getId())) {
                    System.out.println("Books Issued Successfully");
                } else {
                    System.out.println("Wrong ID");
                };
            }
            case 5 -> {
                System.out.println("Enter the book id:");
                scanner.nextLine();
                String sttr = scanner.nextLine().trim();

                if (Objects.equals(sttr, b1.getId()) || Objects.equals(sttr, b2.getId()) || Objects.equals(sttr, b3.getId())) {
                    System.out.println("Books Issued Successfully");
                } else {
                    System.out.println("Wrong ID");
                }
            }
            case 6 -> {
                System.out.println("Reading Magazine...");
            }
            case 7 -> {
                System.out.println("Reading Today Newspaper...");
            }
            case 8 -> {
                status = false;
            }
            default -> System.out.println("you pressed an invalided key");
        }
        }
    }
}
