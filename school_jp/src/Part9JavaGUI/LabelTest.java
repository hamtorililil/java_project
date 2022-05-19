package Part9JavaGUI;

import javax.swing.*;
import java.awt.*;

public class LabelTest extends JFrame {
    private JPanel panel;
    private JLabel label, label2;

    public LabelTest(){
        setTitle("레이블 테스트");
        setSize(400, 150);

        panel = new JPanel();
        label = new JLabel("color Label");
        label.setForeground(Color.blue);
        label2 = new JLabel("Font Label");
        label2.setFont(new Font("Arial", Font.ITALIC, 30));
        label2.setForeground(Color.ORANGE);
        panel.add(label);
        panel.add(label2);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        LabelTest l = new LabelTest();
    }
}
