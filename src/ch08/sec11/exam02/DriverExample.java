package ch08.sec11.exam02;

public class DriverExample {

    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.run(new Bus());
        driver.run(new Taxi());
    }

}
