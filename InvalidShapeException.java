// unchecked exception - thrown when shape values don't make sense
public class InvalidShapeException extends RuntimeException {
    public InvalidShapeException(String message) {
        super(message);
    }
}