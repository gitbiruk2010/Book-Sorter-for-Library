import java.util.Comparator;

// to compare books by author name in alphabetical order
public class AuthorComparator implements Comparator<Book> {

    // to compare two books by their authors
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
    }
}