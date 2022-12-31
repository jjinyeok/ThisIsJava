package ch08.sec02;

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl remoteControl = new Television();
        remoteControl.turnOn();

        remoteControl = new Audio();
        remoteControl.turnOn();
    }

}
