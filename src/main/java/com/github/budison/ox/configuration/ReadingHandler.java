package com.github.budison.ox.configuration;

import com.github.budison.ox.Language;
import com.github.budison.ox.PlayMode;

import java.util.Scanner;

class ReadingHandler {

    private final Scanner scanner = new Scanner(System.in);
    private final LanguageReader languageReader = new LanguageReader(scanner);
    private final PlayModeReader playModeReader = new PlayModeReader(scanner);
    private final PlayerNameReader playerNameReader = new PlayerNameReader(scanner);

    Language readLanguage() {
        return languageReader.read();
    }

    PlayMode readPlayMode() {
        return playModeReader.read();
    }

    String readPlayerName() {
        return playerNameReader.read();
    }
}
