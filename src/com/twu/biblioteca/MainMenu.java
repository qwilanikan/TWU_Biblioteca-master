package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by danielleerickson on 10/3/14.
 */
public class MainMenu {
    private java.io.PrintStream printStream;

    public MainMenu(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void displayOptions() {

        printStream.println("List Books");
    }
}
