package exception;
import enums.ExceptionEnum;
public class NotFoundCarException extends RuntimeException {
    public NotFoundCarException() {
        super(ExceptionEnum.CAR_NOT_FOUND.name());
    }
}
