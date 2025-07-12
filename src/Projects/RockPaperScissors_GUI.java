package Projects;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
//frontend
public class RockPaperScissors_GUI extends JFrame {

    RockPaperScissors_GUI(){
        super("Rock Paper Scissors");

        //set the size of the GUI width - height
        setSize(500, 400);

        //set the layout to null to diable the layout management
        //(i.e. setting the width - height values of the elements)
        setLayout(null);

        //set the GUI to be shown in the center of the screen
        setLocationRelativeTo(null);

        //SHOWING ALL THE GUI COMPONENTS
        addGUIComponents();

        //Terminating the java virtual machine when closing the GUI
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void addGUIComponents(){
        JLabel computerScoreLabel = new JLabel("Computer Score: 0");

        //set the x,y coordinates/height - width of the j label
        computerScoreLabel.setBounds(0, 43, 450, 30);

        //setting the font
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));

        //center align the text
        computerScoreLabel.setHorizontalAlignment(SwingConstants.HORIZONTAL);

        //adding to GUI
        add(computerScoreLabel);

        //now we will show the computer choice
        JLabel computerChoice = new JLabel("?");
        computerChoice.setBounds(50, 90, 30, 20);
        computerChoice.setFont(new Font("Dialog", Font.PLAIN, 20 ));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
        //setting the border
        computerChoice.setBorder(new LineBorder(Color.BLACK, 1));
        add(computerChoice);

        JLabel playerScore = new JLabel("Player Score: 0", new ImageIcon("img.jpg"), JLabel.CENTER);
        add(playerScore);



    }
}
