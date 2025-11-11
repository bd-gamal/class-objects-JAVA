public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Les misérables", "Victor Hugo", 15.99);
        Book book2 = new Book("Art of War", "Sun Tzu", 23.50);
        Book book3 = new Book("A farewell to arms", "Ernest Hemingway", 8.00);
        book1.display();
        book2.display();
        book3.display();
    }
}

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Titre : "+ title);
        System.out.println("Auteur : "+ author);
        System.out.println("Prix : "+ price +" $");
        System.out.println("---------------------");
    }
}