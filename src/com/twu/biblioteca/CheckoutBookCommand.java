package com.twu.biblioteca;


public class CheckoutBookCommand implements Command{

    private Library library;

    public CheckoutBookCommand(Library library) {
        this.library = library;

    }

    @Override
    public void execute() {
        library.checkoutBook(library.getBookToCheckOut());
    }
}
