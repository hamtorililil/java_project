package Part9JavaGUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {
    public MyFrame2(){
        JPanel panel = new JPanel(); //패널을 생성한다.
        panel.setBackground(Color.orange); // 패널의 배경색을 변경한다.

        JButton b1 = new JButton("Button 1"); // 버튼을 생성한다.
        b1.setBackground(Color.yellow); // 버튼의 배경색을 변경한다.

        JButton b2 = new JButton("Button 2");
        b2.setBackground(Color.green);

        panel.add(b1); // 버튼1을 패널에 추가한다.
        panel.add(b2); // 버튼2을 패널에 추가한다.
        add(panel);    // 패널의 프레임에 추가한다.
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2();
    }
}
