package com.iskhakzulpiev.librarymanagementsystem;

public class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(Long id, String title, String author, String genre) {
        super(id, title);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
}