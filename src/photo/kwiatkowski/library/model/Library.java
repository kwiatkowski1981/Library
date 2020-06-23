package photo.kwiatkowski.library.model;

public class Library {

    private static final int MaxBooks = 1000;
    private Book[] books = new Book[MaxBooks];
    private int booksNumber = 0;

    public void addBook(Book book) {
        if (booksNumber < MaxBooks) {
            books[booksNumber] = book;
            booksNumber++;
        }else{
            System.out.println("the maximum number of Books You can add has been reached");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("no book has been added yet");

        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }
}
