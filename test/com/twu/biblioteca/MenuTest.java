package com.twu.biblioteca;



import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() {

        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        menu = new Menu(printStream, bufferedReader);
    }
    @Test
    public void shouldDisplayListBooksWhenListBooksIsOnlyOption(){

        menu.displayOptions();

        verify(printStream).println("1: List Books");

    }

    @Test
    public void shouldReturnOneWhenUserEntersOne() throws IOException {

        when(bufferedReader.readLine()).thenReturn("1");
        int choice = menu.chooseOption();

        assertThat(choice, is(1));
    }

//    @Test
//    public void shouldakjsdhflaksjhd(){
//        menu.selectOption(1);
//        verify(menu.)
//    }


}