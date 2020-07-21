import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;

public class Hrana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hrana frame = new Hrana();
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
	public Hrana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDorucak = new JButton("Doru\u010Dak");
		Image slike=new ImageIcon(this.getClass().getResource("/dorucak.png")).getImage();
		btnDorucak.setIcon(new ImageIcon(slike));
		btnDorucak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false); 
				dispose();
				Dorucak dor=new Dorucak();
				dor.setVisible(true);
				
			}
		});
		btnDorucak.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnDorucak.setBounds(70, 160, 190, 52);
		contentPane.add(btnDorucak);
		Image slika1=new ImageIcon(this.getClass().getResource("/corbe.png")).getImage();
		
		JButton btnKuvanaJela = new JButton("Kuvana jela");
		btnKuvanaJela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false); 
				dispose();
				KuvanaJela kuvjela=new KuvanaJela();
				kuvjela.setVisible(true);
			}
		});
		Image slika2=new ImageIcon(this.getClass().getResource("/kuvjela.png")).getImage();
		btnKuvanaJela.setIcon(new ImageIcon(slika2));
		btnKuvanaJela.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnKuvanaJela.setBounds(70, 282, 190, 52);
		contentPane.add(btnKuvanaJela);
		
		JButton btnPaste = new JButton("Paste");
		btnPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false); 
				dispose();
				Paste pasta=new Paste();
				pasta.setVisible(true);
			}
		});
		Image slika3=new ImageIcon(this.getClass().getResource("/paste.png")).getImage();
		btnPaste.setIcon(new ImageIcon(slika3));
		btnPaste.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnPaste.setBounds(294, 160, 158, 52);
		contentPane.add(btnPaste);
		Image slika4=new ImageIcon(this.getClass().getResource("/salate.png")).getImage();
		
		JButton btnDezerti = new JButton("Dezerti");
		btnDezerti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false); 
				dispose();
				Dezert dez=new Dezert();
				dez.setVisible(true);
			}
		});
		Image slika5=new ImageIcon(this.getClass().getResource("/dezert.png")).getImage();
		btnDezerti.setIcon(new ImageIcon(slika5));
		btnDezerti.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		btnDezerti.setBounds(302, 282, 158, 52);
		contentPane.add(btnDezerti);
		
		JLabel lblPoruivanjeNamirnicaZa = new JLabel("Poru\u010Divanje namirnica za jela");
		lblPoruivanjeNamirnicaZa.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblPoruivanjeNamirnicaZa.setBackground(Color.GRAY);
		lblPoruivanjeNamirnicaZa.setBounds(73, 56, 393, 33);
		contentPane.add(lblPoruivanjeNamirnicaZa);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(60, 93, 390, 11);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(68, 249, 392, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(70, 348, 392, 2);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(60, 56, 392, 2);
		contentPane.add(separator_4);
		
		JLabel label = new JLabel("");
		Image slikee=new ImageIcon(this.getClass().getResource("/jelo.png")).getImage();
		label.setIcon(new ImageIcon(slikee));
		label.setBounds(504, 146, 269, 179);
		contentPane.add(label);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(60, 146, 392, 2);
		contentPane.add(separator_2);
	}
}
