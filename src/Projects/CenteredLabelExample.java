package Projects;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CenteredLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Centered JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridBagLayout()); // centers the component

        JLabel label = new JLabel("?");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBorder(new LineBorder(Color.BLACK, 1)); // thin black border

        frame.add(label); // add label to center
        frame.setVisible(true);
    }
}
