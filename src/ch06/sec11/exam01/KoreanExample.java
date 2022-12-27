package ch06.sec11.exam01;

public class KoreanExample {

    public static void main(String[] args) {
        Korean korean = new Korean("123456-1234567", "최진혁");
        System.out.println("korean.nation = " + korean.nation);
        System.out.println("korean.ssn = " + korean.ssn);
        System.out.println("korean.name = " + korean.name);
    }

}
