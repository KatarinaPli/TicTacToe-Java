import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class TicTacToe {

    int textWidth = 600;
    int textHeight = 650; //50px for the text panel on top

    JFrame frame = new JFrame("Tic-Tac-Toe");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();

    public TicTacToe(){
        frame.setVisible(true);
        frame.setSize(textWidth, textHeight);
        frame.setLocationRelativeTo(null); //set the frame in the center of the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        textLabel.setBackground(Color.LIGHT_GRAY);
        textPanel.setForeground(Color.magenta);
        textLabel.setFont(new Font("Arial", Font.BOLD, 40));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Tic Tac Toe");
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(3,3));
        boardPanel.setBackground(Color.orange);
        frame.add(boardPanel);
        
    }
}
