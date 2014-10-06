package com.twu.biblioteca;

public class ListBooksCommand implements Command {


    private Library library;

    public ListBooksCommand(Library library){

        this.library = library;
    }

    public void execute() {
        library.listBooks();
    }
}
