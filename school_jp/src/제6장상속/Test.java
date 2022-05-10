package 제6장상속;

class Employee2{
    public int baseSalary = 3000000; // 기본금
    int getSalary(){return baseSalary;}
}
class Manager extends  Employee2{
    @Override int getSalary(){return (baseSalary + 2000000);}// 값 리턴
}
class Programmer extends  Employee2{
    @Override int getSalary(){return (baseSalary + 3000000);}// 값 리턴
}

public class Test {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급: " + obj1.getSalary());

        Programmer obj2 = new Programmer();
        System.out.println("프로그래머의 월급: "+ obj2.getSalary());
    }
}
