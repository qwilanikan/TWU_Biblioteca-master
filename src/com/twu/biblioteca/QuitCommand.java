package com.twu.biblioteca;

public class QuitCommand implements Command {

    private boolean shouldContinue = true;

    public void execute() {
        shouldContinue = false;
    }

    public boolean shouldContinue() {
        return shouldContinue;
    }
}
