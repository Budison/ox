package com.github.budison.ox.configuration;

import org.tinylog.Logger;

import java.util.Properties;

class WelcomePrinter implements Printer {

    @Override
    public void print(Properties languageProperties) {
        System.out.print("\n\n### " + languageProperties.getProperty("WELCOME") + " ###\n\n");
        Logger.info("WelcomePrinter: printed welcome prompt");
    }
}
