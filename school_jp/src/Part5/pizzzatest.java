package Part5;

public class pizzzatest {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Super Supreme");// 값넣기?
        Pizza p2 = new Pizza("Cheese");// 값넣기?
        Pizza p3 = new Pizza("pepperoni");// 값넣기?
        int n = Pizza.count;
        System.out.println("지금까지 판매된 피자 계수 = " + n); // 출력
    }
}
