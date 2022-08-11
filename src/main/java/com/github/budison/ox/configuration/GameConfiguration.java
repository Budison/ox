package com.github.budison.ox.configuration;

import com.github.budison.ox.Language;
import com.github.budison.ox.PlayMode;

public class GameConfiguration {

    private final IOHandler ioHandler = new IOHandler();
    private final Language language;
    private final PlayMode playMode;

    // GameConfiguration constructed by asking user for input
    public GameConfiguration() {
        language = ioHandler.language();
        ioHandler.welcome();
        playMode = ioHandler.playMode();
    }

    // GameConfiguration constructed by passing the arguments directly
    public GameConfiguration(Language language, PlayMode playMode) {
        this.language = language;
        this.playMode = playMode;
    }
}
