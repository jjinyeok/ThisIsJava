package ch08.sec05;

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl remoteControl = new Television();

        remoteControl.turnOn();

        remoteControl.setMute(true);
        remoteControl.setMute(false);

        System.out.println();

        remoteControl = new Audio();
        remoteControl.turnOn();
        remoteControl.setVolume(5);
        remoteControl.setMute(true);
        remoteControl.setMute(false);
        remoteControl.turnOff();

    }

}
