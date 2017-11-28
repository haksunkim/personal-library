package com.haksunkim.personallibrary;

import com.haksunkim.personallibrary.entity.Author;
import com.haksunkim.personallibrary.entity.Book;
import com.haksunkim.personallibrary.repository.BookRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonalLibraryDAOTests {
    private BookRepository bookRepository;

    @Test
    public void addBookWithAuthor() {
        String[] bookData = {"test book", "test book 2"};
        String[] authorData = {"Author 1", "Author 2", "Author 3"};
        Set<Author> authors = new HashSet<>();

        for (String author: authorData) {
            authors.add(new Author(author));
        }

        for (String bookTitle : bookData) {
            Book book = new Book();
            book.setTitle(bookTitle);
            assertEquals(0, book.getAuthors().size());
            book.setAuthors(authors);
            bookRepository.save(book);

            assertNotNull(authors);
        }
    }

    @Test
    @SuppressWarnings("unchecked")
    public void getBookAuthors() {
        List<Book> books = (List<Book>) bookRepository.findAll();
        assertNotNull(books);

        for (Book book : books) {
            assertNotNull(book.getAuthors());
        }
    }
}
