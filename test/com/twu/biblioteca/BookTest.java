package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookTest {
    Book book;

    @Before
    public void setUp(){
        book = new Book("The Cat in the Hat", "Dr. Seuss", "1950");
    }

    @Test
    public void shouldReturnTitleAuthorYear(){
        String result = book.getFormattedDetails();

        assertThat(result, is("The Cat in the Hat                      Dr. Seuss           1950"));
    }

    @Test
    public void shouldReturnTitleWhenOnlyTitleIsGiven(){
        Book book = new Book("Book", "", "");
        String result = book.getFormattedDetails();
        assertThat(result, is("Book                                                            "));
    }



}