package 제5장클래스와객체2;
class pizza{
    int radius;

    pizza(int r){
        radius = r;
    }
    pizza whosLargest(pizza p1, pizza p2){
        if (p1.radius > p2.radius)// 크기 비교해서 큰값을 리턴
            return p1;// p1리턴
        else
            return p2;// p2리턴

    }
}


public class PizzaTest {
    public static void main(String[] args) {
        pizza obj1 = new pizza(14);// 피자 크기 넣기
        pizza obj2 = new pizza(18);// 피자 크기 넣기

        pizza largest = obj1.whosLargest(obj1, obj2);
        System.out.println(largest.radius + "인치 피자가 더큼.");
    }
}
