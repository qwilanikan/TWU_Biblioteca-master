package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainMenuTest {

    @Test
    public void shouldPrintListBooksWhenListBooksIsOnlyOption(){
        PrintStream printStream = mock(PrintStream.class);
        MainMenu menu = new MainMenu(printStream);

        menu.displayOptions();

        verify(printStream).println("List Books");

    }
}