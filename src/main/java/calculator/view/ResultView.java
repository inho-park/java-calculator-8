package calculator.view;

import static calculator.message.OutputMessage.RESULT_HEADER_MESSAGE;

import java.math.BigInteger;

public class ResultView {
    public void printResult(BigInteger result) {
        System.out.print(RESULT_HEADER_MESSAGE.getMessage(result));
    }
}
