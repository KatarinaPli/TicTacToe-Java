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

    }
}
