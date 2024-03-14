package nl.abnamro.lesson.library.application;

import nl.abnamro.lesson.library.controller.LibraryController;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class LibraryApplication extends Application {
    @Override
    public Set<Object> getSingletons() {
        Set<Object> singletons = new HashSet<>();

        singletons.add(new LibraryController());

        return singletons;
    }
}
