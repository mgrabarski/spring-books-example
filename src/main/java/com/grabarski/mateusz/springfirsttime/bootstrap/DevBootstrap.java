package com.grabarski.mateusz.springfirsttime.bootstrap;

import com.grabarski.mateusz.springfirsttime.models.Author;
import com.grabarski.mateusz.springfirsttime.models.Book;
import com.grabarski.mateusz.springfirsttime.repositories.AuthorRepository;
import com.grabarski.mateusz.springfirsttime.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Mateusz Grabarski on 26.08.2018.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    private void initData() {

        Author andrzej = new Author("Andrzej", "Sapkowski");
        Book lastWish = new Book("Ostatnie życzenie", "123", "FakePublisher");
        andrzej.getBooks().add(lastWish);
        lastWish.getAuthors().add(andrzej);

        authorRepository.save(andrzej);
        bookRepository.save(lastWish);

        Author dimitry = new Author("Dimitry", "Glukhovsky");
        Book metro2033 = new Book("Metro 2033", "1234", "SomePublisher");
        dimitry.getBooks().add(metro2033);
        metro2033.getAuthors().add(dimitry);

        authorRepository.save(dimitry);
        bookRepository.save(metro2033);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }
}