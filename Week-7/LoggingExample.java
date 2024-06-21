// Logging Example
import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe message");

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
