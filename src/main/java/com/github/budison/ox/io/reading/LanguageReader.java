package com.github.budison.ox.io.reading;

import com.github.budison.ox.Language;
import org.tinylog.Logger;

class LanguageReader implements Reader<Language> {

    @Override
    public Language read() {
        boolean repeat = true;
        int inputInt = 1;
        while (repeat) {
            String inputString = scanner.next();
            try {
                repeat = false;
                inputInt = Integer.parseInt(inputString);
                if (inputInt != 1 && inputInt != 2) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException illegalArgumentException) {
                System.err.print("Invalid input! Try again / Falsche Eingabe! Bitte versuche es erneut: ");
                Logger.info("LanguageReader: invalid input [input=" + inputString + "]");
                repeat = true;
            }
        }
        scanner.close();
        Logger.info("LanguageReader: read input successfully [input=" + inputInt + "]");
        return Language.values()[inputInt - 1];
    }
}
