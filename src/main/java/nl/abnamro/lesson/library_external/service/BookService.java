package nl.abnamro.lesson.library.service;

import nl.abnamro.lesson.library.dao.BookStorage;
import nl.abnamro.lesson.library.model.Book;

import java.util.List;

public class BookService {
    private BookStorage storage;

    public BookService() {
        storage = new BookStorage();
    }

    public List<Book> retrieveAllBooks() {
        return storage.selectAllBooks();
    }
}
