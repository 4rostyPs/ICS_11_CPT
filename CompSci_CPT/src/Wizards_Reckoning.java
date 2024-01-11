import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;




public class Wizards_Reckoning extends JPanel implements ActionListener, KeyListener{
    

public Wizards_Reckoning() {
    addKeyListener(this);
    setFocusable(true);
    requestFocus();


    JFrame frame = new JFrame();
    frame.setContentPane(this);
    frame.setSize(1550,820);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    frame.setVisible(true);

}
    

public void paint (Graphics g) {

super.paint(g);
Graphics2D g2 = (Graphics2D)g;

}

public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }



    public void keyTyped(KeyEvent e) {}



	public void keyPressed(KeyEvent e) {}



	public void keyReleased(KeyEvent e) {}

public static void main(String[] args) throws Exception {
        
    new Wizards_Reckoning();

    }

}
