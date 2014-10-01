package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookTest {
    Book book;

    @Before
    public void setUp(){
        book = new Book("title", "author", "year");
    }

    @Test
    public void shouldPrintTitleAuthorYear(){
        String result = book.toString();

        assertThat(result, is(String.format("%-40s %-20s %-4s", "title", "author", "year")));
    }


}