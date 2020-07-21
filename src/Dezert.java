import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.AbstractButton;
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

public class Dezert extends JFrame {

	protected static final AbstractButton txt_Spagete1 = null;
	private JPanel contentPane;
	private JTextField txt_Jaja;
	private JTextField txt_Brasno;
	private JTextField txt_Mleko;
	private JTextField txt_Dzem;
	private JTextField txt_Kivi;
	private JTextField txt_Ananas;
	private JTextField txt_Pomorandze;
	private JCheckBox Dodaci1;
	private JTextField txt_Banane;
	private JTextField txt_Krem;
	private JTextField txt_Mlekoo;
	private JTextField txt_Brasnoo;
	private JTextField txt_Jajaa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dezert frame = new Dezert();
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
	public Dezert() {
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
		
		JPanel PalacinkeSaDzemom = new JPanel();
		tabbedPane.addTab("Pala\u010Dinke sa d\u017Eemom", null, PalacinkeSaDzemom, null);
		PalacinkeSaDzemom.setLayout(null);
		
		JLabel lblJaja = new JLabel("Jaja");
		lblJaja.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblJaja.setBounds(40, 60, 128, 33);
		PalacinkeSaDzemom.add(lblJaja);
		
		JLabel lblBrasno = new JLabel("Bra\u0161no");
		lblBrasno.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblBrasno.setBounds(40, 105, 128, 33);
		PalacinkeSaDzemom.add(lblBrasno);
		
		JLabel lblMleko = new JLabel("Mleko");
		lblMleko.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMleko.setBounds(40, 151, 128, 33);
		PalacinkeSaDzemom.add(lblMleko);
		
		JLabel lblDzem = new JLabel("D\u017Eem");
		lblDzem.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblDzem.setBounds(40, 197, 79, 33);
		PalacinkeSaDzemom.add(lblDzem);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 45, 370, 2);
		PalacinkeSaDzemom.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 288, 370, 7);
		PalacinkeSaDzemom.add(separator_1);
		
		JTextArea txtRecept1 = new JTextArea();
		txtRecept1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
		txtRecept1.setText("Sipajte 300gr brasna u posudu, pa dodajte 3 jaja i dobro\r\nizme\u0161ajte. Dodajte 500ml mleka ili vode. Zatim dodajte \r\nprstohvat soli i dve ka\u0161ike secera, pa dobro jedinite,\r\ntako da smesa bude jednolicna i bez grudvica. \r\nTesto ne treba da bude previse gusto, ako je potrebno \r\ndodajte malo kisele vode. Testo prziti na prethodno \r\nzagrejanom tiganju. Po zavrsetku premazivati dzemom\r\n(kolicina po zelji). Kao dodatak dezertu predlazemo \r\ntoping cokoladu.");
		txtRecept1.setBounds(423, 45, 370, 240);
		PalacinkeSaDzemom.add(txtRecept1);
		
		txt_Jaja = new JTextField();
		txt_Jaja.setBounds(157, 68, 59, 22);
		txt_Jaja.setText("0");
		PalacinkeSaDzemom.add(txt_Jaja);
		txt_Jaja.setColumns(10);
		
		txt_Brasno = new JTextField();
		txt_Brasno.setColumns(10);
		txt_Brasno.setText("0");
		txt_Brasno.setBounds(157, 113, 59, 22);
		PalacinkeSaDzemom.add(txt_Brasno);
		
		txt_Mleko = new JTextField();
		txt_Mleko.setColumns(10);
		txt_Mleko.setText("0");
		txt_Mleko.setBounds(157, 159, 59, 22);
		PalacinkeSaDzemom.add(txt_Mleko);
		
		txt_Dzem = new JTextField();
		txt_Dzem.setColumns(10);
		txt_Dzem.setText("0");
		txt_Dzem.setBounds(157, 205, 59, 22);
		PalacinkeSaDzemom.add(txt_Dzem);
		
		JLabel lblGr = new JLabel("gr");
		lblGr.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblGr.setBounds(228, 102, 53, 33);
		PalacinkeSaDzemom.add(lblGr);
		
		JLabel lblMl_1 = new JLabel("ml");
		lblMl_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMl_1.setBounds(228, 151, 53, 33);
		PalacinkeSaDzemom.add(lblMl_1);
		
		JLabel label_1 = new JLabel("gr");
		label_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_1.setBounds(228, 197, 53, 33);
		PalacinkeSaDzemom.add(label_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(398, 49, 13, 236);
		PalacinkeSaDzemom.add(separator_3);
		
		JLabel lblKcal = new JLabel("kcal");
		lblKcal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKcal.setBounds(366, 355, 74, 46);
		PalacinkeSaDzemom.add(lblKcal);
		
		JLabel lblKcal1 = new JLabel("   ");
		lblKcal1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKcal1.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblKcal1.setBounds(244, 356, 178, 46);
		PalacinkeSaDzemom.add(lblKcal1);
		
		JLabel lblUkupno1 = new JLabel("   ");
		lblUkupno1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUkupno1.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblUkupno1.setBounds(526, 356, 178, 46);
		PalacinkeSaDzemom.add(lblUkupno1);
		
		JButton Potvrdi1 = new JButton("Potvrdi");
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
				
				
				double brasno1=Double.parseDouble(txt_Brasno.getText());
				double brasno2=0.05;
				double brasno=(brasno1 * brasno2);
				String ukBrasno = String.format("%.2f", jaje + brasno);
				lblUkupno1.setText(ukBrasno);
				
				double brasnokal=3.5;
				double brasnokcl=(brasno1*brasnokal);
				String ukBrasnoKal = String.format("%.2f", jajekcl + brasnokcl);
				lblKcal1.setText(ukBrasnoKal);
				
				
				double mleko1=Double.parseDouble(txt_Mleko.getText());
				double mleko2=0.07;
				double mleko=(mleko1 * mleko2);
				String ukMleko = String.format("%.2f", jaje + brasno + mleko);
				lblUkupno1.setText(ukMleko);
				
				double mlekokal=0.55;
				double mlekokcl=(mleko1*mlekokal);
				String ukMlekoKal = String.format("%.2f", jajekcl + brasnokcl + mlekokcl);
				lblKcal1.setText(ukMlekoKal);
				
				
				double dzem1=Double.parseDouble(txt_Dzem.getText());
				double dzem2=0.75;
				double dzem=(dzem1 * dzem2);
				String ukDzem = String.format("%.2f", jaje + brasno + mleko + dzem);
				lblUkupno1.setText(ukDzem);
				
				double dzemkal=2.78;
				double dzemkcl=(dzem1*dzemkal);
				String ukDzemKal = String.format("%.2f", jajekcl + brasnokcl + mlekokcl + dzemkcl);
				lblKcal1.setText(ukDzemKal);
				
				double dodaci= 30;
				if(Dodaci1.isSelected()) {
					String ukdo= String.format("%.2f", jaje + brasno + mleko + dzem + dodaci);
					lblUkupno1.setText(ukdo);
				}
				
			}
		});
		
		Potvrdi1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Potvrdi1.setBounds(38, 337, 156, 53);
		PalacinkeSaDzemom.add(Potvrdi1);
		
		JLabel Recept1 = new JLabel("Recept");
		Recept1.setIcon(new ImageIcon(slike1));
		Recept1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		Recept1.setBackground(Color.GRAY);
		Recept1.setBounds(538, 0, 164, 47);
		PalacinkeSaDzemom.add(Recept1);
		
		JLabel CarabonaraPasta = new JLabel("Pala\u010Dinke sa d\u017Eemom");
		CarabonaraPasta.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		CarabonaraPasta.setBackground(Color.GRAY);
		CarabonaraPasta.setBounds(23, 7, 290, 33);
		PalacinkeSaDzemom.add(CarabonaraPasta);
		
		JLabel lblgr = new JLabel("kom");
		lblgr.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblgr.setBounds(228, 60, 53, 33);
		PalacinkeSaDzemom.add(lblgr);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(472, 287, 13, 128);
		PalacinkeSaDzemom.add(separator_4);
		
		Dodaci1 = new JCheckBox("Dodaci");
		Dodaci1.setFont(new Font("Dialog", Font.PLAIN, 18));
		Dodaci1.setBounds(40, 258, 97, 23);
		PalacinkeSaDzemom.add(Dodaci1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(24, 241, 370, 7);
		PalacinkeSaDzemom.add(separator_2);
		
		JLabel lblUkupnaKalorijskaVrednost = new JLabel("Ukupna kalorijska vrednost");
		lblUkupnaKalorijskaVrednost.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUkupnaKalorijskaVrednost.setBackground(Color.GRAY);
		lblUkupnaKalorijskaVrednost.setBounds(204, 299, 266, 60);
		PalacinkeSaDzemom.add(lblUkupnaKalorijskaVrednost);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(17, 50, 13, 235);
		PalacinkeSaDzemom.add(separator_7);
		
		JLabel label_7 = new JLabel("dinara");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_7.setBounds(619, 352, 74, 49);
		PalacinkeSaDzemom.add(label_7);
		
		JLabel label_9 = new JLabel("Ukupna cena namirnica");
		label_9.setFont(new Font("Dialog", Font.BOLD, 18));
		label_9.setBounds(510, 313, 218, 33);
		PalacinkeSaDzemom.add(label_9);
		
		JPanel PalacinkeSaKremom = new JPanel();
		tabbedPane.addTab("Pala\u010Dinke sa kremom", null, PalacinkeSaKremom, null);
		PalacinkeSaKremom.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 805, 415);
		PalacinkeSaKremom.add(panel_1);
		
		JLabel lblUkupno2 = new JLabel("   ");
		lblUkupno2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUkupno2.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblUkupno2.setBounds(526, 356, 178, 46);
		panel_1.add(lblUkupno2);
		
		JPanel VocnaSalata= new JPanel();
		tabbedPane.addTab("Vo\u0107na salata", null, VocnaSalata, null);
		VocnaSalata.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 805, 415);
		VocnaSalata.add(panel_2);
		
		JLabel lblVocnaSalata = new JLabel("Vo\u0107na salata");
		lblVocnaSalata.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblVocnaSalata.setBackground(Color.GRAY);
		lblVocnaSalata.setBounds(24, 12, 227, 33);
		panel_2.add(lblVocnaSalata);
		
		JLabel lblBanane = new JLabel("Banane");
		lblBanane.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblBanane.setBounds(42, 73, 105, 25);
		panel_2.add(lblBanane);
		
		JLabel lblKivi = new JLabel("Kivi");
		lblKivi.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblKivi.setBounds(42, 111, 79, 33);
		panel_2.add(lblKivi);
		
		JLabel lblAnanas = new JLabel("Ananas");
		lblAnanas.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblAnanas.setBounds(42, 157, 118, 25);
		panel_2.add(lblAnanas);
		
		JLabel lblPomorandze = new JLabel("Pomorand\u017Ee");
		lblPomorandze.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblPomorandze.setBounds(42, 205, 137, 25);
		panel_2.add(lblPomorandze);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(24, 45, 370, 2);
		panel_2.add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(23, 243, 370, 7);
		panel_2.add(separator_13);
		
		JTextArea txtRecept3 = new JTextArea();
		txtRecept3.setText("U posudu sitno iseckati 1 bananu, 2 kivija,\r\n150 gr ananasa, 1 vecu ili 2 manje pomorandze, \r\nPo zelji dodavati slag.");
		txtRecept3.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 16));
		txtRecept3.setBounds(423, 45, 370, 240);
		panel_2.add(txtRecept3);
		
		txt_Kivi = new JTextField();
		txt_Kivi.setColumns(10);
		txt_Kivi.setText("0");
		txt_Kivi.setBounds(156, 119, 59, 22);
		panel_2.add(txt_Kivi);
		
		txt_Ananas = new JTextField();
		txt_Ananas.setColumns(10);
		txt_Ananas.setText("0");
		txt_Ananas.setBounds(156, 161, 59, 22);
		panel_2.add(txt_Ananas);
		
		txt_Pomorandze = new JTextField();
		txt_Pomorandze.setColumns(10);
		txt_Pomorandze.setText("0");
		txt_Pomorandze.setBounds(156, 209, 59, 22);
		panel_2.add(txt_Pomorandze);
		
		JLabel lblGr_2 = new JLabel("gr");
		lblGr_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblGr_2.setBounds(225, 69, 53, 33);
		panel_2.add(lblGr_2);
		
		JLabel label_30 = new JLabel("gr");
		label_30.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_30.setBounds(225, 115, 53, 25);
		panel_2.add(label_30);
		
		JLabel lblMl = new JLabel("gr");
		lblMl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMl.setBounds(225, 153, 53, 33);
		panel_2.add(lblMl);
		
		JLabel label_32 = new JLabel("gr");
		label_32.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_32.setBounds(225, 201, 53, 33);
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
		
		JCheckBox Slag = new JCheckBox("\u0160lag");
		Slag.setFont(new Font("Dialog", Font.PLAIN, 18));
		Slag.setBounds(40, 255, 97, 23);
		panel_2.add(Slag);
		
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
				double banane1=Double.parseDouble(txt_Banane.getText());
				double banane2=0.15;
				double banane=(banane1 * banane2);
				String ukBanane = String.format("%.2f", banane);
				lblUkupno3.setText(ukBanane);
				
				double bananekal=0.79;
				double bananekcl=(banane1*bananekal);
				String ukBananeKal = String.format("%.2f", bananekcl);
				lblKcal3.setText(ukBananeKal);
				
				double kivi1=Double.parseDouble(txt_Kivi.getText());
				double kivi2=0.17;
				double kivi=(kivi1 * kivi2);
				String ukKivi = String.format("%.2f", banane + kivi);
				lblUkupno3.setText(ukKivi);
				
				double kivikal=0.4;
				double kivikcl=(kivi1*kivikal);
				String ukKiviKal = String.format("%.2f", bananekcl + kivikcl);
				lblKcal3.setText(ukKiviKal);
				
				double ananas1=Double.parseDouble(txt_Ananas.getText());
				double ananas2=0.14;
				double ananas=(ananas1 * ananas2);
				String ukAnanas = String.format("%.2f", banane + kivi + ananas);
				lblUkupno3.setText(ukAnanas);
				
				double ananaskal=0.5;
				double ananaskcl=(ananas1*ananaskal);
				String ukAnanasKal = String.format("%.2f", bananekcl + kivikcl + ananaskcl);
				lblKcal3.setText(ukAnanasKal);
				
				double pom1=Double.parseDouble(txt_Pomorandze.getText());
				double pom2=0.12;
				double pom=(pom1 * pom2);
				String ukPom = String.format("%.2f", banane + kivi + ananas + pom);
				lblUkupno3.setText(ukPom);
				
				double pomkal=0.48;
				double pomkcl=(pom1*pomkal);
				String ukPomKal = String.format("%.2f", bananekcl + kivikcl + ananaskcl + pomkcl);
				lblKcal3.setText(ukPomKal);
				
				double slag= 30;
				if(Slag.isSelected()) {
					String ukslag= String.format("%.2f", banane + kivi + ananas + pom + slag);
					lblUkupno3.setText(ukslag);
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
		
		txt_Banane = new JTextField();
		txt_Banane.setText("0");
		txt_Banane.setColumns(10);
		txt_Banane.setBounds(156, 77, 59, 22);
		panel_2.add(txt_Banane);
		
		JPanel Ukupno = new JPanel();
		tabbedPane.addTab("Ukupno", null, Ukupno, null);
		Ukupno.setLayout(null);
		
		JLabel lblPalacinkeSaKremom = new JLabel("Pala\u010Dinke sa kremom");
		lblPalacinkeSaKremom.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblPalacinkeSaKremom.setBackground(Color.GRAY);
		lblPalacinkeSaKremom.setBounds(26, 11, 313, 33);
		panel_1.add(lblPalacinkeSaKremom);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(24, 45, 370, 2);
		panel_1.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(24, 241, 370, 7);
		panel_1.add(separator_9);
		
		JTextArea txtRecept2 = new JTextArea();
		txtRecept2.setText("Sipajte 300gr brasna u posudu, pa dodajte 3 jaja i dobro\r\nizmesajte. Dodajte 500ml mleka ili vode. Zatim dodajte \r\nprstohvat soli i dve kasike secera, pa dobro jedinite,\r\ntako da smesa bude jednolicna i bez grudvica. \r\nTesto ne treba da bude previse gusto,\r\nako je potrebno dodajte malo kisele vode.\r\nTesto prziti na prethodno zagrejanom tiganju. \r\nPo zavrsetku premazivati kremom (kolicina po zelji).\r\nKao dodatak dezertu predla\u017Eemo slag.");
		txtRecept2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
		txtRecept2.setBounds(423, 45, 370, 241);
		panel_1.add(txtRecept2);
		
		JLabel label_20 = new JLabel("Ukupna cena namirnica");
		label_20.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		label_20.setBounds(510, 313, 218, 33);
		panel_1.add(label_20);
		
		JLabel lblDl = new JLabel("gr");
		lblDl.setForeground(new Color(0, 0, 0));
		lblDl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblDl.setBounds(212, 107, 53, 33);
		panel_1.add(lblDl);
		
		JLabel lblMl_2 = new JLabel("ml");
		lblMl_2.setForeground(new Color(0, 0, 0));
		lblMl_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMl_2.setBounds(212, 151, 53, 33);
		panel_1.add(lblMl_2);
		
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
		
		JCheckBox Dodaci2 = new JCheckBox("Dodaci");
		Dodaci2.setFont(new Font("Dialog", Font.PLAIN, 18));
		Dodaci2.setBounds(40, 257, 97, 23);
		panel_1.add(Dodaci2);
		
		JButton Potvrdi2 = new JButton("Potvrdi");
		Image slike11=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		Potvrdi2.setIcon(new ImageIcon(slike11));
		Potvrdi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double jaje1=Double.parseDouble(txt_Jajaa.getText());
				double jaje2=11.5;
				double jaje=(jaje1 * jaje2);
				String ukJaje = String.format("%.2f", jaje);
				lblUkupno2.setText(ukJaje);
				
				double jajekal=147;
				double jajekcl=(jaje1*jajekal);
				String ukJajeKal = String.format("%.2f", jajekcl);
				lblKcal2.setText(ukJajeKal);
				
				
				double brasno1=Double.parseDouble(txt_Brasnoo.getText());
				double brasno2=0.05;
				double brasno=(brasno1 * brasno2);
				String ukBrasno = String.format("%.2f", jaje + brasno);
				lblUkupno1.setText(ukBrasno);
				
				double brasnokal=3.5;
				double brasnokcl=(brasno1*brasnokal);
				String ukBrasnoKal = String.format("%.2f", jajekcl + brasnokcl);
				lblKcal2.setText(ukBrasnoKal);
			
				
				double mleko1=Double.parseDouble(txt_Mlekoo.getText());
				double mleko2=0.07;
				double mleko=(mleko1 * mleko2);
				String ukMleko = String.format("%.2f", jaje + brasno + mleko);
				lblUkupno2.setText(ukMleko);
				
				double mlekokal=0.55;
				double mlekokcl=(mleko1*mlekokal);
				String ukMlekoKal = String.format("%.2f", jajekcl + brasnokcl + mlekokcl);
				lblKcal2.setText(ukMlekoKal);
				
				
				double krem1=Double.parseDouble(txt_Krem.getText());
				double krem2=0.52;
				double krem=(krem1 * krem2);
				String ukKrem= String.format("%.2f", jaje + brasno + mleko + krem);
				lblUkupno2.setText(ukKrem);
				
				double kremkal=5.38;
				double kremkcl=(krem1*kremkal);
				String ukKremKal = String.format("%.2f", jajekcl + brasnokcl + mlekokcl + kremkcl);
				lblKcal2.setText(ukKremKal);
		
				
				double dodaci= 30;
				if(Dodaci2.isSelected()) {
					String ukdo= String.format("%.2f", jaje + brasno + mleko + krem + dodaci);
					lblUkupno2.setText(ukdo);
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
		
		JLabel lblJaja_1 = new JLabel("Jaja");
		lblJaja_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		lblJaja_1.setBounds(40, 60, 97, 33);
		panel_1.add(lblJaja_1);
		
		JLabel lblBrasno_1 = new JLabel("Bra\u0161no");
		lblBrasno_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		lblBrasno_1.setBounds(40, 109, 97, 33);
		panel_1.add(lblBrasno_1);
		
		JLabel lblMleko_1 = new JLabel("Mleko");
		lblMleko_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		lblMleko_1.setBounds(40, 153, 97, 33);
		panel_1.add(lblMleko_1);
		
		JLabel lblKrem = new JLabel("Krem");
		lblKrem.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		lblKrem.setBounds(42, 199, 79, 33);
		panel_1.add(lblKrem);
		
		txt_Krem = new JTextField();
		txt_Krem.setText("0");
		txt_Krem.setColumns(10);
		txt_Krem.setBounds(141, 205, 59, 22);
		panel_1.add(txt_Krem);
		
		txt_Mlekoo = new JTextField();
		txt_Mlekoo.setText("0");
		txt_Mlekoo.setColumns(10);
		txt_Mlekoo.setBounds(141, 159, 59, 22);
		panel_1.add(txt_Mlekoo);
		
		txt_Brasnoo = new JTextField();
		txt_Brasnoo.setText("0");
		txt_Brasnoo.setColumns(10);
		txt_Brasnoo.setBounds(141, 113, 59, 22);
		panel_1.add(txt_Brasnoo);
		
		txt_Jajaa = new JTextField();
		txt_Jajaa.setText("0");
		txt_Jajaa.setColumns(10);
		txt_Jajaa.setBounds(141, 68, 59, 22);
		panel_1.add(txt_Jajaa);
		
		JLabel label_12 = new JLabel("kom");
		label_12.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		label_12.setBounds(212, 60, 53, 33);
		panel_1.add(label_12);
		
		JLabel label_15 = new JLabel("gr");
		label_15.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		label_15.setBounds(212, 197, 53, 33);
		panel_1.add(label_15);
		
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
			textArea.append("\n Vrednost namirnica za palaèinke sa džemom je "+lblUkupno1.getText()+" dinara.");
			textArea.append("\n Vrednost namirnica za palaèinke sa kremom je "+lblUkupno2.getText()+" dinara.");
			textArea.append("\n Vrednost namirnica za voænu salatu je "+lblUkupno3.getText()+" dinara.");
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
