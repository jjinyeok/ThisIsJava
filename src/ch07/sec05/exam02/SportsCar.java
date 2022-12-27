package ch07.sec05.exam02;

public class SportsCar extends Car{

    @Override
    public void speedUp() {
        speed += 2;
    }

    // 오버라이딩을 할 수 없음 : final 메서드
//    @Override
//    public final void stop() {
//        System.out.println("차를 멈춤");
//        speed = 0;
//    }

}
