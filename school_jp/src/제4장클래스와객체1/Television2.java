package 제4장클래스와객체1;

public class Television2 {
    private int channel; //채널 번호
    private int volume;  // 볼륨
    private boolean onOff; // 전원 상태

    Television2(int c, int v, boolean o){
        channel = c; //선언
        volume = v; //선언
        onOff = o; //선언
    }

    void print(){
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다");//출력
    }
}
class TelevisionTest{
    public static void main(String[] args) {
        Television2 myTv = new Television2(7, 10, true);//값넣기
        myTv.print();

        Television2 yourTv = new Television2(11, 20, true);//값넣기
        yourTv.print();
    }
}
