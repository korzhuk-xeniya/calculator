package pro.sky.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DividedException extends IllegalArgumentException {
    private Object httpStatus;

    public  DividedException(String s) {
        super(s);
    }
}
