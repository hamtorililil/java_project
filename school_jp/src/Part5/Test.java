package Part5;

public class Test {
    public static int cube(int x){                          // 정적 메소드
        int result = x*x*x;
        return result;
    }
    public static void main(String[] args) {                //정적 메소드
        System.out.println("10*10*10은 "+ cube(10));      //정적 메소드 호출
    }
}
