package com.haksunkim.personallibrary.repository;

import com.haksunkim.personallibrary.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
