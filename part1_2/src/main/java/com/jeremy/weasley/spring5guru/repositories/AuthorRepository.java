package com.jeremy.weasley.spring5guru.repositories;

import com.jeremy.weasley.spring5guru.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
