package com.github.budison.ox.configuration;

import java.util.Scanner;

class PlayerNameReader implements Reader<String> {

    private final Scanner scanner;

    PlayerNameReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String read() {
        return ReadingValidator.validateName(scanner, this.getClass().getSimpleName());
    }
}
