package com.github.budison.ox.configuration;

import org.tinylog.Logger;

import java.util.Scanner;

class ReadingValidator {

    static int validateTwoOptions(Scanner scanner, String callerClassName) {
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
                System.err.println("[INVALID INPUT]: " + inputString);
                Logger.info(callerClassName + ": invalid input [input=" + inputString + "]");
                repeat = true;
            }
        }
        Logger.info(callerClassName + ": read input successfully [input=" + inputInt + "]");
        return inputInt;
    }
}
