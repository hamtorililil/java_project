package Part7;

interface Drawable3{
    void draw();
    public default void getSize(){
        System.out.println("1024X768 해상도");
    }
}

class Circle3 implements Drawable3{
    int radius;
    public void draw(){
        System.out.println("Circle Draw");
    }
    @Override
    public void getSize(){
        System.out.println("3000x2000 해상도");
    }
}

public class TestClass {
    public static void main(String[] args) {
        Drawable3 d = new Circle3();
        d.getSize();
        d.draw();
    }
}
