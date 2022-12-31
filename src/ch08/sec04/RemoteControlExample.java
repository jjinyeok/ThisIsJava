package ch08.sec04;



public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl remoteControl;

        remoteControl = new Television();
        remoteControl.turnOn();
        remoteControl.setVolume(-1);
        remoteControl.turnOff();

        remoteControl = new Audio();
        remoteControl.turnOn();
        remoteControl.setVolume(11);
        remoteControl.turnOff();
    }

}
