package ch08.sec13;

public class SealedExample {

    public static void main(String[] args) {
        InterfaceA interfaceA;
        InterfaceB interfaceB;
        InterfaceC interfaceC;

        ImplClass implClass = new ImplClass();

        interfaceA = implClass;
        interfaceA.methodA();
        System.out.println();

        interfaceB = implClass;
        interfaceB.methodA();
        interfaceB.methodB();
        System.out.println();

        interfaceC = implClass;
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
    }

}
