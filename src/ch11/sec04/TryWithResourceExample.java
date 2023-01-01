package ch11.sec04;

public class TryWithResourceExample {

    public static void main(String[] args) {
        try (MyResource myResource = new MyResource("A")) {
            String data = myResource.read1();
            int value = Integer.parseInt(data);
        }
        catch (Exception e) {
            System.out.println("예외 처리 : " + e.getMessage());
        }

        System.out.println();

        try (MyResource myResource = new MyResource("A")) {
            String data = myResource.read2();
            int value = Integer.parseInt(data);
        }
        catch (Exception e) {
            System.out.println("예외 처리 : " + e.getMessage());
        }

        System.out.println();

        MyResource myResource1 = new MyResource("A");
        MyResource myResource2 = new MyResource("B");
        try (myResource1; myResource2) {
            String data1 = myResource1.read1();
            String data2 = myResource2.read2();
            int value = Integer.parseInt(data2);
        }
        catch (Exception e) {
            System.out.println("예외 처리 : " + e.getMessage());
        }
    }

}
