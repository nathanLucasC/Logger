package com.sparta;

import java.util.logging.ConsoleHandler;

public class Main {
    public static void main(String[] args) {
        FileHandlerClass.getFileHandler();
        ConsoleClass.runConsole();
        LoggerClass.createLog("INFO", "This is an info message");
        LoggerClass.createLog("WARNING", "This is a warning");

    }
}