package ch08.sec09;

public class InterfaceImplExample {

    public static void main(String[] args) {
        InterfaceImpl interfaceImpl = new InterfaceImpl();

        InterfaceA interfaceA = interfaceImpl;
        interfaceA.methodA();
        // interfaceA.methodB();
        System.out.println();

        InterfaceB interfaceB = interfaceImpl;
        // interfaceB.methodA();
        interfaceB.methodB();
        System.out.println();

        InterfaceC interfaceC = interfaceImpl;
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();

    }

}
