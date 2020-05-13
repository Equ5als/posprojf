package se.kth.iv1350.posproj.integration;

import se.kth.iv1350.posproj.exception.InventorySystemException;

/**
 * The exception that will represent the item which it is not in the data base.
 */
public class NonExistentItemException extends java.lang.Exception implements InventorySystemException {
    /**
     * The message that will be for the developer.
     */
    public NonExistentItemException() {
        super("Invalid identifier entered for an item that does not exist in the database.");
    }

    /**
     * The message dedicated for the user.
     * @return <code>String</code> with the message.
     */
    @Override
    public String userMessage() {
        return "\nNotice! The product was not found, \nplease check if you entered a correct identifier.\n";
    }
}
