import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener
{
  private static JTextField inputBox;
  Calculator(){}

  public static void main(String[] args)
  {
    createAndShowGUI();
  }

  private static void createAndShowGUI()
  {
    JFrame frame = new JFrame("MFJCEC CALCULATOR");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();

    // JLabel emptyLabel = new JLabel("");
    // emptyLabel.setPreferredSize(new Dimension(400, 600));
    // frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

    JPanel panel = new JPanel();
    Calculator calculator = new Calculator();

    JTextField textfield = new JTextField(16);
    textfield.setEditable(false);

    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton zero = new JButton("0");
    // Operators
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton multiply = new JButton("*");
    JButton divide = new JButton("/");

    JButton equals = new JButton("                =               ");

    JButton decimal = new JButton(".");
    JButton delete = new JButton("C");

    seven.addActionListener(calculator);
    eight.addActionListener(calculator);
    nine.addActionListener(calculator);
    four.addActionListener(calculator);
    five.addActionListener(calculator);
    six.addActionListener(calculator);
    one.addActionListener(calculator);
    two.addActionListener(calculator);
    three.addActionListener(calculator);
    zero.addActionListener(calculator);

    plus.addActionListener(calculator);
    minus.addActionListener(calculator);
    multiply.addActionListener(calculator);
    divide.addActionListener(calculator);

    equals.addActionListener(calculator);

    decimal.addActionListener(calculator);
    delete.addActionListener(calculator);

    //Adding Buttons to Our Panel
    panel.add(seven);
    panel.add(eight);
    panel.add(nine);
    panel.add(divide);

    panel.add(four);
    panel.add(five);
    panel.add(six);
    panel.add(multiply);

    panel.add(one);
    panel.add(two);
    panel.add(three);
    panel.add(minus);

    panel.add(decimal);
    panel.add(zero);
    panel.add(delete);

    panel.add(plus);

    panel.add(equals);

    //Setting Background to Pink
    panel.setBackground(Color.green);

    frame.add(panel);
    frame.setSize(200, 500);
    frame.show();
  }
  public void actionPerformed(ActionEvent e) {
    
    }

}
