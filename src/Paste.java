import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Paste extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Spageti;
	private JTextField txt_Kackavalj;
	private JTextField txt_Pavlaka;
	private JTextField txt_Luk;
	private JTextField txt_Spagete1;
	private JTextField txt_Paradajz;
	private JTextField txt_Luk1;
	private JTextField txt_Persun;
	private JTextField txt_Tuna;
	private JTextField txt_Luk_2;
	private JTextField txt_Paradajz_2;
	private JCheckBox Zacini1;
	private JTextField txt_Spageti2;
	private JTextField txt_Limun;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paste frame = new Paste();
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
	public Paste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 810, 445);
		contentPane.add(tabbedPane);
		Image slike=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		Image slike1=new ImageIcon(this.getClass().getResource("/recept.png")).getImage();
		
		JPanel CarbonaraPasta = new JPanel();
		tabbedPane.addTab("Carbonara pasta", null, CarbonaraPasta, null);
		CarbonaraPasta.setLayout(null);
		
		JLabel lblSpageti = new JLabel("\u0160pageti");
		lblSpageti.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblSpageti.setBounds(40, 60, 128, 33);
		CarbonaraPasta.add(lblSpageti);
		
		JLabel lblKackavalj = new JLabel("Ka\u010Dkavalj");
		lblKackavalj.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblKackavalj.setBounds(40, 105, 128, 33);
		CarbonaraPasta.add(lblKackavalj);
		
		JLabel lblPavlaka = new JLabel("Pavlaka");
		lblPavlaka.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblPavlaka.setBounds(40, 151, 128, 33);
		CarbonaraPasta.add(lblPavlaka);
		
		JLabel lblLuk = new JLabel("Luk");
		lblLuk.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblLuk.setBounds(40, 197, 79, 33);
		CarbonaraPasta.add(lblLuk);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 45, 370, 2);
		CarbonaraPasta.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 288, 370, 7);
		CarbonaraPasta.add(separator_1);
		
		JTextArea txtRecept1 = new JTextArea();
		txtRecept1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
		txtRecept1.setText("U vrelu, predhodno posoljenu vodu, staviti 300gr\r\n\u0161pageta da se kuvaju. Propr\u017Eit 100gr luka i dodati \r\n200ml pavlake i 100gr kackavalja. Me\u0161ati dok se \r\nne sjedini. Gotovom smesu preliti prethodno \r\nskuvane \u0161pagete.");
		txtRecept1.setBounds(423, 45, 370, 240);
		CarbonaraPasta.add(txtRecept1);
		
		txt_Spageti = new JTextField();
		txt_Spageti.setBounds(157, 68, 59, 22);
		txt_Spageti.setText("0");
		CarbonaraPasta.add(txt_Spageti);
		txt_Spageti.setColumns(10);
		
		txt_Kackavalj = new JTextField();
		txt_Kackavalj.setColumns(10);
		txt_Kackavalj.setText("0");
		txt_Kackavalj.setBounds(157, 113, 59, 22);
		CarbonaraPasta.add(txt_Kackavalj);
		
		txt_Pavlaka = new JTextField();
		txt_Pavlaka.setColumns(10);
		txt_Pavlaka.setText("0");
		txt_Pavlaka.setBounds(157, 159, 59, 22);
		CarbonaraPasta.add(txt_Pavlaka);
		
		txt_Luk = new JTextField();
		txt_Luk.setColumns(10);
		txt_Luk.setText("0");
		txt_Luk.setBounds(157, 205, 59, 22);
		CarbonaraPasta.add(txt_Luk);
		
		JLabel lblGr = new JLabel("gr");
		lblGr.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblGr.setBounds(228, 102, 53, 33);
		CarbonaraPasta.add(lblGr);
		
		JLabel lblMl_1 = new JLabel("ml");
		lblMl_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMl_1.setBounds(228, 151, 53, 33);
		CarbonaraPasta.add(lblMl_1);
		
		JLabel label_1 = new JLabel("gr");
		label_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_1.setBounds(228, 197, 53, 33);
		CarbonaraPasta.add(label_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(398, 49, 13, 236);
		CarbonaraPasta.add(separator_3);
		
		JLabel lblKcal = new JLabel("kcal");
		lblKcal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKcal.setBounds(366, 355, 74, 46);
		CarbonaraPasta.add(lblKcal);
		
		JLabel lblKcal1 = new JLabel("   ");
		lblKcal1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKcal1.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblKcal1.setBounds(244, 356, 178, 46);
		CarbonaraPasta.add(lblKcal1);
		
		JLabel lblUkupno1 = new JLabel("   ");
		lblUkupno1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUkupno1.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblUkupno1.setBounds(526, 356, 178, 46);
		CarbonaraPasta.add(lblUkupno1);
		
		JButton Potvrdi1 = new JButton("Potvrdi");
		Potvrdi1.setIcon(new ImageIcon(slike));
		Potvrdi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double spagete1=Double.parseDouble(txt_Spageti.getText());
				double spagete2=0.096;
				double spagete=(spagete1 * spagete2);
				String ukSpagete = String.format("%.2f", spagete);
				lblUkupno1.setText(ukSpagete);
				
				double spagetekal=1.577;
				double spagetekcl=(spagete1*spagetekal);
				String ukSpageteKal = String.format("%.2f", spagetekcl);
				lblKcal1.setText(ukSpageteKal);
				
				
				double kackavalj1=Double.parseDouble(txt_Kackavalj.getText());
				double kackavalj2=1;
				double kackavalj;
				kackavalj=(kackavalj1 * kackavalj2);
				String ukKack= String.format("%.2f", spagete + kackavalj);
				lblUkupno1.setText(ukKack);
				
				double kackal=3.89;
				double kackcl=(kackavalj1*kackal);
				String ukKacKal = String.format("%.2f", spagetekcl + kackcl);
				lblKcal1.setText(ukKacKal);
				
				
				double pavl1=Double.parseDouble(txt_Pavlaka.getText());
				double pavl2=0.21;
				double pavl=(pavl1 * pavl2);
				String ukPavl = String.format("%.2f", spagete + kackavalj + pavl);
				lblUkupno1.setText(ukPavl);
				
				double pavlkal=1.26;
				double pavlkcl=(pavl1*pavlkal);
				String ukPavlKal = String.format("%.2f", spagetekcl + kackcl + pavlkcl);
				lblKcal1.setText(ukPavlKal);
				
				
				double luk1=Double.parseDouble(txt_Luk.getText());
				double luk2=0.038;
				double luk=(luk1 * luk2);
				String ukLuk = String.format("%.2f", spagete + kackavalj + pavl + luk);
				lblUkupno1.setText(ukLuk);
				
				double lukkal=0.4;
				double lukkcl=(luk1*lukkal);
				String ukLukKal = String.format("%.2f", spagetekcl + kackcl + pavlkcl + lukkcl);
				lblKcal1.setText(ukLukKal);
				
				double zacin= 15;
				if(Zacini1.isSelected()) {
					String ukza= String.format("%.2f", spagete + kackavalj + pavl + luk + zacin);
					lblUkupno1.setText(ukza);
				}
				
			}
		});
		
		Potvrdi1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Potvrdi1.setBounds(38, 337, 156, 53);
		CarbonaraPasta.add(Potvrdi1);
		
		JLabel Recept1 = new JLabel("Recept");
		Recept1.setIcon(new ImageIcon(slike1));
		Recept1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		Recept1.setBackground(Color.GRAY);
		Recept1.setBounds(538, 0, 164, 47);
		CarbonaraPasta.add(Recept1);
		
		JLabel CarabonaraPasta = new JLabel("Carbonara pasta");
		CarabonaraPasta.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		CarabonaraPasta.setBackground(Color.GRAY);
		CarabonaraPasta.setBounds(23, 7, 290, 33);
		CarbonaraPasta.add(CarabonaraPasta);
		
		JLabel lblgr = new JLabel("gr");
		lblgr.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblgr.setBounds(228, 60, 53, 33);
		CarbonaraPasta.add(lblgr);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(472, 287, 13, 128);
		CarbonaraPasta.add(separator_4);
		
		Zacini1 = new JCheckBox("Za\u010Dini");
		Zacini1.setFont(new Font("Dialog", Font.PLAIN, 18));
		Zacini1.setBounds(40, 258, 97, 23);
		CarbonaraPasta.add(Zacini1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(24, 241, 370, 7);
		CarbonaraPasta.add(separator_2);
		
		JLabel lblUkupnaKalorijskaVrednost = new JLabel("Ukupna kalorijska vrednost");
		lblUkupnaKalorijskaVrednost.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUkupnaKalorijskaVrednost.setBackground(Color.GRAY);
		lblUkupnaKalorijskaVrednost.setBounds(204, 299, 266, 60);
		CarbonaraPasta.add(lblUkupnaKalorijskaVrednost);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(17, 50, 13, 235);
		CarbonaraPasta.add(separator_7);
		
		JLabel label_7 = new JLabel("dinara");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_7.setBounds(619, 352, 74, 49);
		CarbonaraPasta.add(label_7);
		
		JLabel label_9 = new JLabel("Ukupna cena namirnica");
		label_9.setFont(new Font("Dialog", Font.BOLD, 18));
		label_9.setBounds(510, 313, 218, 33);
		CarbonaraPasta.add(label_9);
		
		JPanel MilanesePasta = new JPanel();
		tabbedPane.addTab("Milanese pasta", null, MilanesePasta, null);
		MilanesePasta.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 805, 415);
		MilanesePasta.add(panel_1);
		
		JLabel lblUkupno2 = new JLabel("   ");
		lblUkupno2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUkupno2.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblUkupno2.setBounds(526, 356, 178, 46);
		panel_1.add(lblUkupno2);
		
		JPanel TunaPasta = new JPanel();
		tabbedPane.addTab("Tuna pasta", null, TunaPasta, null);
		TunaPasta.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 805, 415);
		TunaPasta.add(panel_2);
		
		JLabel lblTunaPasta = new JLabel("Tuna pasta");
		lblTunaPasta.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblTunaPasta.setBackground(Color.GRAY);
		lblTunaPasta.setBounds(24, 12, 227, 33);
		panel_2.add(lblTunaPasta);
		
		JLabel lblSpageti2 = new JLabel("\u0160pageti");
		lblSpageti2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblSpageti2.setBounds(42, 61, 105, 25);
		panel_2.add(lblSpageti2);
		
		JLabel lblTuna = new JLabel("Tuna");
		lblTuna.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblTuna.setBounds(42, 93, 79, 33);
		panel_2.add(lblTuna);
		
		JLabel lblLuk_3 = new JLabel("Luk");
		lblLuk_3.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblLuk_3.setBounds(42, 129, 59, 25);
		panel_2.add(lblLuk_3);
		
		JLabel lblParadajz_3 = new JLabel("Paradajz");
		lblParadajz_3.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblParadajz_3.setBounds(42, 167, 79, 25);
		panel_2.add(lblParadajz_3);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(24, 45, 370, 2);
		panel_2.add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(23, 243, 370, 7);
		panel_2.add(separator_13);
		
		JTextArea txtRecept3 = new JTextArea();
		txtRecept3.setText("Stavite vodu za spagete i kad prokljuca dodajte\r\n500gr spageta i kuvajte ih. Naseckati 100gr luka i \r\nprodinstati na ulju, pa nakon minut 100gr paradajza i\r\nnakon toga 200gr tune koju ocedite. Lagano dinstajte,\r\ndodajte malo vode i kri\u0161ku limuna. \r\nDodajte zacine po potrebi i dinstajte jos par minuta.\r\nTaman vam je gotova testenina, ocedite je i stavite\r\n u sos od tune.");
		txtRecept3.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
		txtRecept3.setBounds(423, 45, 370, 240);
		panel_2.add(txtRecept3);
		
		txt_Tuna = new JTextField();
		txt_Tuna.setColumns(10);
		txt_Tuna.setText("0");
		txt_Tuna.setBounds(156, 96, 59, 22);
		panel_2.add(txt_Tuna);
		
		txt_Luk_2 = new JTextField();
		txt_Luk_2.setColumns(10);
		txt_Luk_2.setText("0");
		txt_Luk_2.setBounds(156, 133, 59, 22);
		panel_2.add(txt_Luk_2);
		
		txt_Paradajz_2 = new JTextField();
		txt_Paradajz_2.setColumns(10);
		txt_Paradajz_2.setText("0");
		txt_Paradajz_2.setBounds(156, 171, 59, 22);
		panel_2.add(txt_Paradajz_2);
		
		JLabel lblGr_2 = new JLabel("gr");
		lblGr_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblGr_2.setBounds(225, 57, 53, 33);
		panel_2.add(lblGr_2);
		
		JLabel label_30 = new JLabel("gr");
		label_30.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_30.setBounds(225, 97, 53, 25);
		panel_2.add(label_30);
		
		JLabel lblMl = new JLabel("gr");
		lblMl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMl.setBounds(225, 125, 53, 33);
		panel_2.add(lblMl);
		
		JLabel label_32 = new JLabel("gr");
		label_32.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_32.setBounds(226, 163, 53, 33);
		panel_2.add(label_32);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setOrientation(SwingConstants.VERTICAL);
		separator_15.setBounds(398, 50, 13, 234);
		panel_2.add(separator_15);
		
		JLabel Recept3 = new JLabel("Recept");
		Image slike33=new ImageIcon(this.getClass().getResource("/recept.png")).getImage();
		Recept3.setIcon(new ImageIcon(slike33));
		Recept3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		Recept3.setBackground(Color.GRAY);
		Recept3.setBounds(538, 0, 179, 45);
		panel_2.add(Recept3);
		
		JCheckBox Zacini3 = new JCheckBox("Za\u010Dini");
		Zacini3.setFont(new Font("Dialog", Font.PLAIN, 18));
		Zacini3.setBounds(40, 255, 97, 23);
		panel_2.add(Zacini3);
		
		JLabel lblKcal3 = new JLabel("   ");
		lblKcal3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKcal3.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblKcal3.setBounds(244, 356, 178, 46);
		panel_2.add(lblKcal3);
		
		JLabel lblUkupno3 = new JLabel("   ");
		lblUkupno3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUkupno3.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblUkupno3.setBounds(526, 356, 178, 46);
		panel_2.add(lblUkupno3);
		
		
		JButton Potvrdi3 = new JButton("Potvrdi");
		Image slikee=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		Potvrdi3.setIcon(new ImageIcon(slikee));
		Potvrdi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double spagete1=Double.parseDouble(txt_Spageti2.getText());
				double spagete2=0.096;
				double spagete=(spagete1 * spagete2);
				String ukSpagete = String.format("%.2f", spagete);
				lblUkupno3.setText(ukSpagete);
				
				double spagetekal=1.577;
				double spagetekcl=(spagete1*spagetekal);
				String ukSpageteKal = String.format("%.2f", spagetekcl);
				lblKcal3.setText(ukSpageteKal);
				
				double tuna1=Double.parseDouble(txt_Tuna.getText());
				double tuna2=1.4;
				double tuna=(tuna1 * tuna2);
				String ukTuna = String.format("%.2f", spagete + tuna);
				lblUkupno3.setText(ukTuna);
				
				double tunakal=1.29;
				double tunakcl=(tuna1*tunakal);
				String ukTunaKal = String.format("%.2f", spagetekcl, tunakcl);
				lblKcal3.setText(ukTunaKal);
				
				double luk1=Double.parseDouble(txt_Luk_2.getText());
				double luk2=0.038;
				double luk=(luk1 * luk2);
				String ukLuk = String.format("%.2f", spagete + tuna + luk);
				lblUkupno3.setText(ukLuk);
				
				double lukkal=0.4;
				double lukkcl=(luk1*lukkal);
				String ukLukKal = String.format("%.2f", spagetekcl + tunakcl + lukkcl);
				lblKcal3.setText(ukLukKal);
				
				double par1=Double.parseDouble(txt_Paradajz_2.getText());
				double par2=0.12;
				double paradajz=(par1 * par2);
				String ukPar = String.format("%.2f", spagete + tuna + luk + paradajz);
				lblUkupno3.setText(ukPar);
				
				double parkal=0.18;
				double parkcl=(par1*parkal);
				String ukParKal = String.format("%.2f", spagetekcl + tunakcl + lukkcl + parkcl);
				lblKcal3.setText(ukParKal);
				
				double limun1=Double.parseDouble(txt_Limun.getText());
				double limun2=0.14;
				double limun=(limun1 * limun2);
				String ukLimun = String.format("%.2f", spagete + tuna + luk + paradajz + limun);
				lblUkupno3.setText(ukLimun);
				
				double limunkal=0.28;
				double limunkcl=(limun1*limunkal);
				String ukLimunKal = String.format("%.2f", spagetekcl + tunakcl + lukkcl + parkcl + limunkcl);
				lblKcal3.setText(ukLimunKal);
				
				double zacin2= 15;
				if(Zacini3.isSelected()) {
					String ukza2= String.format("%.2f", spagete + tuna + luk + paradajz + limun + zacin2);
					lblUkupno3.setText(ukza2);
				}
			}
		});
		Potvrdi3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Potvrdi3.setBounds(38, 337, 156, 53);
		panel_2.add(Potvrdi3);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(472, 287, 13, 144);
		panel_2.add(separator_6);
		
		JLabel label_2 = new JLabel("Ukupna cena namirnica");
		label_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		label_2.setBounds(510, 313, 218, 33);
		panel_2.add(label_2);
		
		
		JLabel label_4 = new JLabel("dinara");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(619, 353, 74, 46);
		panel_2.add(label_4);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setBounds(24, 287, 370, 7);
		panel_2.add(separator_14);
		
		JSeparator separator_17 = new JSeparator();
		separator_17.setOrientation(SwingConstants.VERTICAL);
		separator_17.setBounds(17, 50, 13, 234);
		panel_2.add(separator_17);
		
		JLabel label_5 = new JLabel("kcal");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBounds(366, 355, 74, 46);
		panel_2.add(label_5);
		
		JLabel lblUkupnaKalorijskaVrednost_1 = new JLabel("Ukupna kalorijska vrednost");
		lblUkupnaKalorijskaVrednost_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUkupnaKalorijskaVrednost_1.setBounds(204, 313, 241, 33);
		panel_2.add(lblUkupnaKalorijskaVrednost_1);
		
		txt_Spageti2 = new JTextField();
		txt_Spageti2.setText("0");
		txt_Spageti2.setColumns(10);
		txt_Spageti2.setBounds(156, 61, 59, 22);
		panel_2.add(txt_Spageti2);
		
		JLabel lblLimun = new JLabel("Limun");
		lblLimun.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblLimun.setBounds(42, 207, 79, 25);
		panel_2.add(lblLimun);
		
		txt_Limun = new JTextField();
		txt_Limun.setText("0");
		txt_Limun.setColumns(10);
		txt_Limun.setBounds(156, 207, 59, 22);
		panel_2.add(txt_Limun);
		
		JLabel lblKom_1 = new JLabel("kom");
		lblKom_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblKom_1.setBounds(225, 199, 53, 33);
		panel_2.add(lblKom_1);
		
		JPanel Ukupno = new JPanel();
		tabbedPane.addTab("Ukupno", null, Ukupno, null);
		Ukupno.setLayout(null);
		
		JLabel lblMilanesePasta = new JLabel("Milanese pasta");
		lblMilanesePasta.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblMilanesePasta.setBackground(Color.GRAY);
		lblMilanesePasta.setBounds(26, 11, 254, 33);
		panel_1.add(lblMilanesePasta);
		
		JLabel lblSpageti1 = new JLabel("\u0160pageti");
		lblSpageti1.setForeground(new Color(0, 0, 0));
		lblSpageti1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblSpageti1.setBounds(40, 60, 127, 33);
		panel_1.add(lblSpageti1);
		
		JLabel lblParadajz_1 = new JLabel("Paradajz");
		lblParadajz_1.setForeground(new Color(0, 0, 0));
		lblParadajz_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblParadajz_1.setBounds(40, 105, 79, 33);
		panel_1.add(lblParadajz_1);
		
		JLabel lblLuk_2 = new JLabel("Luk");
		lblLuk_2.setForeground(new Color(0, 0, 0));
		lblLuk_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblLuk_2.setBounds(40, 151, 59, 33);
		panel_1.add(lblLuk_2);
		
		JLabel lblPersun = new JLabel("Per\u0161un");
		lblPersun.setForeground(new Color(0, 0, 0));
		lblPersun.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblPersun.setBounds(40, 197, 79, 33);
		panel_1.add(lblPersun);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(24, 45, 370, 2);
		panel_1.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(24, 241, 370, 7);
		panel_1.add(separator_9);
		
		JTextArea txtRecept2 = new JTextArea();
		txtRecept2.setText("Na ulju proprzite 100gr sitno seckanog luka,\r\nposolite i dinstajte ga povremeno dolivajuci\r\nvrlo malo vode. Luk mora sasvim da se istopi.\r\nGotovo je kad luk postane zlatno-zut\r\n(skoro svetlobraon) i ka\u0161ast. Tad dodajte 100gr \r\nparadajza seckan na kockice, sipajte casu vode i\r\ndinstajte na laganoj vatri sat i po dodajuci vodu po potrebi.\r\nGotovim sosom preliti prethodno skuvanih 300gr spageta.\r\nNa kraju dodati 5gr persuna.\r\n");
		txtRecept2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
		txtRecept2.setBounds(423, 45, 370, 241);
		panel_1.add(txtRecept2);
		
		JLabel label_20 = new JLabel("Ukupna cena namirnica");
		label_20.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		label_20.setBounds(510, 313, 218, 33);
		panel_1.add(label_20);
		
		txt_Spagete1 = new JTextField();
		txt_Spagete1.setColumns(10);
		txt_Spagete1.setText("0");
		txt_Spagete1.setBounds(157, 68, 59, 22);
		panel_1.add(txt_Spagete1);
		
		txt_Paradajz = new JTextField();
		txt_Paradajz.setColumns(10);
		txt_Paradajz.setText("0");
		txt_Paradajz.setBounds(157, 113, 59, 22);
		panel_1.add(txt_Paradajz);
		
		txt_Luk1 = new JTextField();
		txt_Luk1.setColumns(10);
		txt_Luk1.setText("0");
		txt_Luk1.setBounds(157, 159, 59, 22);
		panel_1.add(txt_Luk1);
		
		txt_Persun = new JTextField();
		txt_Persun.setColumns(10);
		txt_Persun.setText("0");
		txt_Persun.setBounds(157, 205, 59, 22);
		panel_1.add(txt_Persun);
		
		JLabel lblGr_1 = new JLabel("gr");
		lblGr_1.setForeground(new Color(0, 0, 0));
		lblGr_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblGr_1.setBounds(228, 60, 53, 33);
		panel_1.add(lblGr_1);
		
		JLabel lblDl = new JLabel("gr");
		lblDl.setForeground(new Color(0, 0, 0));
		lblDl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblDl.setBounds(228, 102, 53, 33);
		panel_1.add(lblDl);
		
		JLabel label_23 = new JLabel("gr");
		label_23.setForeground(new Color(0, 0, 0));
		label_23.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_23.setBounds(228, 151, 53, 33);
		panel_1.add(label_23);
		
		JLabel label_24 = new JLabel("gr");
		label_24.setForeground(new Color(0, 0, 0));
		label_24.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_24.setBounds(228, 197, 53, 33);
		panel_1.add(label_24);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(398, 51, 13, 235);
		panel_1.add(separator_11);
		
		JLabel Recept2 = new JLabel("Recept");
		Image slike31=new ImageIcon(this.getClass().getResource("/recept.png")).getImage();
		Recept2.setIcon(new ImageIcon(slike31));
		Recept2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		Recept2.setBackground(Color.GRAY);
		Recept2.setBounds(538, 0, 156, 44);
		panel_1.add(Recept2);
		
		JLabel lblKcal2 = new JLabel("   ");
		lblKcal2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKcal2.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblKcal2.setBounds(244, 356, 178, 46);
		panel_1.add(lblKcal2);
		
		JCheckBox Zacini2 = new JCheckBox("Za\u010Dini");
		Zacini2.setFont(new Font("Dialog", Font.PLAIN, 18));
		Zacini2.setBounds(40, 257, 97, 23);
		panel_1.add(Zacini2);
		
		JButton Potvrdi2 = new JButton("Potvrdi");
		Image slike11=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		Potvrdi2.setIcon(new ImageIcon(slike11));
		Potvrdi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double spagete1=Double.parseDouble(txt_Spagete1.getText());
				double spagete2=0.096;
				double spagete=(spagete1 * spagete2);
				String ukSpagete = String.format("%.2f", spagete);
				lblUkupno2.setText(ukSpagete);
				
				double spagetekal=1.577;
				double spagetekcl=(spagete1*spagetekal);
				String ukSpageteKal = String.format("%.2f", spagetekcl);
				lblKcal2.setText(ukSpageteKal);
				
				double par1=Double.parseDouble(txt_Paradajz.getText());
				double par2=0.12;
				double paradajz;
				paradajz=(par1 * par2);
				String ukPar = String.format("%.2f", spagete + paradajz);
				lblUkupno2.setText(ukPar);
				
				double parkal=0.18;
				double parkcl=(par1*parkal);
				String ukParKal = String.format("%.2f", spagetekcl + parkcl);
				lblKcal2.setText(ukParKal);
			
				
				double luk1=Double.parseDouble(txt_Luk1.getText());
				double luk2=0.038;
				double luk=(luk1 * luk2);
				String ukLuk = String.format("%.2f", spagete + paradajz + luk);
				lblUkupno2.setText(ukLuk);
				
				double lukkal=0.4;
				double lukkcl=(luk1*lukkal);
				String ukLukKal = String.format("%.2f", spagetekcl + parkcl + lukkcl);
				lblKcal2.setText(ukLukKal);
				
				
				double per1=Double.parseDouble(txt_Persun.getText());
				double per2=0.5;
				double per=(per1 * per2);
				String ukPer= String.format("%.2f", spagete + paradajz + luk + per);
				lblUkupno2.setText(ukPer);
				
				double perkal=0.36;
				double perkcl=(per1*perkal);
				String ukPerKal = String.format("%.2f", spagetekcl + parkcl + lukkcl + perkcl);
				lblKcal2.setText(ukPerKal);
		
				
				double zacin1= 15;
				if(Zacini2.isSelected()) {
					String ukza1= String.format("%.2f", spagete + paradajz + luk + per + zacin1);
					lblUkupno2.setText(ukza1);
				}
				
				
			}
		});
		Potvrdi2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Potvrdi2.setBounds(38, 337, 156, 53);
		panel_1.add(Potvrdi2);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(472, 287, 13, 128);
		panel_1.add(separator_5);
		
		
		JLabel label_3 = new JLabel("dinara");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(619, 352, 74, 49);
		panel_1.add(label_3);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setBounds(26, 287, 370, 7);
		panel_1.add(separator_16);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setBounds(17, 45, 13, 241);
		panel_1.add(separator_10);
		
		
		JLabel lblUkupnaKalorijskaVredonst = new JLabel("Ukupna kalorijska vrednost");
		lblUkupnaKalorijskaVredonst.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUkupnaKalorijskaVredonst.setBounds(204, 313, 241, 33);
		panel_1.add(lblUkupnaKalorijskaVredonst);
		
		JLabel label_6 = new JLabel("kcal");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_6.setBounds(366, 355, 74, 46);
		panel_1.add(label_6);
		
		JButton btnPotvrdiporudbinu = new JButton("Potvrdi porud\u017Ebinu");
		Image potvrdi=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		btnPotvrdiporudbinu.setIcon(new ImageIcon(potvrdi));
		btnPotvrdiporudbinu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false); 
				dispose();
				Podaci p=new Podaci();
				p.setVisible(true);

			}
			
		});
		btnPotvrdiporudbinu.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPotvrdiporudbinu.setBounds(71, 292, 265, 48);
		Ukupno.add(btnPotvrdiporudbinu);
		
		JButton btnOtkazi = new JButton("Otka\u017Ei");
		Image otkazi=new ImageIcon(this.getClass().getResource("/otkazi.png")).getImage();
		btnOtkazi.setIcon(new ImageIcon(otkazi));
		btnOtkazi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] obcija = { "Da", "Ne" };
				  int izbor = JOptionPane.showOptionDialog(null, 
					      "Da li stvarno zelite izaci?", 
					      "Izlaz?", 
					      JOptionPane.YES_NO_OPTION, 
					      JOptionPane.QUESTION_MESSAGE, 
					      null, null, null);
				
				if (izbor == JOptionPane.YES_OPTION)
				  {
					contentPane.setVisible(false); 
					dispose();
					Hrana hr=new Hrana();
					hr.setVisible(true);
				  }		
			}
		});
		
		btnOtkazi.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOtkazi.setBounds(472, 292, 221, 48);
		Ukupno.add(btnOtkazi);
		
		JLabel lblDaLielite = new JLabel("Da li \u017Eelite da potvrdite porud\u017Ebinu?");
		lblDaLielite.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
		lblDaLielite.setBounds(244, 231, 354, 48);
		Ukupno.add(lblDaLielite);
		
		JSeparator separator_20 = new JSeparator();
		separator_20.setBackground(Color.LIGHT_GRAY);
		separator_20.setBounds(57, 231, 710, 27);
		Ukupno.add(separator_20);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Microsoft Sans Serif", Font.ITALIC, 17));
		textArea.setBounds(113, 59, 444, 136);
		Ukupno.add(textArea);
		
		JButton btnIspis = new JButton("Ispis ra\u010Duna");
		btnIspis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textArea.append("\n --------------------------------------------------------------------------------");
			textArea.append("\n Vrednost namirnica za Carboanra pastu je "+lblUkupno1.getText()+" dinara.");
			textArea.append("\n Vrednost namirnica Milanese pastu je "+lblUkupno2.getText()+" dinara.");
			textArea.append("\n Vrednost namirnica za Tuna pastu je "+lblUkupno3.getText()+" dinara.");
			textArea.append("\n --------------------------------------------------------------------------------");
			}
		});
		btnIspis.setBounds(580, 121, 152, 25);
		Ukupno.add(btnIspis);
		
		JLabel lblIspisRauna = new JLabel("Ispis ra\u010Duna");
		lblIspisRauna.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblIspisRauna.setBackground(Color.GRAY);
		lblIspisRauna.setBounds(257, 19, 254, 33);
		Ukupno.add(lblIspisRauna);
		
		JLabel lblunetiPodatkeO = new JLabel("(Uneti podatke o dostavi)");
		lblunetiPodatkeO.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 17));
		lblunetiPodatkeO.setBounds(116, 332, 190, 48);
		Ukupno.add(lblunetiPodatkeO);
		
	}
}
