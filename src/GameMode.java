import javax.swing.*;

public class GameMode extends JDialog {
    private boolean againstAI;

    public GameMode(JFrame parent) {
        super(parent, "Select Game Mode", true);

        String[] options = {"Against AI", "Against Player"};
        int choice = JOptionPane.showOptionDialog(
                this,
                "Select game mode:",
                "Tic Tac Toe",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );

        againstAI = (choice == 0);
        dispose();
    }

    public boolean isAgainstAI() {
        return againstAI;
    }
}