package com.github.budison.ox.configuration;

import com.github.budison.ox.Language;
import com.github.budison.ox.PlayMode;

public class GameConfiguration {

    private final IOHandler ioHandler = new IOHandler();
    private final Language language;
    private final PlayMode playMode;
    private final Player playerO;
    private final Player playerX;

    // GameConfiguration constructed by asking user for input
    public GameConfiguration() {
        language = ioHandler.language();
        ioHandler.welcome();
        playMode = ioHandler.playMode();
        playerO = new Player(ioHandler.playerO(), "O");
        playerX = new Player(ioHandler.playerX(), "O");
    }
}
