package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by alisonpolton-simon on 10/1/14.
 */
public class MessagePrinter {
    PrintStream printStream;

    public MessagePrinter(PrintStream out) {
        this.printStream = out;
    }

    public void printWelcome() {
        printStream.println("Welcome to Biblioteca!");
    }
}
