/*
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.

Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */

package by.jonline.module4.simplest_class_and_object.task9;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final String libraryName;
    private Book[] books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public List<Book> listOfAuthorsBooks(String author) {
        List<Book> bookList = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                bookList.add(book);
            }
        }
        return bookList;
    }

    public List<Book> listOfBooksByThisPublisher(String publishingHouse) {
        List<Book> bookList = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                bookList.add(book);
            }
        }
        return bookList;
    }

    public List<Book> listOfBooksReleasedAfterCertainYear(String year) {
        List<Book> bookList = new ArrayList<>();

        int intYear = Integer.parseInt(year);
        for (Book book : books) {
            int intYearOfPublishing = Integer.parseInt(book.getYearOfPublishing());
            if (intYear < intYearOfPublishing) {
                bookList.add(book);
            }
        }
        return bookList;
    }
}
