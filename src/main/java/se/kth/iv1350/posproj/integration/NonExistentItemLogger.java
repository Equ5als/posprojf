package se.kth.iv1350.posproj.integration;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


import se.kth.iv1350.posproj.logger.Logger;

/**
 * The logger saves the item not found exception to a file.
 */
public class NonExistentItemLogger implements Logger {
    private PrintWriter logWriter;
    private NonExistentItemException exception;

    /**
     * Initiate the logger plus having the file ready to write the data in.
     */
    public NonExistentItemLogger() {
        this.exception = new NonExistentItemException();
        try {
            logWriter = new PrintWriter(new FileWriter("log.txt",true), true);
        } catch (IOException ioe) {
            System.out.println("CAN NOT LOG.");
            ioe.printStackTrace();
        }
    }

    /**
     * Write the developer log on the file.
     */
    @Override
    public void developerLog() {
        exception.printStackTrace(logWriter);
    }

    /**
     * Print out the error that happened to the user.
     */
    @Override
    public void userLog() {
        System.out.println(exception.userMessage());
    }

    /**
     * Logs both the user and the developer messages.
     */
    @Override
    public void logException() {
        userLog();
        developerLog();
    }
}
