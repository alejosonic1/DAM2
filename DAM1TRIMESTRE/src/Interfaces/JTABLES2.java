package Interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTABLES2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField cod;
    private JTextField nomb;
    private JTextField prof;
    private JTextField edad1;
    private JTextField telf;
    private JTable table;
    private DefaultTableModel model;  // Creamos una variable para el modelo de la tabla

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JTABLES2 frame = new JTABLES2();
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
    public JTABLES2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 589, 727);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("CODIGO:");
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
        lblNewLabel.setBounds(10, 84, 88, 26);
        contentPane.add(lblNewLabel);

        cod = new JTextField();
        cod.setBounds(123, 88, 108, 26);
        contentPane.add(cod);
        cod.setColumns(10);

        JLabel lblNombre = new JLabel("NOMBRE:");
        lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 14));
        lblNombre.setBounds(10, 120, 103, 26);
        contentPane.add(lblNombre);

        nomb = new JTextField();
        nomb.setColumns(10);
        nomb.setBounds(123, 124, 212, 26);
        contentPane.add(nomb);

        prof = new JTextField();
        prof.setColumns(10);
        prof.setBounds(123, 156, 212, 26);
        contentPane.add(prof);

        JLabel lblProfesion = new JLabel("PROFESION:");
        lblProfesion.setFont(new Font("Arial Black", Font.PLAIN, 14));
        lblProfesion.setBounds(10, 153, 103, 26);
        contentPane.add(lblProfesion);

        JLabel lblEdad = new JLabel("EDAD:");
        lblEdad.setFont(new Font("Arial Black", Font.PLAIN, 15));
        lblEdad.setBounds(345, 121, 64, 26);
        contentPane.add(lblEdad);

        edad1 = new JTextField();
        edad1.setColumns(10);
        edad1.setBounds(438, 124, 108, 26);
        contentPane.add(edad1);

        JLabel lblTelefono = new JLabel("TELEFONO:");
        lblTelefono.setFont(new Font("Arial Black", Font.PLAIN, 14));
        lblTelefono.setBounds(345, 153, 103, 26);
        contentPane.add(lblTelefono);

        telf = new JTextField();
        telf.setColumns(10);
        telf.setBounds(438, 159, 108, 26);
        contentPane.add(telf);

        // Creamos el modelo de la tabla, SIN la fila de encabezados
        model = new DefaultTableModel(
            null,  // No datos iniciales
            new String[] { "CODIGO", "NOMBRE", "EDAD", "PROFESION", "TELEFONO" }  // Encabezados
        );

        table = new JTable(model); // Asignamos el modelo a la tabla

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30, 300, 516, 155);
        contentPane.add(scrollPane);

        JLabel lblNewLabel_1 = new JLabel("TABLA USANDO TABLE MODEL");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(30, 275, 248, 13);
        contentPane.add(lblNewLabel_1);

        // Acción del botón REGISTRAR
        JButton btnNewButton = new JButton("REGISTRAR");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los campos de texto
                String codigo = cod.getText();
                String nombre = nomb.getText();
                String telfo = telf.getText();
                String profe = prof.getText();
                String edad = edad1.getText();

                // Verificamos que los campos no estén vacíos
                if (!codigo.isEmpty() && !nombre.isEmpty() && !telfo.isEmpty() && !profe.isEmpty() && !edad.isEmpty()) {
                    // Agregar una nueva fila al modelo de la tabla
                    model.addRow(new Object[]{codigo, nombre, edad, profe, telfo});
                }
            }
        });

        btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 10));
        btnNewButton.setBounds(170, 212, 108, 26);
        contentPane.add(btnNewButton);

        JButton btnCancelar = new JButton("CANCELAR");
        btnCancelar.setFont(new Font("Arial Black", Font.PLAIN, 10));
        btnCancelar.setBounds(298, 212, 108, 26);
        contentPane.add(btnCancelar);
    }
}
