package Calculator;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        String input = "";
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("계속 실행하려면 아무키나 누르세요.('exit' 입력시 종료)");
            input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            System.out.println("첫번째 숫자 입력 : ");
            int firstNum = sc.nextInt();  // 첫번째 입력값 기입
            System.out.println("두번째 숫자 입력 : ");
            int secondNum = sc.nextInt(); // 두번째 입력값 기입
            sc.nextLine();
            System.out.println("사칙연산 입력 : ");
            String operator = sc.nextLine();  // 사칙연산 입력값 기입
            calculator.calculate(firstNum, secondNum, operator);

            


        }


    }
}

//        public void Lv1() {
//            char operator;
//            double result;
//            while (true) {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("계속 실행하려면 아무키나 누르세요.('exit' 입력시 종료)");
//                String input = sc.nextLine();
//                if (input.equals("exit")) {
//                    break;
//                }
//                System.out.println("첫번째 숫자 입력 : ");
//                int firstNum = sc.nextInt();  // 첫번째 입력값 기입
//                System.out.println("두번째 숫자 입력 : ");
//                int secondNum = sc.nextInt(); // 두번째 입력값 기입
//                sc.nextLine();
//                System.out.println("사칙연산 입력 : ");
//                operator = sc.next().charAt(0);  // 사칙연산 입력값 기입
//
//                if (operator == '+') {
//                    result = firstNum + secondNum;
//                } else if (operator == '-') {
//                    result = firstNum - secondNum;
//                } else if (operator == '*') {
//                    result = firstNum * secondNum;
//                } else if (operator == '/') {
//                    if (secondNum == 0) {
//                        System.out.println("0으로는 나눌 수 없습니다.");
//                    } else {
//                        System.out.println(firstNum / secondNum);
//                    }
//                } else {
//                    System.out.println("잘못된 기호를 입력하셨습니다.");
//                }
//            }
//        }
