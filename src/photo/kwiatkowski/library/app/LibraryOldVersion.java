package photo.kwiatkowski.library.app;

import photo.kwiatkowski.library.io.DataReader;
import photo.kwiatkowski.library.model.Book;

public class LibraryOldVersion {

    public static void main(String[] args) {

        String appName = "photo.kwiatkowski.library.app.Library.Library v0.8";


        Book[] books = new Book[1000];

        DataReader dataReader = new DataReader();
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();



        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();
    }
}
