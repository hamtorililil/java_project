package 제4장클래스와객체1;

public class Television {
    int channel;        // 채널 번호
    int volume;         // 볼륨
    boolean onOff;      // 전원 상태

    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7; //나의 텔레비전 채널번호 값넣기
        myTv.volume = 10; //나의 텔레비전 볼륨 값넣기
        myTv.onOff = true; //나의 텔레비전을 킨다

        Television yourTv = new Television();
        yourTv.channel = 9; // 너의 텔레비전 채널번호 값넣기
        yourTv.volume = 12; // 너의 텔레비전 볼륨 값넣기
        yourTv.onOff = true; // 너의 텔레비전을 킨다
        System.out.println("나의 텔레비전의 채널은 " + myTv.channel +
                "이고 볼츔은 " + myTv.volume + "입니다."); // 출력
        System.out.println("너의 텔레비전의; 채널은 " + yourTv.channel +
                "이고 볼륨은 " + yourTv.volume + "입니다."); // 출력
    }
}
