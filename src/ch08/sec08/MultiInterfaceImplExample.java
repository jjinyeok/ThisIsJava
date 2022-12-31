package ch08.sec08;

public class MultiInterfaceImplExample {

    public static void main(String[] args) {
        RemoteControl remoteControl = new SmartTelevision();

        remoteControl.turnOn();
        remoteControl.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("https://youtube.com");
    }

}
