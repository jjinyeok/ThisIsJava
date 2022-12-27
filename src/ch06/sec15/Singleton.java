package ch06.sec15;

public class Singleton {

    private Singleton() {}

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

}
