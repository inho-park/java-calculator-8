package calculator.message;

public enum ErrorMessage {
    STRING_NULL_EXCEPTION_MESSAGE("합산할 숫자 배열 공백");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
