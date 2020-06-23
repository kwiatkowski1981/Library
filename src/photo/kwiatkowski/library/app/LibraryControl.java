package photo.kwiatkowski.library.app;

import photo.kwiatkowski.library.io.DataReader;
import photo.kwiatkowski.library.model.Book;
import photo.kwiatkowski.library.model.Library;

        public class LibraryControl {

              private static final int EXIT =  0 ;
              private static final int ADD_BOOK =  1 ;
              private static final int PRINT_BOOKS =  2 ;

              private DataReader dataReader = new DataReader();
              private Library library = new Library();

              public void controlLoop() {
                     int option;

                     do {
                         printOptons();
                         option = dataReader.getInt();
                         switch ( option ) {
                             case ADD_BOOK:
                                        addBook();
                                    break;
                             case PRINT_BOOKS:
                                        printBooks();
                                    break;
                             case EXIT:
                                        exit();
                                    break;
                             default:
                                 System.out.println("there is no such option, select again");
                         }
                     } while (option != EXIT);
              }

            private void exit() {
                System.out.println("End of programm, bye bye");
                dataReader.close();
            }

            private void printBooks() {
                  library.printBooks();
            }

            private void addBook() {
                  Book book = dataReader.readAndCreateBook();
                  library.addBook(book);
            }

            private void printOptons() {
                System.out.println("Choose Option:");
                System.out.println("0 - exit the program");
                System.out.println("1 - add new book");
                System.out.println("2 - view available books");

            }

        }


