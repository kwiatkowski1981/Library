package photo.kwiatkowski.library.app;

import photo.kwiatkowski.library.io.DataReader;
import photo.kwiatkowski.library.model.Book;
import photo.kwiatkowski.library.model.Library;

        public class LibraryControl {

              private final int  exit =  0 ;
              private final int  addBook =  1 ;
              private final int  printBooks =  2 ;

              private DataReader dataReader = new DataReader();
              private Library library = new Library();

              public void controlLoop() {
                     int option;

                     do {
                         printOptons();
                         option = dataReader.getInt();
                         switch ( option ) {
                             case addBook:
                                        addBook();
                                    break;
                             case printBooks:
                                        printBooks();
                                    break;
                             case exit:
                                        exit();
                                    break;
                             default:
                                 System.out.println("there is no such option, select again");
                         }
                     } while (option != exit);
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
                System.out.println("exit - exit the program");
                System.out.println("addBook - add new book");
                System.out.println("printBooks - view available books");

            }

        }
