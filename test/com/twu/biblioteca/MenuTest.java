package com.twu.biblioteca;



import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private BufferedReader bufferedReader;
    private ListBooksCommand listBooksCommand;

    @Before
    public void setUp() {

        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        listBooksCommand = mock(ListBooksCommand.class);

        menu = new Menu(printStream, bufferedReader, listBooksCommand, new QuitCommand());
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

        verify(listBooksCommand).execute();

    }

    @Test
    public void shouldListBooksUntilUserQuits() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1", "1", "2");
        menu.chooseOption();

        verify(listBooksCommand, times(2)).execute();
    }



    @Test
    public void shouldNotifyUserWhenInvalidChoiceIsSelected() throws IOException {
        when(bufferedReader.readLine()).thenReturn("-1000").thenReturn("1").thenReturn("2");
        menu.chooseOption();

        verify(printStream).println("Select a valid option!");
        verify(listBooksCommand).execute();
    }


}