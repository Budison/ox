package com.github.budison.ox.io;

import com.github.budison.ox.Language;
import com.github.budison.ox.io.printing.PrintingHandler;
import com.github.budison.ox.io.reading.ReadingHandler;

public class IOHandler {

    private final ReadingHandler readingHandler = new ReadingHandler();
    private final PrintingHandler printingHandler = new PrintingHandler();

    public Language language() {
        printingHandler.printLanguage();
        return readingHandler.readLanguage();
    }
}
