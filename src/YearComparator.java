import java.util.Comparator;

// to compare books by year recent year comes first
public class YearComparator implements Comparator<Book> {

    // to compare two books by year in desc order
    @Override
    public int compare(Book b1, Book b2) {
        return Integer.compare(b2.getYear(), b1.getYear());
    }
}