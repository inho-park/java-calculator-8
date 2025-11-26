package calculator.message;

public enum InputMessage {
    INPUT_ADDITION_MESSAGE("덧셈할 문자열을 입력해 주세요.");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
