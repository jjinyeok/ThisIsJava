package ch06.sec10.exam01;

public class CalculatorExample {

    public static void main(String[] args) {

        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(1, 2);
        double result3 = Calculator.divide(1, 2);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);

    }

}
