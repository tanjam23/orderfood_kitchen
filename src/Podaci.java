import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Podaci extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Podaci frame = new Podaci();
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
	public Podaci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPodaciODostavi = new JLabel("Podaci o dostavi");
		lblPodaciODostavi.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblPodaciODostavi.setBackground(Color.GRAY);
		lblPodaciODostavi.setBounds(74, 39, 254, 33);
		contentPane.add(lblPodaciODostavi);
		
		JLabel lblImeIPrezime = new JLabel("Ime i prezime:");
		lblImeIPrezime.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
		lblImeIPrezime.setBounds(40, 96, 148, 33);
		contentPane.add(lblImeIPrezime);
		
		JLabel lblAdresa = new JLabel("Adresa:");
		lblAdresa.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
		lblAdresa.setBounds(38, 144, 110, 33);
		contentPane.add(lblAdresa);
		
		JLabel lblBrojTelefona = new JLabel("Broj telefona:");
		lblBrojTelefona.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
		lblBrojTelefona.setBounds(39, 190, 119, 39);
		contentPane.add(lblBrojTelefona);
		
		JLabel lblNainPlaanja = new JLabel("Na\u010Din pla\u0107anja:");
		lblNainPlaanja.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
		lblNainPlaanja.setBounds(36, 252, 119, 33);
		contentPane.add(lblNainPlaanja);
		
		textField = new JTextField();
		textField.setBounds(180, 103, 148, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 151, 148, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 200, 148, 22);
		contentPane.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gotovinski", "Platna kartica"}));
		comboBox.setBounds(180, 259, 148, 22);
		contentPane.add(comboBox);
		
		JButton btnZavri = new JButton("Zavr\u0161i");
		btnZavri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Porudžbina uspešno potvrðena!");
			}
		});
		btnZavri.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 22));
		btnZavri.setBounds(118, 328, 135, 33);
		contentPane.add(btnZavri);
		
		JButton btnVrate = new JButton("Vrati");
		btnVrate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false); 
				dispose();
				Hrana hr=new Hrana();
				hr.setVisible(true);
			}
		});
		btnVrate.setBounds(278, 385, 86, 22);
		contentPane.add(btnVrate);
	}
}
