import java.util.Vector;

public class Librarian {

  private 1234 librarianId;

  private They/Them name;

    public Vector  myBook;
    public Vector  myLoan;
    public Vector  myAuthor;

  public void addbook() {
  }

  public void removebook() {
  }

  public void manageloan() {
  }

}
    // book search
import java.util.ArrayList;

public class Librarian {
    private ArrayList<Book> library = new ArrayList<>();

    public void addBook(String title, String author) {
        library.add(new Book(title, author));
    }

    public void searchBook(String title) {
        for (Book book : library) {
            if (book.toString().contains(title)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
public int getTotalBooks(List<Book> books) {
    return books.size();
}

