package com.iskhakzulpiev.librarymanagementsystem;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    // GET Request: Read all books
    @GetMapping("/books")
    public List<Book> getBooks() {
        return libraryService.getAllBooks();
    }

    // POST Request: Create a new book
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        return libraryService.addBook(book);
    }

    // PUT Request: Update a book
    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return libraryService.updateBook(id, book);
    }

    // DELETE Request: Remove a book
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id) {
        libraryService.deleteBook(id);
    }
}