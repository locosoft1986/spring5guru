package com.jeremy.weasley.spring5guru.repositories;

import com.jeremy.weasley.spring5guru.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
