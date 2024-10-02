package Interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class EjercicioWindow {

	private JFrame frame;
	private JRadioButton radioOne;
	private JRadioButton radioTwo;
	private JRadioButton radioThree;
	private JLabel generatedNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioWindow window = new EjercicioWindow();
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
	public EjercicioWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void generateNumber(ActionEvent e) {
		if (radioOne.isSelected()) {
			generatedNumber.setText(String.valueOf((int) (Math.random() * 100)));
		} else if (radioTwo.isSelected()) {
			generatedNumber.setText(String.valueOf((int) (Math.random() * 100 + 100)));
		} else if (radioThree.isSelected()) {
			generatedNumber.setText(String.valueOf((int) (Math.random() * 300 + 200)));
		}
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 608, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// Grouping the radio buttons
		ButtonGroup group = new ButtonGroup();
		
		radioOne = new JRadioButton("entre 0 y 100");
		radioOne.setFont(new Font("Arial Black", Font.PLAIN, 11));
		radioOne.setBounds(260, 34, 113, 21);
		panel.add(radioOne);
		group.add(radioOne);
		
		radioTwo = new JRadioButton("entre 100 y 200");
		radioTwo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		radioTwo.setBounds(260, 57, 145, 21);
		panel.add(radioTwo);
		group.add(radioTwo);
		
		radioThree = new JRadioButton("entre 200 y 500");
		radioThree.setFont(new Font("Arial Black", Font.PLAIN, 11));
		radioThree.setBounds(260, 80, 145, 21);
		panel.add(radioThree);
		group.add(radioThree);
		
		JButton btnNewButton = new JButton("Generar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(175, 131, 118, 29);
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				generateNumber(e);
			}
		});
		
		JLabel lblNewLabel = new JLabel("Generador de números");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(56, 9, 198, 67);
		panel.add(lblNewLabel);
		
		generatedNumber = new JLabel("");
		generatedNumber.setFont(new Font("Arial Black", Font.PLAIN, 14));
		generatedNumber.setBounds(175, 206, 83, 44);
		panel.add(generatedNumber);
	}
}
