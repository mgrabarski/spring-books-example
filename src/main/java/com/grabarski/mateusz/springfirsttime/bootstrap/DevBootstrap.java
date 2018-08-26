package com.grabarski.mateusz.springfirsttime.bootstrap;

import com.grabarski.mateusz.springfirsttime.models.Author;
import com.grabarski.mateusz.springfirsttime.models.Book;
import com.grabarski.mateusz.springfirsttime.models.Publisher;
import com.grabarski.mateusz.springfirsttime.repositories.AuthorRepository;
import com.grabarski.mateusz.springfirsttime.repositories.BookRepository;
import com.grabarski.mateusz.springfirsttime.repositories.PublisherRepository;
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
    private final PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData() {

        Publisher publisher1 = new Publisher("FakePublisher", "Some address 1");
        publisherRepository.save(publisher1);

        Publisher publisher2 = new Publisher("SomePublisher", "Some address 2");
        publisherRepository.save(publisher2);

        Author andrzej = new Author("Andrzej", "Sapkowski");
        Book lastWish = new Book("Ostatnie życzenie", "123", publisher1);
        andrzej.getBooks().add(lastWish);
        lastWish.getAuthors().add(andrzej);

        authorRepository.save(andrzej);
        bookRepository.save(lastWish);

        Author dimitry = new Author("Dimitry", "Glukhovsky");
        Book metro2033 = new Book("Metro 2033", "1234", publisher2);
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