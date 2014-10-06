package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {
    List<Book> books;
    private Book book1;

    @Test
    public void shouldPrintWelcomeAndDisplayOptionsAndCallChooseOption(){

        books = new ArrayList<Book>();
        book1 = mock(Book.class);
        books.add(book1);
        Library library = mock(Library.class);
        Menu menu = mock(Menu.class);
        MessagePrinter messagePrinter = mock(MessagePrinter.class);

        BibliotecaApp bib = new BibliotecaApp(messagePrinter, menu, library);
        bib.run();

        verify(messagePrinter).printWelcome();
        verify(menu).displayOptions();
        verify(menu).chooseOption();

    }


}