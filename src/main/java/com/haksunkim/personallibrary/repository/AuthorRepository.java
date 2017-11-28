package com.haksunkim.personallibrary.repository;

import com.haksunkim.personallibrary.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
