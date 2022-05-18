package Part9JavaGUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setSize(300, 200);
        setTitle("MyFrame");

        setLayout(new FlowLayout());              //(1)
        JButton button = new JButton("버튼"); //(2)
        add(button);                              //(3)
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
