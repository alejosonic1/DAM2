package Interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
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

        // Botones de números
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

        JButton btigual = new JButton("=");
        btigual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });
        btigual.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btigual.setBounds(470, 360, 109, 39);
        contentPane.add(btigual);

        // Botones de operadores
        JButton btsum = new JButton("+");
        btsum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setOperator("+");
            }
        });
        btsum.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btsum.setBounds(470, 309, 109, 39);
        contentPane.add(btsum);

        JButton btresta = new JButton("-");
        btresta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setOperator("-");
            }
        });
        btresta.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btresta.setBounds(470, 260, 109, 39);
        contentPane.add(btresta);

        JButton btmultiplica = new JButton("*");
        btmultiplica.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setOperator("*");
            }
        });
        btmultiplica.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btmultiplica.setBounds(470, 211, 109, 39);
        contentPane.add(btmultiplica);

        JButton btdivide = new JButton("/");
        btdivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setOperator("/");
            }
        });
        btdivide.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btdivide.setBounds(470, 162, 109, 39);
        contentPane.add(btdivide);

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

        // Más botones de números
        JButton bt4 = new JButton("4");
        bt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("4");
            }
        });
        bt4.setFont(new Font("Tahoma", Font.PLAIN, 22));
        bt4.setBounds(41, 260, 109, 39);
        contentPane.add(bt4);

        JButton bt5 = new JButton("5");
        bt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("5");
            }
        });
        bt5.setFont(new Font("Tahoma", Font.PLAIN, 22));
        bt5.setBounds(160, 260, 109, 39);
        contentPane.add(bt5);

        JButton bt6 = new JButton("6");
        bt6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("6");
            }
        });
        bt6.setFont(new Font("Tahoma", Font.PLAIN, 22));
        bt6.setBounds(279, 260, 109, 39);
        contentPane.add(bt6);

        JButton bt7 = new JButton("7");
        bt7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("7");
            }
        });
        bt7.setFont(new Font("Tahoma", Font.PLAIN, 22));
        bt7.setBounds(41, 211, 109, 39);
        contentPane.add(bt7);

        JButton bt8 = new JButton("8");
        bt8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("8");
            }
        });
        bt8.setFont(new Font("Tahoma", Font.PLAIN, 22));
        bt8.setBounds(160, 211, 109, 39);
        contentPane.add(bt8);

        JButton bt9 = new JButton("9");
        bt9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("9");
            }
        });
        bt9.setFont(new Font("Tahoma", Font.PLAIN, 22));
        bt9.setBounds(279, 211, 109, 39);
        contentPane.add(bt9);

        JButton bt0 = new JButton("0");
        bt0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("0");
            }
        });
        bt0.setFont(new Font("Tahoma", Font.PLAIN, 22));
        bt0.setBounds(160, 358, 109, 39);
        contentPane.add(bt0);
    }

    private void appendNumber(String num) {
        String currentText = textField.getText();
        textField.setText(currentText + num);  
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
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    textField.setText("Error: Div by 0");
                    return;
                }
                break;
        }

        textField.setText(String.valueOf(result));
        operator = "";
    }
}
