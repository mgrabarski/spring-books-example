package com.grabarski.mateusz.springfirsttime.repositories;

import com.grabarski.mateusz.springfirsttime.models.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Mateusz Grabarski on 26.08.2018.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
