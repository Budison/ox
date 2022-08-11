package com.github.budison.ox;

public enum Language {
    EN("en_US"),
    DE("de_DE");

    private final String label;

    Language(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
