package Part6;

class Animal2 {
    void speak() {
        System.out.println("Animal 클래스의 sound()");
    }
}
class Dog2 extends Animal2 {
    void speak() {
        System.out.println("멍멍");
    }
}
class Cat2 extends Animal2 {
    void speak() {
        System.out.println("야옹");
    }
}


public class DynamicCallTest {
    public static void main(String[] args) {
        Animal2 a1 = new Dog2();
        Animal2 a2 = new Cat2();

        a1.speak(); // 어떤 sound()가 호출될 것인지는 실행 시간에 참조되는
        a2.speak(); // 객체의 타입에 따라서 결정된다.
    }
}
