package com.twu.biblioteca;


import java.io.BufferedReader;
import java.util.ArrayList;

import java.util.List;

public class BibliotecaApp {


    private MessagePrinter messagePrinter;
    private Menu menu;
    private Library library;

    public BibliotecaApp(MessagePrinter messagePrinter, Menu menu, Library library) {
        this.messagePrinter = messagePrinter;
        this.menu = menu;
        this.library = library;
    }

    public void run() {
        messagePrinter.printWelcome();

        menu.displayOptions();

        menu.chooseOption();

    }


}
