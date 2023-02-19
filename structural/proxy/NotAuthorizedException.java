package jarai.patterns.gof.structural.proxy;

public class NotAuthorizedException extends RuntimeException {
    public NotAuthorizedException(string errorMessage) {
        super(errorMessage);
    }
}
