package ch07.sec10.exam01;

public class PhoneExample {

    public static void main(String[] args) {

        // Phone phone = new Phone("홍길동"); 추상클래스 (abstract class)는 객체를 생성할 수 없음
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }

}
