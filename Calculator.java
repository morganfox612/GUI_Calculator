import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator
{
  private static void createAndShowGUI()
  {
    JFrame frame = new JFrame("MFJCEC CALCULATOR");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel emptyLabel = new JLabel("");
    emptyLabel.setPreferredSize(new Dimension(400, 600));
    frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String []args)
  {
    javax.swing.SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        createAndShowGUI();
      }
    });
  }
}
