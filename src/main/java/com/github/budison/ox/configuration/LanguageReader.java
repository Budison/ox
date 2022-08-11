package com.github.budison.ox.configuration;

import com.github.budison.ox.Language;

import java.util.Scanner;

class LanguageReader implements Reader<Language> {

    private final Scanner scanner;

    public LanguageReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Language read() {
        return Language.values()[ReadingValidator.validateTwoOptions(scanner, this.getClass().getSimpleName()) - 1];
    }
}
