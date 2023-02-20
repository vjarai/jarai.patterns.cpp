package jarai.patterns.gof.structural.proxy;

public class NotAuthorizedException : public RuntimeException {
    public NotAuthorizedException(string errorMessage) {
        super(errorMessage);
    }
}
