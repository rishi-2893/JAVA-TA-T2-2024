https://chatgpt.com/share/ced4a7d6-c5a1-4828-ac20-d26abe654521

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger("LoggingExample");

    public static void main(String[] args) {
        // Set the logging level to ALL to capture all levels of logging messages
        logger.setLevel(Level.ALL);

        // Create a ConsoleHandler to output logs to console
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL); // Set the handler level to ALL to capture all levels

        // Add the console handler to the logger
        logger.addHandler(consoleHandler);

        // Log messages at different levels
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe message");
        logger.fine("This is fine level");

        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Error occurred while dividing", e);
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}