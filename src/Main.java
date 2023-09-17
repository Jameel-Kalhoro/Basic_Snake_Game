import javax.swing.*;

public class Main {
    JFrame frame;
    JButton play;
    public void createWindow(){
        frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        play = new JButton("Play");
        frame.setSize(400,400);
        play.setSize(100,100);
        frame.add(play);
        frame.setLocationRelativeTo(null);
        //frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        Board board = new Board();
    }
}