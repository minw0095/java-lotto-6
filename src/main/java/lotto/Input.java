package lotto;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public String inputTotalAmount() {
        System.out.println(MessageUtils.INPUT_BUY_NUMBER);
        return Console.readLine();
    }

    public String inputWinningNumbers() {
        System.out.println(MessageUtils.INPUT_WINNING_NUMBER);
        return Console.readLine();
    }

    public String inputBonusNumber() {
        System.out.println(MessageUtils.INPUT_BONUS_NUMBER);
        return Console.readLine();
    }
}
