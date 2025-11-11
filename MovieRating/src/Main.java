public class Main {
    public static void main(String[] args){
        Movie movie1 = new Movie("The Hangover", 4);
        Movie movie2 = new Movie("The Godfather", 10);
        Movie movie3 = new Movie("Pulp Fiction", 8);

        movie1.displayRating();
        movie2.displayRating();
        movie3.displayRating();
    }
}
 class Movie {
    String title;
    double rating;

    public Movie (String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public void displayRating() {
        if (rating > 8) {
            System.out.println(title +" est excellent !");
        } else if (rating >= 5 && rating <= 8) {
            System.out.println(title +" est bon.");
        } else {
            System.out.println(title +" est mauvais.");
        }
    }
 }