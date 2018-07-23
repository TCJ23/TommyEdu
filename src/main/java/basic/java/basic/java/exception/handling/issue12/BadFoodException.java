package basic.java.basic.java.exception.handling.issue12;

public class BadFoodException extends Exception  {
    public BadFoodException() {
    }

    public BadFoodException(Throwable cause) {
        super(cause);
    }
    public BadFoodException(String message, Throwable cause) {
        super(message, cause);
    }


    public BadFoodException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BadFoodException(String message) {
        super(message);
    }
}
