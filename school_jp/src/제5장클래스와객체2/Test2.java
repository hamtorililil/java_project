package 제5장클래스와객체2;

public class Test2 {
    static int number;
    static String s;
    static {// 정적 블록
        number = 23;
        s = "Hello world!";
    }

    public static void main(String[] args) {
        System.out.println("number : " + number);
        System.out.println("s : " + s);
    }
}
