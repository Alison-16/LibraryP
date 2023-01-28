import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Librarian> librarians = new ArrayList<>();
        Librarian librarian = new Librarian("Alina");
        Librarian librarian1 = new Librarian("Georgiana");

        librarians.add(librarian);
        librarians.add(librarian1);

        LibrarySystem librarySystem = new LibrarySystem(librarians);
        LibrarySystem librarySystem1 = new LibrarySystem(librarian);

        
    }
}