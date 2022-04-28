package 제4장클래스와객체1;


class Pizza{
    int size;
    String type;

    public Pizza(){ // 매개변수가 없는 생성자
        size = 12;
        type = "슈퍼슈프림";
    }

    public Pizza(int s, String t){ // 매개변수가 있는 생성자
        size = s;
        type = t;
    }
}
public class PizzaTest{
    public static void main(String[] args) {
        Pizza obj1 = new Pizza();
        System.out.println("("+obj1.type+ " , "+obj1.size+",)"); // 출력

        Pizza obj2 = new Pizza(24, "포테이토"); // 값넣기
        System.out.println("("+obj2.type+ " , "+obj2.size+",)"); // 출력
    }
}
