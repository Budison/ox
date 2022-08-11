package com.github.budison.ox.configuration;

import org.tinylog.Logger;

import java.util.Properties;

class LanguagePrinter implements Printer {

    @Override
    public void print(Properties languageProperties) {
        System.out.print("""
                                
                [1] English
                [2] Deutsch
                                
                """);
        System.out.print(languageProperties.getProperty("LANGUAGE") + ": ");
        Logger.info("LanguagePrinter: printed language prompt");
    }
}
