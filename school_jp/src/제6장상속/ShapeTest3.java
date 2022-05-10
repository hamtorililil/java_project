package 제6장상속;

class Shape3{
        protected int x, y;
        public void draw(){
            System.out.println("Shape Draw");
        }//각도형들은 2차원 공간에서 도형의 위치를 나타내는 기준점(x,y)을 가진다.
         //이것은 모든 도형에 공통적인 속성이므로 부모 클래스인 Shape에 저장한다.
}
class Rectangle3 extends Shape3{
    protected int width, height;
    public void draw(){
        System.out.println("Rectangle Draw");
    }//이어서 Shape에서 상속받아서 사각형을 나타내는 클래스
     //Rectangle을 정의하여보자. Rectangle은 추가적으로 width
     //와 height 변수를 가진다. Shape 클래스이 draw()를 사각형을
     //그리도록 재정의한다. 물론 실제 그래픽은 아직까지 사용할 수 없
     //으므로 화면에 사각형을 그린다는 메세지만을 출력한다.
}
class Triangle3 extends Shape3{
    protected int base, height;
    public void draw(){
        System.out.println("Triangle Draw");
    }//서브 클래스인 Triangle을 Shape 클래스에서 상속받아 만든다.
}

class Circle3 extends Shape3{
    protected int radius;
    public void draw(){
        System.out.println("Circle Draw");
    }
}


public class ShapeTest3 {
    public static void main(String[] args) {
        Shape3 s1, s2;

        s1 = new Shape3();     // ① 당연하다.
        s2 = new Rectangle3(); // ② Rectangle 객체를 Shape 변수로 가리킬 수 있을까?
    }
}
