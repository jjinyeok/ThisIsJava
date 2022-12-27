package ch06.sec08.exam01;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.powerOn();
        calculator.powerOff();

        int r1 = calculator.plus(1, 2);
        double r2 = calculator.divide(1, 2);

        System.out.println("result1 : " + r1);
        System.out.println("result2 : " + r2);

    }

}
