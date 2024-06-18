import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class TicTacToe {
    int boardWidth = 600;
    int boardHeight = 650; //50px for the text panel on top

    JFrame board = new JFrame();

    public TicTacToe(){
        board.setVisible(true);
        board.setSize(boardWidth, boardHeight);
        board.setLocationRelativeTo(null); //set the frame in the center of the screen
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setResizable(false);
        board.setLayout(new BorderLayout());
    }
}
