package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.Buffer;

/**
 * Created by danielleerickson on 10/3/14.
 */
public class Menu {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Library library;

    public Menu(PrintStream printStream, BufferedReader bufferedReader, Library library) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.library = library;
    }

    public void displayOptions() {
        printStream.println("Main Menu");
        printStream.println("Select an Option");
        printStream.println("1: List Books");
    }

    public void chooseOption(){
        int choice = readChoice();
        while (choice != 1) {
            printStream.println("Select a valid option!");
            choice = readChoice();
        }
        library.listBooks();
    }

    private int readChoice() {
        int choice = 1;
        try {
            choice = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return choice;
    }
}
