package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class JTables extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTables frame = new JTables();
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
	public JTables() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Arial Black", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"NOMBRE", "APELLIDO", "EDAD"},
				{"Paca", "Garte", "23"},
				{"Ana Lisa", "Melchoto", "12"},
				{"Rosa", "Melpito", "43"},
				{"Monica", "Galindo", "63"},
				{"Lali", "Cuadora", "21"},
				{"Mary", "Quita Sovos", "19"},
				{"Flor D.", "Turra", "26"},
				{"Ana", "Tomia", "18"},
				{"Evelin", "Munda", "35"},
				{"Roque", "Joso", "27"},
				{"German", "Teca", "41"},
			},
			new String[] {
				"NOMBRE", "APELLIDO", "EDAD"
			}
		));
		table.setBounds(42, 30, 475, 271);
		contentPane.add(table);
	}
}
