package ch05.sec05;

public class LengthExample {

    public static void main(String[] args) {
        String CJH = "9805211111111";
        int length = CJH.length();
        if(length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        }
        else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }

}
