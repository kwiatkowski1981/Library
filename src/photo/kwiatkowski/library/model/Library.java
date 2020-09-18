package photo.kwiatkowski.library.model;

public class Library {

    private static final int MAX_PUBLICATIONS = 2000;
    private int publicationsNumber = 0;
    private  Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public void addBook(Book book) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = book;
            publicationsNumber++;
        }else{
            System.out.println("the maximum number of Books You can add has been reached");
        }
    }

    public void printBooks() {
        int countBooks = 0;
        for (int i = 0; i < publicationsNumber; i++) {
           if (publications[i] instanceof Book) {
               publications[i].printInfo();
                countBooks++;
           }
        }
            if (countBooks == 0) {
            System.out.println("no book has been added yet");
        }
    }

    public void addMagazine(Magazine magazine) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = magazine;
            publicationsNumber++;
        }else{
            System.out.println("the maximum number of Magazines You can add has been reached");
        }
    }

    public void printMagazines() {
        int countMagazines = 0;

        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Magazine) {
               publications[i].printInfo();
               countMagazines++;
            }

        }
        if (countMagazines == 0) {
            System.out.println("no magazine has been added yet");

        }
    }


}
