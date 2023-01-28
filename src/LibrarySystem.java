import java.util.ArrayList;

public class LibrarySystem {
    //List<Librarian>, List<Books>, List<Customer>,
    // numarCarti,numarAngajati, numarCartiImprumutate//

    private ArrayList<Librarian>librarians;
    private ArrayList<Books>books;
    private ArrayList<Customer>customers;
    private int numberOfBooks;
    private int numberOfEmployees;
    private int numberOfBorrowedBooks;

    public LibrarySystem(ArrayList<Librarian>librarians, ArrayList<Books>books, ArrayList<Customer>customers,int numberOfBooks,
                         int numberOfEmployees, int numberOfBorrowedBooks) {
        this.librarians = librarians;
        this.books = books;
        this.customers = customers;
        this.numberOfBooks = numberOfBooks;
        this.numberOfEmployees = numberOfEmployees;
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;

    }
    public LibrarySystem(Librarian librarian, Books book, Customer customer) {
        this.librarians.add(librarian);
        this.books.add(book);
        this.customers.add(customer);
    }

}
