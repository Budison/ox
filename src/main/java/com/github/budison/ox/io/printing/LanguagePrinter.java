package com.github.budison.ox.io.printing;

import org.tinylog.Logger;

class LanguagePrinter implements Printer {

    @Override
    public void print() {
        System.out.print("""
                
                [1] English
                [2] Deutsch
                
                """);
        System.out.print("Please choose a language / Bitte wähle eine Sprache aus: ");
        Logger.info("LanguagePrinter: printed language prompt");
    }
}
