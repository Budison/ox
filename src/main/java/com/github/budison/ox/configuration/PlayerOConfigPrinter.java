package com.github.budison.ox.configuration;

import org.tinylog.Logger;

import java.util.Properties;

class PlayerOConfigPrinter implements Printer {

    @Override
    public void print(Properties languageProperties) {
        System.out.print("\n" + languageProperties.getProperty("PLAYER_O_CONFIG") + ": ");
        Logger.info("PlayerOConfigPrinter: printed name prompt");
    }
}
