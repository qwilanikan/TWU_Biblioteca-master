package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class QuitCommandTest {

    @Test
    public void shouldContinueWhenNotExecuted(){
        QuitCommand quitCommand = new QuitCommand();
        assertThat(quitCommand.shouldContinue(), is(true));
    }

    @Test
    public void shouldQuitWhenExecute(){
        QuitCommand quitCommand = new QuitCommand();
        quitCommand.execute();

        assertThat(quitCommand.shouldContinue(), is(false));
    }
}