package com.grabarski.mateusz.springfirsttime.repositories;

import com.grabarski.mateusz.springfirsttime.models.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Mateusz Grabarski on 26.08.2018.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
