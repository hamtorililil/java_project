package 제4장클래스와객체1;

class boxtest {
    int width;
    int length;
    int height;
    double getVolume(){      return (double) width*height*length;} // 박스 부피 구하고 리턴
}
public class 예제2box{
    public static void main(String[] args){
        boxtest b; // 불러오기
        b = new boxtest();
        b.width = 20; // 값넣기
        b.length = 20;
        b.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.length +
                ", " + b.height + "입니다."); // 출력
        System.out.println("상자의 부피는 " + b.getVolume() + "입니다."); // 출력
    }
}
