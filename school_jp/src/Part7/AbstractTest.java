package Part7;

abstract class Shape{
    int x,y;
    public void translate(int x, int y){
        // 추상클래스라고 하더라도 추상메소드가
        // 아닌 보통의 메소드도 가질 수 있음을 유의하라.
        this.x = x;
        this.y = y;
    }
    public abstract void draw();// 추상 메소드를 선언
    //추상 메소드를 하나라도 가지면 추상 클래스가된다.
    //추상 메소드를 가지고 있는데도 abstract를 class 앞에
    //붙이지 않으면 컴파일 오류가 발생한다.
};

class Rectangle extends Shape{

    int width, height;
    public void draw(){
        System.out.println("사각형 그리기 메소드");
        //자식 클래스 Rectangle에서 부모 클래스의 추상 메소드 draw()가
        //실제로 메소드로 구현한다. 자식 클래스에서 추상 메소드를 구현하지 않으면
        //컴파일 오류가 발생한다.
    }
};

class Circle extends Shape {
    int radius;
    public void draw(){
        System.out.println("원 그리기 메소드");
    }
};

public class AbstractTest {
    public static void main(String[] args) {
       // Shape s1 = new Shape(); //오류!! 추상 클래스로 객체를 생성할 수는 없다.
        Shape s2 = new Circle();  //OK!
        s2.draw();
    }
}
