package se.kth.iv1350.posproj.integration;

import se.kth.iv1350.posproj.exception.InventorySystemException;

/**
 * A simulation for the exception in which the data base can not be reached.
 */
public class DatabaseConnectionException extends java.lang.Exception implements InventorySystemException {
    /**
     * The message that will be dedicated for the developer.
     */
    public DatabaseConnectionException() {
        super("Something went wrong when connecting to the database to retrieve information.");
    }

    /**
     * The message that will be shown for the user.
     * @return <code>String</code> carrying the message.
     */
    @Override
    public String userMessage() {
        return "\nNotice! Connection error which made it not possible to get information,\nplease try again or " +
                "try restarting the program.\n";
    }
}
