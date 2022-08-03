package com.github.budison.ox.io.reading;

import java.util.Scanner;

public interface Reader<T> {

    Scanner scanner = new Scanner(System.in);
    T read();
}
