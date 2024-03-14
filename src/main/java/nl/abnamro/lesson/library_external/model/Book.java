package nl.abnamro.lesson.library.model;

public class Book {
    private String isbn;

    private String title;

    private String author;

    private int numberOfPages;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
