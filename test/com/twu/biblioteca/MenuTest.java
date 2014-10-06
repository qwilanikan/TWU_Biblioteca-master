package com.twu.biblioteca;



import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private BufferedReader bufferedReader;
    private Library library;

    @Before
    public void setUp() {

        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        library = mock(Library.class);

        menu = new Menu(printStream, bufferedReader, library);
    }
    @Test
    public void shouldDisplayOptions() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2");
        menu.displayOptions();


        verify(printStream).println("1: List Books \n2: Quit");
    }

    @Test
    public void shouldListBooksWhenUserEntersOne() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1","2");
        menu.chooseOption();

        verify(library).listBooks();

    }

    @Test
    public void shouldListBooksUntilUserQuits() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1", "1", "2");
        menu.chooseOption();

        verify(library,times(2)).listBooks();
    }



    @Test
    public void shouldNotifyUserWhenInvalidChoiceIsSelected() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-1000").thenReturn("1").thenReturn("2");
        menu.chooseOption();

        verify(printStream).println("Select a valid option!");
        verify(library).listBooks();
    }


}