package org.tekwildisplays.bookcollectiontask15;

import com.sun.source.tree.ReturnTree;

public class Book {
    private String title;

    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
