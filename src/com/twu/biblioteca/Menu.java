package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;

public class Menu {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Map<Integer, Command> commands;
    private QuitCommand quitCommand;

    public Menu(PrintStream printStream, BufferedReader bufferedReader, Map<Integer, Command> commands, QuitCommand quitCommand) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.commands = commands;
        this.quitCommand = quitCommand;
    }

    public void displayOptions() {
        printStream.println("Main Menu");
        printStream.println("Select an Option");
        printStream.println("1: List Books \n2: Quit");
    }

    public void chooseOption(){

        while (quitCommand.shouldContinue() ) {
            int choice = readChoice();

            if(choice == 1 ) {
                commands.get(1).execute();
            }
            else if(choice == 2){
                quitCommand.execute();
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
