import java.util.Comparator;

// to compare books by author then titles if duplicate authors found
public class AuthorTitleComparator implements Comparator<Book> {

    // to compare two books by author then titlie
    @Override
    public int compare(Book b1, Book b2) {
        int authorCompare = b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
        return (authorCompare != 0) ? authorCompare : b1.compareTo(b2);
    }
}