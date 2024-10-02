package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class EjercicioWindow2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioWindow2 window = new EjercicioWindow2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EjercicioWindow2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 567, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elija una opcion para ver la imagen");
		lblNewLabel.setBounds(10, 46, 360, 19);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel);
		
		ButtonGroup group = new ButtonGroup(); //Agrupar los botones de radio para que solo elija uno
		
		JRadioButton rdb1 = new JRadioButton("Perra");
		
		rdb1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdb1.setBackground(new Color(240, 240, 240));
		rdb1.setHorizontalAlignment(SwingConstants.LEFT);
		rdb1.setBounds(36, 131, 103, 21);
		frame.getContentPane().add(rdb1);
		group.add(rdb1);
		rdb1.setSelected(true);
		
		JRadioButton rdb2 = new JRadioButton("Gato");
		rdb2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdb2.setBounds(36, 154, 103, 21);
		frame.getContentPane().add(rdb2);
		group.add(rdb2);
		JRadioButton rdb3 = new JRadioButton("Tigre");
		rdb3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdb3.setBounds(36, 177, 103, 21);
		frame.getContentPane().add(rdb3);
		group.add(rdb3);
		JRadioButton rdb4 = new JRadioButton("León");
		rdb4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdb4.setBounds(36, 200, 103, 21);
		frame.getContentPane().add(rdb4);
		group.add(rdb4);
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        int response = JOptionPane.showConfirmDialog(frame, "¿Seguro que deseas salir?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		        if (response == JOptionPane.YES_OPTION) {
		            System.exit(0);
		        }
				
			}
		});
		btnNewButton.setBackground(new Color(255, 51, 204));
		btnNewButton.setBounds(398, 46, 108, 38);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\alejo\\Pictures\\Perro.jpg"));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(230, 94, 276, 264);
		frame.getContentPane().add(lblNewLabel_1);
		
		rdb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdb1.isSelected()) {
					lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\alejo\\Pictures\\Perro.jpg"));
				}
			
			}
			
		});
		rdb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\alejo\\Pictures\\Gato.jpg"));
			}
		});
		
		rdb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\alejo\\Pictures\\Tigre.jpg"));
			}
		});
		
		rdb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\alejo\\Pictures\\Leon.jpg"));
			}
		});
		
	}
	
}
