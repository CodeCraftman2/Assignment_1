public class LibrarySystem {
    public static void main(String[] args) {

        LibraryResource book = new Book("Java Programming", "John Doe", 500);
        LibraryResource magazine = new Magazine("National Geographic", "Various Authors", "March 2024");
        LibraryResource dvd = new DVD("The Shawshank Redemption", "Frank Darabont", 142);


        book.displayDetails();
        System.out.println();
        magazine.displayDetails();
        System.out.println();
        dvd.displayDetails();
    }
}