package com.sauharda.oop_projects.library;

import java.time.LocalDate;

public class Books {
    private String title, author, availability, isbn;
    private LocalDate publish;

    public Books() {
    }

    public Books(String title, String author, String availability, String isbn, LocalDate publish) {
        this.title = title;
        this.author = author;
        this.availability = availability;
        this.isbn = isbn;
        this.publish = publish;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublish() {
        return publish;
    }

    public void setPublish(LocalDate publish) {
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", availability='" + availability + '\'' +
                ", isbn=" + isbn +
                ", publish=" + publish +
                '}';
    }
}
