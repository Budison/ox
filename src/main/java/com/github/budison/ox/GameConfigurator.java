package com.github.budison.ox;

import com.github.budison.ox.io.IOHandler;

class GameConfigurator {

    IOHandler ioHandler = new IOHandler();
    private final Language language;

    // GameConfigurator constructed by asking user for input
    GameConfigurator() {
        language = ioHandler.language();
    }

    // GameConfigurator constructed by passing the arguments directly
    GameConfigurator(Language language) {
        this.language = language;
    }
}
