package ch05.sec04;

public class NullPointerException {

    public static void main(String[] args) {
        int[] intArray = null;
        // intArray[0] = 1; // NullPointException

        String str = null;
        // System.out.println("총 문자 수: " + str.length()); // NullPointException
    }

}
