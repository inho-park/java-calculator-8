package calculator.view;

import static calculator.message.InputMessage.INPUT_ADDITION_MESSAGE;

import calculator.message.InputMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String getInput() {
        System.out.println(INPUT_ADDITION_MESSAGE.getMessage());
        return Console.readLine();
    }
}
