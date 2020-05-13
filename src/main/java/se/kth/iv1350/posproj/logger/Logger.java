package se.kth.iv1350.posproj.logger;

/**
 * Base class for the loggers in the program for the exception that will be handled.
 */
public interface Logger {
    /**
     * Special log for the developer that will be saved into a file.
     */
    public void developerLog();

    /**
     * Show the user that an error happened in the process.
     */
    public void userLog();

    /**
     * Logs both the user and the developer messages.
     */
    public void logException();
}
