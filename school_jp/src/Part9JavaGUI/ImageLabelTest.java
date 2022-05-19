package Part9JavaGUI;

import javax.swing.*;
import java.awt.*;

public class ImageLabelTest extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public ImageLabelTest() {
        setTitle("레이블 테스트");
        setSize(400, 350);

        panel = new JPanel();
        label = new JLabel("Hamstar");
        ImageIcon icon = new ImageIcon("C://Users//ghwls//OneDrive//바탕 화면//그냥공부//인평//images.jpg");
        label.setIcon(icon);

        button = new JButton("자세한 정보를 보려면 클릭하세요!");
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        ImageLabelTest I = new ImageLabelTest();
    }
}
