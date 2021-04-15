package by.jonline.module4.simplest_class_and_object.task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library("Main Library");
    Book[] books;
    List<Book> expected;

    @BeforeEach
    void setUp() {
        expected = new ArrayList<>();
        books = new Book[] {
                new Book(1.0, "1", "Alice's adventures in Wonderland", "Lewis Carroll", "Publishing House 1", "1954", "100", "soft cover"),
                new Book(2.0, "2", "Robinson Crusoe", "Daniel Defoe", "PublishingHouse 2", "1965", "150", "hard cover"),
                new Book(3.0, "3", "Gulliver's Travels", "Jonathan Swift", "PublishingHouse 2", "1987", "160", "hard cover"),
                new Book(4.0, "4", "Harry Potter 1", "JK Rowling", "Publishing House 1", "1994", "123", "soft cover"),
                new Book(5.0, "5", "Harry Potter 2", "JK Rowling", "Publishing House 2", "1995", "147", "soft cover"),
                new Book(6.0, "6", "Harry Potter 3", "JK Rowling", "Publishing House 3", "1996", "456", "hard cover"),
                new Book(7.0, "7", "Frankenstein, or Modern Prometheus", "Mary Shelley", "Publishing House 1", "2000", "789", "soft cover")
        };

        library.setBooks(books);
    }

    @Test
    void listOfAuthorsBooks() {
        expected.add(books[1]);

        assertEquals(expected, library.listOfAuthorsBooks("Daniel Defoe"));
    }

    @Test
    void listOfBooksByThisPublisher() {
        expected.add(books[0]);
        expected.add(books[3]);
        expected.add(books[6]);

        assertEquals(expected, library.listOfBooksByThisPublisher("Publishing House 1"));
    }

    @Test
    void booksReleasedAfterCertainYear() {
        expected.add(books[5]);
        expected.add(books[6]);

        assertEquals(expected, library.listOfBooksReleasedAfterCertainYear("1995"));
    }
}