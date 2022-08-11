package com.github.budison.ox.configuration;

import com.github.budison.ox.PlayMode;

import java.util.Scanner;

class PlayModeReader implements Reader<PlayMode> {

    private final Scanner scanner;

    public PlayModeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public PlayMode read() {
        return PlayMode.values()[ReadingValidator.validateTwoOptions(scanner, this.getClass().getSimpleName()) - 1];
    }
}
