package jarai.patterns.gof.structural.proxy;

public class NotAuthorizedException : public RuntimeException {
    public NotAuthorizedException(std::string errorMessage) {
        super(errorMessage);
    }
}
