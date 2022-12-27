package ch06.sec13.exam03.package1;

public class A {

    public int field1;
    int field2;
    private int field3;

    public A() {
        this.field1 = 1; // O
        this.field2 = 1; // O
        this.field3 = 1; // O

        this.method1(); // O
        this.method2(); // O
        this.method3(); // O
    }

    public void method1() {}
    void method2() {}
    private void method3() {}
}
