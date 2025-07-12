package Projects;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            //creation of the new EDT =
            @Override
            public void run() {
                RockPaperScissors_GUI rps = new RockPaperScissors_GUI();

                //Set the visibility true for the Jframe
                rps.setVisible(true);
            }
        });
    }
}
