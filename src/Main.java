import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::startGame);
    }

    private static void startGame() {
        GameMode dialog = new GameMode(null);
        boolean againstAI = dialog.isAgainstAI();
        new TicTacToeGame(againstAI);
    }
}