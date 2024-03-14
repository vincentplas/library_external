package nl.abnamro.lesson.library.dao;

import nl.abnamro.lesson.library.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores all the books and provides access to them.
 */
public class BookStorage {
    List<Book> books;

    public BookStorage() {
        books = new ArrayList<Book>();

        books = initializeBookCollection();
    }

    public List<Book> selectAllBooks() {
        return books;
    }

    private List<Book> initializeBookCollection() {
        List<Book> bookCollection = new ArrayList<>();

        Book book1 = new Book("123ad", "A happy java developer", "James Gosling");
        bookCollection.add(book1);

        Book book2 = new Book("asdf", "Patterns of Enterprise Application Architecture", "Martin Fowler");
        bookCollection.add(book2);

        return bookCollection;
    }
}
