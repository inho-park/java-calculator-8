package calculator.message;

import java.math.BigInteger;

public enum OutputMessage {
    RESULT_HEADER_MESSAGE("결과 : ");
    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage(BigInteger result) {
        return message + result;
    }
}
