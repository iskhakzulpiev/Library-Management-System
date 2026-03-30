package com.iskhakzulpiev.librarymanagementsystem;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    
    private List<Book> books = new ArrayList<>();

    public LibraryService() {
        books.add(new Book(1L, "The Epic of Manas", "Traditional", "Epic Poetry"));
        books.add(new Book(2L, "Military Tactics of the Yenisei Kyrgyz Khaganate", "Y. S. Khudiakov", "History"));
        books.add(new Book(3L, "Java Spring Boot Guide", "Craig Walls", "Education / Tech"));
        books.add(new Book(4L, "Clean Code", "Robert C. Martin", "Computer Science"));
    }

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book updateBook(Long id, Book updatedDetails) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                book.setTitle(updatedDetails.getTitle());
                book.setAuthor(updatedDetails.getAuthor());
                book.setGenre(updatedDetails.getGenre());
                return book;
            }
        }
        return null;
    }

    public void deleteBook(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}
