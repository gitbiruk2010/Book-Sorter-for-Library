import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSorter {
    private static List<Book> sampleBooks;

    public static void main(String[] args) {
        System.out.println("North Seattle College Library Book Sorter\n");
        sampleBooks = createSampleBooks();

        // Display original list
        System.out.println("=== Original Unsorted List ===");
        printBooks(sampleBooks);

        // Run all tests
        System.out.println("\n=== Running Test Cases ===");
        runNormalTestCases();
        runEdgeTestCases();
    }

    // Create sample books (with duplicates for testing)
    private static List<Book> createSampleBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code", "Robert C. Martin", 2008));
        books.add(new Book("Design Patterns", "Erich Gamma", 1994));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 1999));
        books.add(new Book("Introduction to Algorithms", "Thomas H. Cormen", 2009));
        books.add(new Book("Structure and Interpretation of Computer Programs", "Harold Abelson", 1996));
        books.add(new Book("Refactoring", "Martin Fowler", 1999));
        books.add(new Book("Code Complete", "Steve McConnell", 2004));
        books.add(new Book("Head First Design Patterns", "Eric Freeman", 2004));
        books.add(new Book("Another Design Patterns", "Erich Gamma", 2000)); // Duplicate author
        return books;
    }

    // Normal Test Cases
    private static void runNormalTestCases() {
        System.out.println("\n--- Normal Test Cases ---");
        testDefaultSorting_Normal();
        testAuthorSorting_Normal();
        testYearSorting_Normal();
    }

    // Edge Test Cases
    private static void runEdgeTestCases() {
        System.out.println("\n--- Edge Test Cases ---");
        testEmptyList_Edge();
        testSameAuthor_Edge();
        testSingleBook_Edge();
    }

    // normal tests
    private static void testDefaultSorting_Normal() {
        System.out.println("\nTest 1: Default Sorting (Title)");
        List<Book> testBooks = new ArrayList<>(sampleBooks);

        System.out.println("Before Sorting:");
        printBooks(testBooks);

        Collections.sort(testBooks); // Sort by title

        System.out.println("\nAfter Sorting:");
        printBooks(testBooks);
    }

    private static void testAuthorSorting_Normal() {
        System.out.println("\nTest 2: Author Sorting");
        List<Book> testBooks = new ArrayList<>(sampleBooks);

        System.out.println("Before Sorting:");
        printBooks(testBooks);

        Collections.sort(testBooks, new AuthorComparator());

        System.out.println("\nAfter Sorting:");
        printBooks(testBooks);
    }

    private static void testYearSorting_Normal() {
        System.out.println("\nTest 3: Year Sorting (Newest First)");
        List<Book> testBooks = new ArrayList<>(sampleBooks);

        System.out.println("Before Sorting:");
        printBooks(testBooks);

        Collections.sort(testBooks, new YearComparator());

        System.out.println("\nAfter Sorting:");
        printBooks(testBooks);
    }
    // edge tests
    private static void testEmptyList_Edge() {
        System.out.println("\nTest 4: Empty List (Edge Case)");
        List<Book> testBooks = new ArrayList<>();
        System.out.println("Before Sorting (Empty List):");
        printBooks(testBooks);

        Collections.sort(testBooks); // no-op for empty list

        System.out.println("\nAfter Sorting:");
        printBooks(testBooks);
    }

    private static void testSameAuthor_Edge() {
        System.out.println("\nTest 5: Same Author (Edge Case)");
        // extract books by "Erich Gamma"
        List<Book> testBooks = new ArrayList<>();
        for (Book book : sampleBooks) {
            if (book.getAuthor().equalsIgnoreCase("Erich Gamma")) {
                testBooks.add(book);
            }
        }

        System.out.println("Before Sorting:");
        printBooks(testBooks);

        Collections.sort(testBooks, new AuthorTitleComparator());

        System.out.println("\nAfter Sorting:");
        printBooks(testBooks);
    }

    private static void testSingleBook_Edge() {
        System.out.println("\nTest 6: Single Book (Edge Case)");
        List<Book> testBooks = new ArrayList<>();
        testBooks.add(sampleBooks.get(0)); // Add "Clean Code"

        System.out.println("Before Sorting:");
        printBooks(testBooks);

        Collections.sort(testBooks);

        System.out.println("\nAfter Sorting:");
        printBooks(testBooks);
    }

    private static void printBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("(No books in list)");
        } else {
            books.forEach(System.out::println);
        }
    }
}