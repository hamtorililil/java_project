package 제4장클래스와객체1;

public class Circle {
    int radius;

    public Circle(int radius){
        this.radius = radius;//this.radius는 필드이고 radius는 매개변수이다
    }
    double getArea(){
        return 3.14*radius*radius;//리턴
    }
}
