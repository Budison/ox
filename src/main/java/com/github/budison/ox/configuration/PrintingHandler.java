package com.github.budison.ox.configuration;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.github.budison.ox.Language;
import org.tinylog.Logger;

class PrintingHandler {

    private final Properties languageProperties;
    private final Map<Language, String> languagePropertiesMap;
    private final LanguagePrinter languagePrinter;
    private final WelcomePrinter welcomePrinter;
    private final PlayModePrinter playModePrinter;

    PrintingHandler() {
        languageProperties = new Properties();
        languagePropertiesMap = makeLanguagePropertiesMap();
        setLanguageProperties(Language.EN);
        languagePrinter = new LanguagePrinter();
        welcomePrinter = new WelcomePrinter();
        playModePrinter = new PlayModePrinter();
    }

    private Map<Language, String> makeLanguagePropertiesMap() {
        Map<Language, String> laguagePropertiesMap = new HashMap<>();
        laguagePropertiesMap.put(Language.DE, "Prompts_de_DE.properties");
        laguagePropertiesMap.put(Language.EN, "Prompts_en_US.properties");
        return laguagePropertiesMap;
    }

    void printLanguage() {
        languagePrinter.print(languageProperties);
    }

    Language setLanguageProperties(Language language) {
        try {
            languageProperties.load(PrintingHandler
                    .class
                    .getClassLoader()
                    .getResourceAsStream(languagePropertiesMap.get(language)));
        } catch (IOException ioException) {
            System.err.println("Error: failed to load properties");
            Logger.error("PrintingHandler: failed to load properties");
            return language;
        }

        Logger.info("PrintingHandler: language properties successfully set [languageProperties=" + language + "]");
        return language;
    }

    void printWelcome() {
        welcomePrinter.print(languageProperties);
    }

    void printPlayMode() {
        playModePrinter.print(languageProperties);
    }
}
