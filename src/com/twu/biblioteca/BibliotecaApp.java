package com.twu.biblioteca;



public class BibliotecaApp {


    private MessagePrinter messagePrinter;
    private Menu menu;
    private Library library;

    public BibliotecaApp(MessagePrinter messagePrinter, Menu menu, Library library) {
        this.messagePrinter = messagePrinter;
        this.menu = menu;
        this.library = library;
    }

    public void run(){
        messagePrinter.printWelcome();

        menu.displayOptions();

        menu.chooseOption();

    }


}
