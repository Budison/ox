package com.github.budison.ox.configuration;

import org.tinylog.Logger;

import java.util.Properties;

class PlayModePrinter implements Printer {

    @Override
    public void print(Properties languageProperties) {
        System.out.print("""
                
                [1] Demo
                [2] 1v1
                
                """);
        System.out.print(languageProperties.getProperty("PLAYMODE") + ": ");
        Logger.info("PlayModePrinter: printed play mode prompt");
    }
}
