package exception;
import enums.ExceptionEnum;
public class NotFoundCustomerException extends RuntimeException{
    public NotFoundCustomerException() {
        super(ExceptionEnum.CUSTOMER_NOT_FOUND.name());
    }
}
