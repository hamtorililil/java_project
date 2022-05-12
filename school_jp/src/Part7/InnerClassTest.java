package Part7;

class OuterClass{
    private int value = 10;

    class InnerClass{
        private void myMethod(){
            System.out.println("외부 클래스의 private 변수 값: " + value);
        }//이것이 바로 내부 클래스이다. 내부 클래스 안에서는
         //외부 클래스의 private 변수들을 참조할 수 있다.
    }

    OuterClass(){
        InnerClass obj = new InnerClass();//내부 클래스를 사용
        obj.myMethod();
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
    }
}
