package Part7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


class MyClass implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.out.println("beep");
    }
}
public class CallbackTest {
    public static void main(String[] args) {

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("beep");
            }
        };//익명 클래스가 정의 되면서 동시에 객체도 생성된다.
        Timer t = new Timer(1000, listener);
        t.start();
        for(int i = 0;i < 1000; i++){
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
        }
    }
}
