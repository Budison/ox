package com.github.budison.ox.configuration;

import com.github.budison.ox.Language;
import com.github.budison.ox.PlayMode;

class IOHandler {

    private final ReadingHandler readingHandler = new ReadingHandler();
    private final PrintingHandler printingHandler = new PrintingHandler();

    Language language() {
        printingHandler.printLanguage();
        return printingHandler.setLanguageProperties(readingHandler.readLanguage());
    }

    void welcome() {
        printingHandler.printWelcome();
    }

    PlayMode playMode() {
        printingHandler.printPlayMode();
        return readingHandler.readPlayMode();
    }
}
