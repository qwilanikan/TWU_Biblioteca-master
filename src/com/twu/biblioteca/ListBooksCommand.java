package com.twu.biblioteca;

/**
 * Created by qwillduvall on 10/6/14.
 */
public class ListBooksCommand {


    private Library library;

    public ListBooksCommand(Library library){

        this.library = library;
    }

    public void execute() {
        library.listBooks();
    }
}
