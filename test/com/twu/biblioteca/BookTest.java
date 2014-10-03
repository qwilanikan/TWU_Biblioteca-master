package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookTest {
    Book book;

    @Before
    public void setUp(){
        book = new Book("aaaaaaaaaa", "aaaaaaaaaa", "aaaa");
    }

    @Test
    public void shouldReturnTitleAuthorYear(){
        String result = book.getFormattedDetails();

        assertThat(result, is("aaaaaaaaaa                              aaaaaaaaaa          aaaa"));
    }

}