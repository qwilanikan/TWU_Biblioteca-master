package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.nio.Buffer;

/**
 * Created by danielleerickson on 10/3/14.
 */
public class MainMenu {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    public MainMenu(PrintStream printStream, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public void displayOptions() {
        printStream.println("Main Menu");
        printStream.println("Select an Option");
        printStream.println("1: List Books");
    }

    public int receiveUserOptionChoice() {
        return 1;
    }
}
