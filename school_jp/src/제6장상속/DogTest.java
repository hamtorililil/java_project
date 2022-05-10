package 제6장상속;

class Animal{
    int age;
    void eat(){
        System.out.println("먹고 있음...");
    }
}

class Dog extends Animal{
    void back(){
        System.out.println("짖고 있음...");
    }
}

public class DogTest {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.back();
        d.eat();
    }
}
