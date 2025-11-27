package calculator.message;

public enum ErrorMessage {
    NUMBER_LIST_NULL_EXCEPTION_MESSAGE("합산할 숫자 배열 공백"),
    SEPARATOR_NULL_EXCEPTION_MESSAGE("분리대상 문자열 비어있음 : "),
    CUSTOM_EXCEPTION_MESSAGE("커스텀 구분자 점검 필요 : "),
    NUMBER_STR_NULL_EXCEPTION_MESSAGE("합산할 숫자 문자열 생성을 위한 문자열 공백"),
    INVALID_EXCEPTION_MESSAGE("연산 식에는 양수와 구분자만 필요 : "),
    SEPARATOR_FRONT_EXCEPTION_MESSAGE("구분자 검증 오류 : "),
    SEPARATOR_REAR_EXCEPTION_MESSAGE(", 유효하지 않은 구분자 : ");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getMessage(String input) {
        return message + input;
    }
}
