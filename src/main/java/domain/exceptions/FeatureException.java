package domain.exceptions;

public class FeatureException extends Exception {

    public FeatureException(String message) {
        super(message);
    }

    public FeatureException(String message, Throwable cause) {
        super(message, cause);
    }

}