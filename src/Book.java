
// book with title, author, and year -- implements comparable for natural ordering by title
public class Book implements Comparable<Book> {
    private final String title;
    private final String author;
    private final int year;

    // constructs a book with specified title, author, and year
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    // compares this book to another one by title for natural ordering
    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    // returns string rep of the book
    @Override
    public String toString() {
        return String.format("\"%s\" by %s (%d)", title, author, year);
    }
}