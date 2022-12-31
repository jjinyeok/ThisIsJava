package ch09.sec03.exam01;

public class AExample {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.field1);
        System.out.println(A.field2);

        A.B b = new A.B();

    }

}
