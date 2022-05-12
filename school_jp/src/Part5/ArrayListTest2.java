package Part5;

import java.util.ArrayList;

class Person{
    String name;
    String tel;

    public Person(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
};

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>(); //(1)
        list.add(new Person("홍길동", "01012345678"));//갑넣기
        list.add(new Person("김유신", "01012942678"));//갑넣기
        list.add(new Person("최자영", "01012342078"));//갑넣기
        list.add(new Person("김영희", "01012345671"));//갑넣기

        for(Person obj : list) //list에 있는 내용 전부 나올때까지?
            System.out.println("(" + obj.name + "," + obj.tel + ")");
    }
}
