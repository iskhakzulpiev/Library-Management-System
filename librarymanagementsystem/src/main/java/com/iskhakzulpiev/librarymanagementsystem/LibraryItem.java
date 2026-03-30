package com.iskhakzulpiev.librarymanagementsystem;

// OOP Concept: Base Class
public class LibraryItem {
    // OOP Concept: Encapsulation (private fields)
    private Long id;
    private String title;

    public LibraryItem(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}