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

public class Dorucak extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Jaja;
	private JTextField txt_Sunka;
	private JTextField txt_Sir;
	private JTextField txt_Paradajz;
	private JTextField txt_Jaja1;
	private JTextField txt_Mleko;
	private JTextField txt_Brasno;
	private JTextField txt_Slanina;
	private JTextField txt_Jaja2;
	private JTextField txt_Hleb;
	private JTextField txt_Mleko1;
	private JTextField txt_Slanina1;
	private JTextField txt_Kackavalj;
	private JCheckBox Zacini1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dorucak frame = new Dorucak();
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
	public Dorucak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 810, 445);
		contentPane.add(tabbedPane);
		
		JPanel Omlet = new JPanel();
		tabbedPane.addTab("Omlet sa \u0161unkom", null, Omlet, null);
		Omlet.setLayout(null);
		
		JLabel lblJaja = new JLabel("Jaja");
		lblJaja.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblJaja.setBounds(40, 60, 53, 33);
		Omlet.add(lblJaja);
		
		JLabel lblSunka = new JLabel("\u0160unka");
		lblSunka.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblSunka.setBounds(40, 105, 79, 33);
		Omlet.add(lblSunka);
		
		JLabel lblSir = new JLabel("Sir");
		lblSir.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblSir.setBounds(40, 151, 59, 33);
		Omlet.add(lblSir);
		
		JLabel lblParadajz = new JLabel("Paradajz");
		lblParadajz.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblParadajz.setBounds(40, 197, 79, 33);
		Omlet.add(lblParadajz);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 45, 370, 2);
		Omlet.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 288, 370, 7);
		Omlet.add(separator_1);
		
		JTextArea txtRecept1 = new JTextArea();
		txtRecept1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
		txtRecept1.setText("U posudi dobro umutite 2 cela jaja. Dodajte 50gr \r\nsira i nastavite mucenje. Ukoliko nastavite mucenje\r\ndok mesavina ne postane homogena, ukus sira bice blazi. \r\nListove sunke (50 gr) mozete ubaciti cele ili ih iseci/iscepkati \r\nna sitnije komade. U prvom slucaju ih ne morate pomesati \r\nvec ih samo naslagati na dnu suda i preko preliti, dok ih u \r\ndrugom slucaju ubacite kada i sir i zajedno umutite.\r\nNa kraju dodati 100 gr svezeg paradajza.\r\nPosolite i zacinite po ukusu.");
		txtRecept1.setBounds(423, 45, 370, 240);
		Omlet.add(txtRecept1);
		
		txt_Jaja = new JTextField();
		txt_Jaja.setBounds(157, 68, 59, 22);
		txt_Jaja.setText("0");
		Omlet.add(txt_Jaja);
		txt_Jaja.setColumns(10);
		
		txt_Sunka = new JTextField();
		txt_Sunka.setColumns(10);
		txt_Sunka.setText("0");
		txt_Sunka.setBounds(157, 113, 59, 22);
		Omlet.add(txt_Sunka);
		
		txt_Sir = new JTextField();
		txt_Sir.setColumns(10);
		txt_Sir.setText("0");
		txt_Sir.setBounds(157, 159, 59, 22);
		Omlet.add(txt_Sir);
		
		txt_Paradajz = new JTextField();
		txt_Paradajz.setColumns(10);
		txt_Paradajz.setText("0");
		txt_Paradajz.setBounds(157, 205, 59, 22);
		Omlet.add(txt_Paradajz);
		
		JLabel lblGr = new JLabel("gr");
		lblGr.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblGr.setBounds(228, 102, 53, 33);
		Omlet.add(lblGr);
		
		JLabel label = new JLabel("gr");
		label.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label.setBounds(228, 151, 53, 33);
		Omlet.add(label);
		
		JLabel label_1 = new JLabel("gr");
		label_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_1.setBounds(228, 197, 53, 33);
		Omlet.add(label_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(398, 49, 13, 236);
		Omlet.add(separator_3);
		
		JLabel lblKcal = new JLabel("kcal");
		lblKcal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKcal.setBounds(366, 355, 74, 46);
		Omlet.add(lblKcal);
		
		JLabel lblKcal1 = new JLabel("   ");
		lblKcal1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKcal1.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblKcal1.setBounds(244, 356, 178, 46);
		Omlet.add(lblKcal1);
		
		JLabel lblUkupno1 = new JLabel("   ");
		lblUkupno1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUkupno1.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblUkupno1.setBounds(526, 356, 178, 46);
		Omlet.add(lblUkupno1);
		
		JButton Potvrdi1 = new JButton("Potvrdi");
		Image slike=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		Potvrdi1.setIcon(new ImageIcon(slike));
		Potvrdi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double jaje1=Double.parseDouble(txt_Jaja.getText());
				double jaje2=11.5;
				double jaje=(jaje1 * jaje2);
				String ukJaje = String.format("%.2f", jaje);
				lblUkupno1.setText(ukJaje);
				
				double jajekal=147;
				double jajekcl=(jaje1*jajekal);
				String ukJajeKal = String.format("%.2f", jajekcl);
				lblKcal1.setText(ukJajeKal);
				
				
				double sunka1=Double.parseDouble(txt_Sunka.getText());
				double sunka2=0.35;
				double sunka=(sunka1 * sunka2);
				String ukSunka = String.format("%.2f", sunka + jaje);
				lblUkupno1.setText(ukSunka);
				
				double sunkakal=1.451;
				double sunkakcl=(sunka1*sunkakal);
				String ukSunkaKal = String.format("%.2f", jajekcl + sunkakcl);
				lblKcal1.setText(ukSunkaKal);
				
				
				double sir1=Double.parseDouble(txt_Sir.getText());
				double sir2=0.3;
				double sir;
				sir=(sir1 * sir2);
				String ukSir = String.format("%.2f", sir + sunka + jaje);
				lblUkupno1.setText(ukSir);
				
				double sirkal=3.57;
				double sirkcl=(sir1*sirkal);
				String ukSirKal = String.format("%.2f", jajekcl + sunkakcl + sirkcl);
				lblKcal1.setText(ukSirKal);
				
				
				double par1=Double.parseDouble(txt_Paradajz.getText());
				double par2=0.12;
				double paradajz;
				paradajz=(par1 * par2);
				String ukPar = String.format("%.2f", paradajz + sir + sunka + jaje);
				lblUkupno1.setText(ukPar);
				
				double parkal=0.18;
				double parkcl=(par1*parkal);
				String ukParKal = String.format("%.2f", jajekcl + sunkakcl + sirkcl + parkcl);
				lblKcal1.setText(ukParKal);
				;
				
				double zacin= 15;
				if(Zacini1.isSelected()) {
					String ukza= String.format("%.2f", paradajz + sir + sunka + jaje+ zacin);
					lblUkupno1.setText(ukza);
				}
				
			}
		});
		
		Potvrdi1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Potvrdi1.setBounds(38, 337, 156, 53);
		Omlet.add(Potvrdi1);
		
		JLabel Recept1 = new JLabel("Recept");
		Image slike1=new ImageIcon(this.getClass().getResource("/recept.png")).getImage();
		Recept1.setIcon(new ImageIcon(slike1));
		Recept1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		Recept1.setBackground(Color.GRAY);
		Recept1.setBounds(538, 0, 164, 47);
		Omlet.add(Recept1);
		
		JLabel label_13 = new JLabel("Omlet sa \u0161unkom");
		label_13.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		label_13.setBackground(Color.GRAY);
		label_13.setBounds(40, 14, 290, 33);
		Omlet.add(label_13);
		
		JLabel lblKom = new JLabel("kom");
		lblKom.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblKom.setBounds(228, 60, 53, 33);
		Omlet.add(lblKom);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(472, 287, 13, 128);
		Omlet.add(separator_4);
		
		Zacini1 = new JCheckBox("Za\u010Dini");
		Zacini1.setFont(new Font("Dialog", Font.PLAIN, 18));
		Zacini1.setBounds(40, 258, 97, 23);
		Omlet.add(Zacini1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(24, 241, 370, 7);
		Omlet.add(separator_2);
		
		JLabel lblUkupnaKalorijskaVrednost = new JLabel("Ukupna kalorijska vrednost");
		lblUkupnaKalorijskaVrednost.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUkupnaKalorijskaVrednost.setBackground(Color.GRAY);
		lblUkupnaKalorijskaVrednost.setBounds(204, 299, 266, 60);
		Omlet.add(lblUkupnaKalorijskaVrednost);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(17, 50, 13, 235);
		Omlet.add(separator_7);
		
		JLabel label_7 = new JLabel("dinara");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_7.setBounds(619, 352, 74, 49);
		Omlet.add(label_7);
		
		JLabel label_9 = new JLabel("Ukupna cena namirnica");
		label_9.setFont(new Font("Dialog", Font.BOLD, 18));
		label_9.setBounds(510, 313, 218, 33);
		Omlet.add(label_9);
		
		JPanel KajganaSaMlekom = new JPanel();
		tabbedPane.addTab("Kajgana sa mlekom", null, KajganaSaMlekom, null);
		KajganaSaMlekom.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 805, 415);
		KajganaSaMlekom.add(panel_1);
		
		JLabel lblUkupno2 = new JLabel("   ");
		lblUkupno2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUkupno2.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblUkupno2.setBounds(526, 356, 178, 46);
		panel_1.add(lblUkupno2);
		
		JPanel PunjenePrzenice = new JPanel();
		tabbedPane.addTab("Punjene pr\u017Eenice", null, PunjenePrzenice, null);
		PunjenePrzenice.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 805, 415);
		PunjenePrzenice.add(panel_2);
		
		JLabel lblPunjenePrenice = new JLabel("Punjene pr\u017Eenice");
		lblPunjenePrenice.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblPunjenePrenice.setBackground(Color.GRAY);
		lblPunjenePrenice.setBounds(24, 12, 227, 33);
		panel_2.add(lblPunjenePrenice);
		
		JLabel label_17 = new JLabel("Jaja");
		label_17.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_17.setBounds(40, 50, 53, 25);
		panel_2.add(label_17);
		
		JLabel lblHleb = new JLabel("Hleb");
		lblHleb.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblHleb.setBounds(40, 82, 79, 33);
		panel_2.add(lblHleb);
		
		JLabel lblMleko_1 = new JLabel("Mleko");
		lblMleko_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMleko_1.setBounds(40, 121, 59, 25);
		panel_2.add(lblMleko_1);
		
		JLabel lblSlanina_1 = new JLabel("Slanina");
		lblSlanina_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblSlanina_1.setBounds(40, 159, 79, 25);
		panel_2.add(lblSlanina_1);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(24, 45, 370, 2);
		panel_2.add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(23, 243, 370, 7);
		panel_2.add(separator_13);
		
		JTextArea txtRecept3 = new JTextArea();
		txtRecept3.setText("Iseci 200 gr hleba na komade, a 100 gr slanine \r\ni 100 gr kackavalja na listice. Od hleba, \r\nslanine i kackavalja napraviti sendvice. \r\nUmutiti 3 jaja i 100 ml mleka, pa \r\nnapravljene sendvice umakati u umucenu smesu.\r\n");
		txtRecept3.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 16));
		txtRecept3.setBounds(423, 45, 370, 240);
		panel_2.add(txtRecept3);
		
		txt_Jaja2 = new JTextField();
		txt_Jaja2.setColumns(10);
		txt_Jaja2.setText("0");
		txt_Jaja2.setBounds(157, 54, 59, 22);
		panel_2.add(txt_Jaja2);
		
		txt_Hleb = new JTextField();
		txt_Hleb.setColumns(10);
		txt_Hleb.setText("0");
		txt_Hleb.setBounds(157, 89, 59, 22);
		panel_2.add(txt_Hleb);
		
		txt_Mleko1 = new JTextField();
		txt_Mleko1.setColumns(10);
		txt_Mleko1.setText("0");
		txt_Mleko1.setBounds(157, 125, 59, 22);
		panel_2.add(txt_Mleko1);
		
		txt_Slanina1 = new JTextField();
		txt_Slanina1.setColumns(10);
		txt_Slanina1.setText("0");
		txt_Slanina1.setBounds(157, 163, 59, 22);
		panel_2.add(txt_Slanina1);
		
		txt_Kackavalj = new JTextField();
		txt_Kackavalj.setColumns(10);
		txt_Kackavalj.setText("0");
		txt_Kackavalj.setBounds(157, 198, 59, 22);
		panel_2.add(txt_Kackavalj);
		
		JLabel label_29 = new JLabel("kom");
		label_29.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_29.setBounds(228, 46, 53, 33);
		panel_2.add(label_29);
		
		JLabel label_30 = new JLabel("gr");
		label_30.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_30.setBounds(228, 86, 53, 25);
		panel_2.add(label_30);
		
		JLabel lblMl = new JLabel("ml");
		lblMl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMl.setBounds(228, 117, 53, 33);
		panel_2.add(lblMl);
		
		JLabel label_32 = new JLabel("gr");
		label_32.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_32.setBounds(228, 159, 53, 33);
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
				double jaje5=Double.parseDouble(txt_Jaja2.getText());
				double jaje6=11.5;
				double jajeee=(jaje5 * jaje6);
				String ukJaj = String.format("%.2f", jajeee);
				lblUkupno3.setText(ukJaj);
				
				double jaje2kal=147;
				double jaje2kcl=(jaje5*jaje2kal);
				String ukJaje2Kal = String.format("%.2f", jaje2kcl);
				lblKcal3.setText(ukJaje2Kal);
				
				double hleb1=Double.parseDouble(txt_Hleb.getText());
				double hleb2=0.08;
				double hleb=(hleb1 * hleb2);
				String ukHleb = String.format("%.2f", hleb + jajeee);
				lblUkupno3.setText(ukHleb);
				
				double hlebkal=2.64;
				double hlebkcl=(hleb1*hlebkal);
				String ukHlebKal = String.format("%.2f", jaje2kcl + hlebkcl);
				lblKcal3.setText(ukHlebKal);
				
				double mleko3=Double.parseDouble(txt_Mleko1.getText());
				double mleko4=0.07;
				double mlekoo=(mleko3 * mleko4);
				String ukMlek = String.format("%.2f", hleb + jajeee + mlekoo);
				lblUkupno3.setText(ukMlek);
				
				double mleko1kal=2.64;
				double mleko1kcl=(mleko3*mleko1kal);
				String ukMleko1Kal = String.format("%.2f", jaje2kcl + hlebkcl + mleko1kcl);
				lblKcal3.setText(ukMleko1Kal);
				
				double slan3=Double.parseDouble(txt_Slanina1.getText());
				double slan4=0.8;
				double slaninaa=(slan3 * slan4);
				String ukSlan1= String.format("%.2f", hleb + jajeee + mlekoo + slaninaa);
				lblUkupno3.setText(ukSlan1);
				
				double slan1kal=7.81;
				double slan1kcl=(slan3*slan1kal);
				String ukSlan1Kal = String.format("%.2f", jaje2kcl + hlebkcl + mleko1kcl + slan1kcl);
				lblKcal3.setText(ukSlan1Kal);
				
				double kackavalj1=Double.parseDouble(txt_Kackavalj.getText());
				double kackavalj2=1;
				double kackavalj;
				kackavalj=(kackavalj1 * kackavalj2);
				String ukKack= String.format("%.2f", hleb + jajeee + mlekoo + slaninaa + kackavalj);
				lblUkupno3.setText(ukKack);
				
				double kackal=3.89;
				double kackcl=(kackavalj1*kackal);
				String ukKacKal = String.format("%.2f", jaje2kcl + hlebkcl + mleko1kcl + slan1kcl + kackcl);
				lblKcal3.setText(ukKacKal);
				
				
				
				double zacin2= 15;
				if(Zacini3.isSelected()) {
					String ukza2= String.format("%.2f", hleb + jajeee + mlekoo + slaninaa + kackavalj + zacin2);
					lblUkupno3.setText(ukza2);
				}
			}
		});
		Potvrdi3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Potvrdi3.setBounds(38, 337, 156, 53);
		panel_2.add(Potvrdi3);
		
		JLabel lblKakavalj = new JLabel("Ka\u010Dkavalj");
		lblKakavalj.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblKakavalj.setBounds(40, 197, 79, 25);
		panel_2.add(lblKakavalj);
		
		
		JLabel label_22 = new JLabel("gr");
		label_22.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_22.setBounds(228, 197, 53, 33);
		panel_2.add(label_22);
		
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
		
		JPanel Ukupno = new JPanel();
		tabbedPane.addTab("Ukupno", null, Ukupno, null);
		Ukupno.setLayout(null);
		
		JLabel lblKajganaSaMlekom = new JLabel("Kajgana sa mlekom");
		lblKajganaSaMlekom.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblKajganaSaMlekom.setBackground(Color.GRAY);
		lblKajganaSaMlekom.setBounds(26, 11, 254, 33);
		panel_1.add(lblKajganaSaMlekom);
		
		JLabel label_15 = new JLabel("Jaja");
		label_15.setForeground(new Color(0, 0, 0));
		label_15.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_15.setBounds(40, 60, 53, 33);
		panel_1.add(label_15);
		
		JLabel lblMleko = new JLabel("Mleko");
		lblMleko.setForeground(new Color(0, 0, 0));
		lblMleko.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMleko.setBounds(40, 105, 79, 33);
		panel_1.add(lblMleko);
		
		JLabel lblBrano = new JLabel("Bra\u0161no");
		lblBrano.setForeground(new Color(0, 0, 0));
		lblBrano.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblBrano.setBounds(40, 151, 59, 33);
		panel_1.add(lblBrano);
		
		JLabel lblSlanina = new JLabel("Slanina");
		lblSlanina.setForeground(new Color(0, 0, 0));
		lblSlanina.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblSlanina.setBounds(40, 197, 79, 33);
		panel_1.add(lblSlanina);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(24, 45, 370, 2);
		panel_1.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(24, 241, 370, 7);
		panel_1.add(separator_9);
		
		JTextArea txtRecept2 = new JTextArea();
		txtRecept2.setText("Dobro umutiti 2 jaja i dodati im 50gr brasna, \r\nso i 100 ml mleka. Sve zajedno opet dobro umutiti. \r\nU tiganju proprziti 100 gr slanine i dodati umucenu \r\nsmesu. Kada se na donjoj strani dobro zapece, \r\npreklopiti je i staviti na tanjir. \r\nPosipati seckanim persunovim listom. \r\n");
		txtRecept2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 16));
		txtRecept2.setBounds(423, 45, 370, 241);
		panel_1.add(txtRecept2);
		
		JLabel label_20 = new JLabel("Ukupna cena namirnica");
		label_20.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		label_20.setBounds(510, 313, 218, 33);
		panel_1.add(label_20);
		
		txt_Jaja1 = new JTextField();
		txt_Jaja1.setColumns(10);
		txt_Jaja1.setText("0");
		txt_Jaja1.setBounds(157, 68, 59, 22);
		panel_1.add(txt_Jaja1);
		
		txt_Mleko = new JTextField();
		txt_Mleko.setColumns(10);
		txt_Mleko.setText("0");
		txt_Mleko.setBounds(157, 113, 59, 22);
		panel_1.add(txt_Mleko);
		
		txt_Brasno = new JTextField();
		txt_Brasno.setColumns(10);
		txt_Brasno.setText("0");
		txt_Brasno.setBounds(157, 159, 59, 22);
		panel_1.add(txt_Brasno);
		
		txt_Slanina = new JTextField();
		txt_Slanina.setColumns(10);
		txt_Slanina.setText("0");
		txt_Slanina.setBounds(157, 205, 59, 22);
		panel_1.add(txt_Slanina);
		
		JLabel label_21 = new JLabel("kom");
		label_21.setForeground(new Color(0, 0, 0));
		label_21.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_21.setBounds(228, 60, 53, 33);
		panel_1.add(label_21);
		
		JLabel lblDl = new JLabel("ml");
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
				double jaje3=Double.parseDouble(txt_Jaja1.getText());
				double jaje4=11.5;
				double jajee=(jaje3 * jaje4);
				String ukJajee = String.format("%.2f", jajee);
				lblUkupno2.setText(ukJajee);
				
				double jaje1kal=147;
				double jaje1kcl=(jaje3*jaje1kal);
				String ukJaje1Kal = String.format("%.2f", jaje1kcl);
				lblKcal2.setText(ukJaje1Kal);
				
				
				double mleko1=Double.parseDouble(txt_Mleko.getText());
				double mleko2=0.07;
				double mleko=(mleko1 * mleko2);
				String ukMleko = String.format("%.2f", mleko + jajee);
				lblUkupno2.setText(ukMleko);
				
				double mlekokal=0.55;
				double mlekokcl=(mleko1*mlekokal);
				String ukMlekoKal = String.format("%.2f", jaje1kcl + mlekokcl);
				lblKcal2.setText(ukMlekoKal);
			
				
				
				double brasno1=Double.parseDouble(txt_Brasno.getText());
				double brasno2=0.05;
				double brasno=(brasno1 * brasno2);
				String ukBrasno = String.format("%.2f", brasno + mleko + jajee);
				lblUkupno2.setText(ukBrasno);
				
				double brasnokal=3.5;
				double brasnokcl=(brasno1*brasnokal);
				String ukBrasnoKal = String.format("%.2f", jaje1kcl + mlekokcl + brasnokcl);
				lblKcal2.setText(ukBrasnoKal);
				
				
				double slan1=Double.parseDouble(txt_Slanina.getText());
				double slan2=0.8;
				double slanina=(slan1 * slan2);
				String ukSlan= String.format("%.2f", slanina + brasno + mleko + jajee);
				lblUkupno2.setText(ukSlan);
				
				double slankal=7.81;
				double slankcl=(slan1*slankal);
				String ukSlanKal = String.format("%.2f", jaje1kcl + mlekokcl + brasnokcl + slankcl);
				lblKcal2.setText(ukSlanKal);
		
				
				double zacin1= 15;
				if(Zacini2.isSelected()) {
					String ukza1= String.format("%.2f", slanina + brasno + mleko + jajee + zacin1);
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
			textArea.append("\n Vrednost namirnica za omlet sa sunkom je "+lblUkupno1.getText()+" dinara.");
			textArea.append("\n Vrednost namirnica kajganu sa mlekom je "+lblUkupno2.getText()+" dinara.");
			textArea.append("\n Vrednost namirnica za punjene przenice je "+lblUkupno3.getText()+" dinara.");
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
