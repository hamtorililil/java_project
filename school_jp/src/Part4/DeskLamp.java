package Part4;

public class DeskLamp {
        // 인스턴스 변수 정의
        private boolean isOn;  //isON 하면 켜지고 isOff 하면 꺼지는 스위치 느낌?

        // 메소드 정의
        public void turnOn() { isOn = true; } // 켜짐으로 바꾼다
        public void turnOff() { isOn = false; } // 꺼짐으로 바꾼다
        public String toString() {
            return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐"); // 현재 상태값을 돌려보낸다
        }

        public static void main(String[] args) {
            // 객체를 생성하려면 new 예약어를 사용한다.
            Part4.DeskLamp myLamp = new Part4.DeskLamp();

            // 객체의 메소드를 호출하려면 도트 연산자인 .을 사용한다.
            myLamp.turnOn(); //온으로 바꾼다?
            System.out.println(myLamp); //출력한다
            myLamp.turnOff(); //오프로 바꾼다?
            System.out.println(myLamp); // 출력한다
        }
}

