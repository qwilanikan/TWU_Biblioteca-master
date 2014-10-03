package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by danielleerickson on 10/3/14.
 */
public class Main {
    public static void main(String[] args) {
        BibliotecaApp bibApp = new BibliotecaApp();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bibApp.run(bufferedReader);
    }
}
