package photo.kwiatkowski.library.io;
import java.util.Scanner;

public class DataReader {
    private Scanner sc  = new Scanner(System.in);
    Book readAndCreateBook(){
        System.out.println("Tytuł");
        String title = sc.nextLine();
        System.out.println("Autor");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo");
        String publisher = sc.nextLine();
        System.out.println("ISBN");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania:");
        int releaseDate = sc.nextLine();
        System.out.println("Liczba Stron:");
        int pages = sc.nextLine();
        sc.nextLine();

        new Book(title, author, releaseDate, pages, publisher, isbn);
    }
}
