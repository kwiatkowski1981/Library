package photo.kwiatkowski.library.model;

public class Library {

    private final int maxBooks = 1000;
    private Book[] books = new Book[maxBooks];
    private int booksNumber = 0;
    public void addBook(Book book){
        if (booksNumber > maxBooks) {
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
