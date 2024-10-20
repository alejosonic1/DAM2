package Interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private double firstOperand = 0;
    private String operator = "";
    private boolean operatorClicked = false;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculadora frame = new Calculadora();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Calculadora() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 603, 436);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Create number buttons and operators
        JButton bt1 = new JButton("1");
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("1");
            }
        });
        bt1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        bt1.setBounds(41, 309, 109, 39);
        contentPane.add(bt1);

        JButton bt2 = new JButton("2");
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("2");
            }
        });
        bt2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        bt2.setBounds(160, 309, 109, 39);
        contentPane.add(bt2);

        JButton bt3 = new JButton("3");
        bt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("3");
            }
        });
        bt3.setFont(new Font("Tahoma", Font.PLAIN, 22));
        bt3.setBounds(279, 309, 109, 39);
        contentPane.add(bt3);

        // Add more buttons...

        JButton btigual = new JButton("=");
        btigual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });
        btigual.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btigual.setBounds(470, 360, 109, 39);
        contentPane.add(btigual);

        JButton btsum = new JButton("+");
        btsum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setOperator("+");
            }
        });
        btsum.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btsum.setBounds(470, 309, 109, 39);
        contentPane.add(btsum);

        // Add more operator buttons (subtraction, multiplication, division)...

        JButton btborrar = new JButton("BORRAR");
        btborrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                firstOperand = 0;
                operator = "";
                operatorClicked = false;
            }
        });
        btborrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btborrar.setBounds(470, 49, 109, 39);
        contentPane.add(btborrar);

        textField = new JTextField();
        textField.setBounds(41, 69, 345, 56);
        contentPane.add(textField);
        textField.setColumns(10);
    }

    private void appendNumber(String num) {
        String currentText = textField.getText();
        textField.setText(currentText + num);  // Concatenar el número al texto existente
    }

    private void setOperator(String op) {
        firstOperand = Double.parseDouble(textField.getText());
        operator = op;
        appendNumber(op);  // Mostrar el operador en el campo de texto
        operatorClicked = true;
    }

    private void calculateResult() {
        String currentText = textField.getText();
        String secondOperandStr = currentText.substring(currentText.indexOf(operator) + 1);
        double secondOperand = Double.parseDouble(secondOperandStr);
        double result = 0;

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "X":
                result = firstOperand * secondOperand;
                break;
            case "%":
                result = firstOperand / secondOperand;
                break;
        }

        textField.setText(String.valueOf(result));
        operator = "";
    }
}
