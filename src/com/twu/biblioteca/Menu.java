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
    private ListBooksCommand listBooksCommand;

    public Menu(PrintStream printStream, BufferedReader bufferedReader, Library library, ListBooksCommand listBooksCommand) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.library = library;
        this.listBooksCommand = listBooksCommand;
    }

    public void displayOptions() {
        printStream.println("Main Menu");
        printStream.println("Select an Option");
        printStream.println("1: List Books \n2: Quit");
    }

    public void chooseOption(){
        boolean shouldContinue = true;

        while (shouldContinue ) {
            int choice = readChoice();

            if(choice == 1 ) {
                listBooksCommand.execute();
            }
            else if(choice == 2){
                shouldContinue = false;
            }
            else {
                printStream.println("Select a valid option!");

            }

        }
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
