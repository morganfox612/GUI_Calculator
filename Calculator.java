import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener
{
  static JTextField textfield = new JTextField(null, 20);
  static JFrame frame = new JFrame("MFJCEC CALCULATOR");
  private static JTextField inputBox;
  String showing1, showing2, showing3;
  Calculator(){
    showing1 = showing2 = showing3 = "";
  }

  public static void main(String[] args)
  {
    createAndShowGUI();
  }

  private static void createAndShowGUI()
  {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();

    JPanel panel = new JPanel();
    Calculator calculator = new Calculator();

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

    JButton equals = new JButton("                     =                    ");

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
    panel.add(textfield);
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
    panel.setBackground(Color.pink);

    frame.add(panel);
    frame.setSize(200, 300);
    frame.show();
  }
  public void actionPerformed(ActionEvent e) {
    String s = e.getActionCommand();

      if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
          if (!showing2.equals(""))
              showing3 = showing3 + s;
          else
              showing1 = showing1 + s;

          textfield.setText(showing1 + showing2 + showing3);
      }
      else if (s.charAt(0) == 'C') {
          showing1 = showing2 = showing3 = "";

          textfield.setText(showing1 + showing2 + showing3);
      }
      else if (s.charAt(0) == '=') {
          Double te;
          if (showing2.equals("+"))
              te = (Double.parseDouble(showing1) + Double.parseDouble(showing3));
          else if (showing2.equals("-"))
              te = (Double.parseDouble(showing1) - Double.parseDouble(showing3));
          else if (showing2.equals("/"))
              te = (Double.parseDouble(showing1) / Double.parseDouble(showing3));
          else
              te = (Double.parseDouble(showing1) * Double.parseDouble(showing3));

          textfield.setText(showing1 + showing2 + showing3 + "=" + te);

          showing1 = Double.toString(te);

          showing2 = showing3 = "";
      }
      else {
          if (showing2.equals("") || showing3.equals(""))
              showing2 = s;
          else {
              Double te;
              if (showing2.equals("+"))
                  te = (Double.parseDouble(showing1) + Double.parseDouble(showing3));
              else if (showing2.equals("-"))
                  te = (Double.parseDouble(showing1) - Double.parseDouble(showing3));
              else if (showing2.equals("/"))
                  te = (Double.parseDouble(showing1) / Double.parseDouble(showing3));
              else
                  te = (Double.parseDouble(showing1) * Double.parseDouble(showing3));
              showing1 = Double.toString(te);
              showing2 = s;
              showing3 = "";
          }

          textfield.setText(showing1 + showing2 + showing3);
      }
    }

}
