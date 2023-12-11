package ch06.sec06;

public class CarExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Car myCar = new Car();

        System.out.println("제작회사 " + myCar.company);
        System.out.println("모델명 " + myCar.model);
        System.out.println("색상 " + myCar.color);
        System.out.println("최고속도 " + myCar.maxSpeed);
        System.out.println("현재속도 " + myCar.speed);

        // 필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도 " + myCar.speed);

        // 생성자로 필드에 값을 넣기
        Car sCar = new Car("삼성자동차", "SM5", "흰색", 360, 0);

        System.out.println("제작회사 " + sCar.company);
        System.out.println("모델명 " + sCar.model);
        System.out.println("색상 " + sCar.color);
        System.out.println("최고속도 " + sCar.maxSpeed);
        System.out.println("현재속도 " + sCar.speed);

        // 필드 변경
        sCar.speed = 100;

        Car car3 = new Car();

        car3.setCompany("독일자동차");
        car3.setModel("BMW");
        car3.setMaxSpeed(300);
        car3.setCompany("검정색");
        car3.setMaxSpeed(0);

        System.out.println("============================");

        System.out.println("제작회사 " + car3.getCompany());
        System.out.println("모델명 " + car3.getModel());
        System.out.println("색상 " + car3.getCompany());
        System.out.println("최고속도 " + car3.getMaxSpeed());
        System.out.println("현재속도 " + car3.getMaxSpeed());

    }

}