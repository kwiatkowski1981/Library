package photo.kwiatkowski.library.io;
import photo.kwiatkowski.library.model.Book;
import photo.kwiatkowski.library.model.Magazine;

import java.util.Scanner;

public  class DataReader {

      private Scanner sc  = new Scanner(System.in);

        public  Book readAndCreateBook(){

                    System.out.println("Proszę wpisać kolejno:");

                     System.out.println("Tytuł:");
                     String title = sc.nextLine();
                     System.out.println("Autor:");
                     String author = sc.nextLine();
                     System.out.println("Wydawnictwo:");
                     String publisher = sc.nextLine();
                     System.out.println("ISBN:");
                     String isbn = sc.nextLine();
                     System.out.println("Rok wydania:");
                     int releaseDate = sc.nextInt();
                     System.out.println("Liczba Stron:");
                     int pages = sc.nextInt();

                     return new Book(title, author, releaseDate, pages, publisher, isbn);
         }

         public Magazine readAndCreateMagazine(){

                     System.out.println("Proszę wpisać kolejno:");

                     System.out.println("Tytuł:");
                     String title = sc.nextLine();
                     System.out.println("Wydawnictwo:");
                     String publisher = sc.nextLine();
                     System.out.println("Jezyk:");
                     String language = sc.nextLine();
                     System.out.println("Rok wydania:");
                     int year = sc.nextInt();
                     System.out.println("Miesiąc:");
                     int month = sc.nextInt();
                     System.out.println("Dzień:");
                     int day = sc.nextInt();
                     sc.nextLine();

                     return new Magazine(title, publisher, language, year, month, day);
                     }
                     public void close() {
                 sc.close();
         }

         public int getInt() {
                int number = sc.nextInt();
                sc.nextLine();
                return number;

    }
}
