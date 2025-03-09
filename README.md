
# NSCbookSorter

A Java-based book sorting system for North Seattle College Library, designed to enhance catalog management with dynamic sorting options.

## Sample output Screenshot

![image](https://github.com/user-attachments/assets/4070dad1-92a5-4d32-8528-420c7a4c71bb)

![image](https://github.com/user-attachments/assets/bdb85ee8-6c9a-4ba1-999f-0d3090c52107)

## Features
- **Sort by Title**: Default alphabetical sorting.
- **Sort by Author**: Alphabetical order by author name.
- **Sort by Year**: Descending order (newest first).
- **Chained Sorting**: Sort by author, then by title for same authors.

## Getting Started
1. **Prerequisites**: Java JDK 11+, IntelliJ IDEA (or similar IDE).
2. **Clone/Download**: Add all `.java` files to an IntelliJ project named `NSCbookSorter`.
3. **Run**: Execute `BookSorterDemo.java` to see sorting demonstrations and test cases.

## Usage
Run `BookSorterDemo` to:
- View the original unsorted book list.
- See books sorted by title, author, year, and chained criteria.
- Observe test cases for normal and edge scenarios (e.g., empty lists, duplicate authors).

## Example Output

=== Original Unsorted List ===
"Clean Code" by Robert C. Martin (2008)
"Design Patterns" by Erich Gamma (1994)
...

=== Sorted by Author ===
[Books sorted alphabetically by author...]

=== Test Cases ===
[Test outputs for edge cases...]


## Test Cases
- **Normal**: Title, author, and year sorting using the predefined book list.
- **Edge**: Empty list, single-book list, and books with duplicate authors.

## Contributing
Feel free to fork and enhance the comparators or add new sorting criteria.
