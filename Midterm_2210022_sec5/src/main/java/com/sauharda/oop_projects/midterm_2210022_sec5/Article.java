package com.sauharda.oop_projects.midterm_2210022_sec5;

import java.time.LocalDate;

public class Article {
    private String title, author, articleType, status;
    private int noOfAuthor;
    private LocalDate publicationDate;

    public Article() {
    }

    public Article(String title, String author, String articleType, String status, int noOfAuthor, LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.articleType = articleType;
        this.status = status;
        this.noOfAuthor = noOfAuthor;
        this.publicationDate = publicationDate;
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

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNoOfAuthor() {
        return noOfAuthor;
    }

    public void setNoOfAuthor(int noOfAuthor) {
        this.noOfAuthor = noOfAuthor;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", articleType='" + articleType + '\'' +
                ", status='" + status + '\'' +
                ", noOfAuthor=" + noOfAuthor +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
