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
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    zero.addActionListener(calculator);
    one.addActionListener(calculator);
    two.addActionListener(calculator);
    three.addActionListener(calculator);
    four.addActionListener(calculator);
    five.addActionListener(calculator);
    six.addActionListener(calculator);
    seven.addActionListener(calculator);
    eight.addActionListener(calculator);
    nine.addActionListener(calculator);
    plus.addActionListener(calculator);
    minus.addActionListener(calculator);

  }
}
