package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alisonpolton-simon on 9/30/14.
 */
public class BookListBuilder {
    public List<String> setUpBooks() {
        List<String> books = new ArrayList<String>();
        books.add("Clean Code");
        books.add("Agile Samurai");
        books.add("Joy of Cooking");
        return books;
    }
}
