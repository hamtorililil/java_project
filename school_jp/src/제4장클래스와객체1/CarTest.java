package 제4장클래스와객체1;

class Car{
    String color;//색상
    int speed;//속도
    int gear;//기어

    @Override
    public String toString(){//toString()메소드는 이클립스에서 자동으로 생성가능
        return "Car [color="+ color + ", speed=" + speed + ", gear=" + gear + "]";
    }


    void changeGear(int g){         gear = g;                   }
    void speedUp(){                 speed = speed + 10;         }
    void speedDown(){               speed = speed - 10;         }
}

public class CarTest {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.changeGear(1);
        myCar.speedUp();
        System.out.println(myCar);
    }
}