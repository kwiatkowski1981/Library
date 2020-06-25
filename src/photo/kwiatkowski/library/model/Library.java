package photo.kwiatkowski.library.model;

public class Library {

    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MAGAZINES = 1000;
    private Book[] books = new Book[MAX_BOOKS];
    private Magazine[] magazines = new Magazine[MAX_MAGAZINES];
    private int booksNumber = 0;
    private int magazinesNumber = 0;

    public void addBook(Book book) {
        if (booksNumber < MAX_BOOKS) {
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

    public void addMagazine(Magazine magazine) {
        if (magazinesNumber < MAX_MAGAZINES) {
            magazines[magazinesNumber] = magazine;
            magazinesNumber++;
        }else{
            System.out.println("the maximum number of Magazines You can add has been reached");
        }
    }

    public void printMagazines() {
        if (magazinesNumber == 0) {
            System.out.println("no magazine has been added yet");

        }
        for (int i = 0; i < magazinesNumber; i++) {
            magazines[i].printInfo();
        }
    }


}
