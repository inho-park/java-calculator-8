package calculator.model;

import static calculator.message.ErrorMessage.STRING_NULL_EXCEPTION_MESSAGE;

import java.math.BigInteger;
import java.util.List;

public class Calculator {
    private BigInteger result;

    public Calculator() {
        result = new BigInteger("0");
    }

    public BigInteger getSum(List<String> intList) {
        if (intList.isEmpty()) {
            throw new RuntimeException(STRING_NULL_EXCEPTION_MESSAGE.getMessage());
        } else {
            intList.forEach(s -> {
                result = result.add(new BigInteger(s));
            });
            return result;
        }
    }
}
