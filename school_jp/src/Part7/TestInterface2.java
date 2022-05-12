package Part7;

class Shape2{
    protected int x, y;
}
interface Drawable{
    void draw();
}
class Circle2 extends Shape2 implements Drawable{ //다중상속
    int radius;
    public void draw(){
        System.out.println("Circle Draw at ("+x+", "+y+")");//출력
    }
}

public class TestInterface2 {
    public static void main(String[] args) {
        Drawable obj = new Circle2();
        obj.draw();
    }
}
