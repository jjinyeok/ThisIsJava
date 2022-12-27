package ch07.sec08.exam02;

import ch07.sec06.package1.B;

public class DriverExample {

    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.drive(new Vehicle());
        driver.drive(new Bus());
        driver.drive(new Taxi());

    }

}
