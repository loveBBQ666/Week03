package GAME;
import javax.swing.*;
public class MyFrame extends JFrame{
    MyPanel mp = null;

    public MyFrame(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(mp);
        new Thread(mp).start();
    }

    public static void main(String[] args) {
        MyFrame mf = new MyFrame();

    }
}
