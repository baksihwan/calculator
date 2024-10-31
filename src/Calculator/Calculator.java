package Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public void calculate(int firstNum, int secondNum, String operator) {

        if (operator.equals("+")) {
            System.out.println(firstNum + secondNum);
        } else if (operator.equals("-")) {
            System.out.println(firstNum - secondNum);
        } else if (operator.equals("*")) {
            System.out.println(firstNum * secondNum);
        } else if (operator.equals("/")) {
            if (secondNum == 0) {
                System.out.println("0으로는 나눌 수 없습니다.");
            } else {
                System.out.println(firstNum / secondNum);
            }
        } else {
            System.out.println("잘못된 기호를 입력하셨습니다.");
        }
    }
}
















