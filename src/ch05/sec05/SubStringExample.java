package ch05.sec05;

public class SubStringExample {

    public static void main(String[] args) {
        String CJH = "980521-1111111";

        String firstNum = CJH.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = CJH.substring(7);
        System.out.println(secondNum);
    }

}
