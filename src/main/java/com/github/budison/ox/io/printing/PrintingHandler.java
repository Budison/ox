package com.github.budison.ox.io.printing;


public class PrintingHandler {

    private final LanguagePrinter languagePrinter = new LanguagePrinter();

    public void printLanguage() {
        languagePrinter.print();
    }
}
