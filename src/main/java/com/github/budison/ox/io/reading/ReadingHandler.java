package com.github.budison.ox.io.reading;

import com.github.budison.ox.Language;

public class ReadingHandler {

    private final LanguageReader languageReader = new LanguageReader();

    public Language readLanguage() {
        return languageReader.read();
    }
}
