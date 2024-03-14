package nl.abnamro.lesson.library.controller;

import nl.abnamro.lesson.library.model.Book;
import nl.abnamro.lesson.library.service.BookService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.List;

@Path("/")
public class LibraryController {
    private final static BookService bookService = new BookService();

    @GET
    @Path("/library/v1")
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveAllBooks() {
        Response response = null;

        List<Book> books = bookService.retrieveAllBooks();

        String booksInformation = convertBookListToString(books);
        response = Response.status(Status.OK).entity(booksInformation).build();

        return response;
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public Response returnHello() {
        return Response.status(Status.OK).entity("hello").build();
    }

    private String convertBookListToString(List<Book> bookList) {
        StringBuilder text = new StringBuilder();

        text.append("books: " + bookList.size());
        for (Book book : bookList) {
            text.append("\n\ttitle: " + book.getTitle());
            text.append(" \tauthor: " + book.getAuthor());
        }

        return text.toString();
    }
}
