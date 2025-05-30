package Day0004;
// P6. Create a class Book with title, author, and price. 
// Add a method to apply a discount of 10% and display the final price.


class Book {
    String title;
    String author;
    double price;

    void applyDiscount() {
        price = price - (price * 0.10);
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Final Price after 10% Discount: " + price);
       
    }
}

public class P6_book_discount_ {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Programming";
        b1.author = "James Gosling";
        b1.price = 500.0;

        b1.applyDiscount();
        b1.displayDetails();
    }
}
