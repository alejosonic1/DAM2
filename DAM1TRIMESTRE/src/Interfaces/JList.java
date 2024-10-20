package Interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class JList extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JList frame = new JList();
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
    public JList() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 599, 418);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        // Crear una lista de números
        javax.swing.JList<String> list = new javax.swing.JList<>();
        list.setFont(new Font("Arial Black", Font.PLAIN, 18));
        list.setModel(new AbstractListModel<String>() {
            String[] values = new String[] {"4", "8", "15", "96", "23", "42"};
            public int getSize() {
                return values.length;
            }
            public String getElementAt(int index) {
                return values[index];
            }
        });

        list.setBounds(65, 90, 136, 187);
        contentPane.add(list);
        
        JLabel lblNewLabel = new JLabel("NUMEROS");
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblNewLabel.setBounds(81, 67, 97, 13);
        contentPane.add(lblNewLabel);
        
        // Botón para verificar si los números son primos
        JButton btnVerificar = new JButton("VERIFICAR");
        btnVerificar.setBounds(93, 287, 85, 21);
        contentPane.add(btnVerificar);
        
        // Agregar acción al botón para verificar los números de la lista
        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder resultMessage = new StringBuilder();
                for (int i = 0; i < list.getModel().getSize(); i++) {
                    String value = list.getModel().getElementAt(i);
                    int number = Integer.parseInt(value);
                    if (esPrimo(number)) {
                        resultMessage.append(number).append(" es un número primo.\n");
                    } else {
                        resultMessage.append(number).append(" no es un número primo.\n");
                    }
                }
                // Mostrar los resultados en una ventana emergente
                JOptionPane.showMessageDialog(contentPane, resultMessage.toString(), "Resultados", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
    
    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
