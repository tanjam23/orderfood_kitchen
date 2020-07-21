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

public class KuvanaJela extends JFrame {

	private JPanel contentPane;
	private JTextField txt_Meso;
	private JTextField txt_Luk;
	private JTextField txt_Sos;
	private JTextField txt_Brasn;
	private JTextField txt_MlMeso;
	private JTextField txt_KKupus;
	private JTextField txt_Pirinac;
	private JTextField txt_Luk1;
	private JTextField txt_Pasulj;
	private JTextField txt_Luk2;
	private JTextField txt_Sargarepa1;
	private JTextField txt_Rebra;
	private JTextField txt_Brasno1;
	private JCheckBox Zacini1;
	private JTextField txt_Mast;
	private JTextField txt_Sargarepa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KuvanaJela frame = new KuvanaJela();
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
	public KuvanaJela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 810, 445);
		contentPane.add(tabbedPane);
		
		JPanel Gulaš = new JPanel();
		tabbedPane.addTab("Gula\u0161", null, Gulaš, null);
		Gulaš.setLayout(null);
		
		JLabel lblMeso = new JLabel("Meso");
		lblMeso.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMeso.setBounds(40, 60, 53, 33);
		Gulaš.add(lblMeso);
		
		JLabel lblLuk = new JLabel("Luk");
		lblLuk.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblLuk.setBounds(40, 91, 79, 33);
		Gulaš.add(lblLuk);
		
		JLabel lblSos = new JLabel("Paradajz sos");
		lblSos.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblSos.setBounds(40, 126, 139, 33);
		Gulaš.add(lblSos);
		
		JLabel lblBrašno = new JLabel("Bra\u0161no");
		lblBrašno.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblBrašno.setBounds(40, 162, 79, 33);
		Gulaš.add(lblBrašno);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 45, 370, 2);
		Gulaš.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 288, 370, 7);
		Gulaš.add(separator_1);
		
		JTextArea txtRecept1 = new JTextArea();
		txtRecept1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
		txtRecept1.setText("Zagrejte pola kasike svinjske masti, dodajte na kockice \r\niseckano meso od buta i na sitne kockice iseckan crni luk. \r\nU poklopljenoj serpi na tihoj vatri dinstajte 80 minuta. \r\nPo potrebi povremeno dolivajte pomalo vode i mesajte. \r\nKad meso omeksa, pospite brasnom i proprzite. \r\nNalijte vodu i dodajte sok od paradajza. Krckajte na sasvim\r\n tihoj vatri jos pola sata, uz povremeno mesanje. \r\nPosolite i pobiberite.");
		txtRecept1.setBounds(423, 45, 370, 240);
		Gulaš.add(txtRecept1);
		
		txt_Meso = new JTextField();
		txt_Meso.setBounds(157, 68, 59, 22);
		txt_Meso.setText("0");
		Gulaš.add(txt_Meso);
		txt_Meso.setColumns(10);
		
		txt_Luk = new JTextField();
		txt_Luk.setColumns(10);
		txt_Luk.setText("0");
		txt_Luk.setBounds(157, 99, 59, 22);
		Gulaš.add(txt_Luk);
		
		txt_Sos = new JTextField();
		txt_Sos.setColumns(10);
		txt_Sos.setText("0");
		txt_Sos.setBounds(157, 134, 59, 22);
		Gulaš.add(txt_Sos);
		
		txt_Brasn = new JTextField();
		txt_Brasn.setColumns(10);
		txt_Brasn.setText("0");
		txt_Brasn.setBounds(157, 170, 59, 22);
		Gulaš.add(txt_Brasn);
		
		JLabel lblGr = new JLabel("gr");
		lblGr.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblGr.setBounds(226, 91, 53, 33);
		Gulaš.add(lblGr);
		
		JLabel lblMl_1 = new JLabel("ml");
		lblMl_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblMl_1.setBounds(226, 126, 53, 33);
		Gulaš.add(lblMl_1);
		
		JLabel label_1 = new JLabel("gr");
		label_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_1.setBounds(228, 197, 53, 33);
		Gulaš.add(label_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(398, 49, 13, 236);
		Gulaš.add(separator_3);
		
		JLabel lblKcal = new JLabel("kcal");
		lblKcal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKcal.setBounds(366, 355, 74, 46);
		Gulaš.add(lblKcal);
		
		JLabel lblKcal1 = new JLabel("   ");
		lblKcal1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKcal1.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblKcal1.setBounds(244, 356, 178, 46);
		Gulaš.add(lblKcal1);
		
		JLabel lblUkupno1 = new JLabel("   ");
		lblUkupno1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUkupno1.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblUkupno1.setBounds(526, 356, 178, 46);
		Gulaš.add(lblUkupno1);
		
		JButton Potvrdi1 = new JButton("Potvrdi");
		Image slike=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		Potvrdi1.setIcon(new ImageIcon(slike));
		Potvrdi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double meso1=Double.parseDouble(txt_Meso.getText());
				double meso2=0.385;
				double meso=(meso1 * meso2);
				String ukMeso = String.format("%.2f", meso);
				lblUkupno1.setText(ukMeso);
				
				double mesokal=2.8;
				double mesokcl=(meso1*mesokal);
				String ukMesoKal = String.format("%.2f", mesokcl);
				lblKcal1.setText(ukMesoKal);
				
				
				double luk1=Double.parseDouble(txt_Luk.getText());
				double luk2=0.038;
				double luk=(luk1 * luk2);
				String ukLuk = String.format("%.2f", meso + luk);
				lblUkupno1.setText(ukLuk);
				
				double lukkal=0.4;
				double lukkcl=(luk1*lukkal);
				String ukLukKal = String.format("%.2f", mesokcl + lukkcl);
				lblKcal1.setText(ukLukKal);
				
				
				double sos1=Double.parseDouble(txt_Sos.getText());
				double sos2=0.12;
				double sos=(sos1 * sos2);
				String ukSos = String.format("%.2f", meso + luk + sos);
				lblUkupno1.setText(ukSos);
				
				double soskal=0.3;
				double soskcl=(sos1*soskal);
				String ukSosKal = String.format("%.2f", mesokcl + lukkcl + soskcl);
				lblKcal1.setText(ukSosKal);
				
				
				double bra1=Double.parseDouble(txt_Brasn.getText());
				double bra2=0.05;
				double bra=(bra1 * bra2);
				String ukBra = String.format("%.2f", meso + luk + sos + bra);
				lblUkupno1.setText(ukBra);
				
				double brakal=3.5;
				double brakcl=(bra1*brakal);
				String ukBraKal = String.format("%.2f", mesokcl + lukkcl + soskcl + brakcl);
				lblKcal1.setText(ukBraKal);
				
				double mast1=Double.parseDouble(txt_Mast.getText());
				double mast2=0.18;
				double mast=(mast1 * mast2);
				String ukMast = String.format("%.2f", meso + luk + sos + bra + mast);
				lblUkupno1.setText(ukMast);
				
				double mastkal= 9;
				double mastkcl=(mast1*mastkal);
				String ukMastKal = String.format("%.2f", mesokcl + lukkcl + soskcl + brakcl + mastkcl);
				lblKcal1.setText(ukMastKal);
				
				
				double zacin= 15;
				if(Zacini1.isSelected()) {
					String ukza= String.format("%.2f", meso + luk + sos + bra + mast + zacin);
					lblUkupno1.setText(ukza);
				}
				
			}
		});
		
		Potvrdi1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Potvrdi1.setBounds(38, 337, 156, 53);
		Gulaš.add(Potvrdi1);
		
		JLabel Recept1 = new JLabel("Recept");
		Image slike1=new ImageIcon(this.getClass().getResource("/recept.png")).getImage();
		Recept1.setIcon(new ImageIcon(slike1));
		Recept1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		Recept1.setBackground(Color.GRAY);
		Recept1.setBounds(538, 0, 164, 47);
		Gulaš.add(Recept1);
		
		JLabel lblGulas = new JLabel("Gula\u0161");
		lblGulas.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblGulas.setBackground(Color.GRAY);
		lblGulas.setBounds(40, 14, 290, 33);
		Gulaš.add(lblGulas);
		
		JLabel lblgr = new JLabel("gr");
		lblgr.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblgr.setBounds(226, 60, 53, 33);
		Gulaš.add(lblgr);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(472, 287, 13, 128);
		Gulaš.add(separator_4);
		
		Zacini1 = new JCheckBox("Za\u010Dini");
		Zacini1.setFont(new Font("Dialog", Font.PLAIN, 18));
		Zacini1.setBounds(40, 258, 97, 23);
		Gulaš.add(Zacini1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(24, 241, 370, 7);
		Gulaš.add(separator_2);
		
		JLabel lblUkupnaKalorijskaVrednost = new JLabel("Ukupna kalorijska vrednost");
		lblUkupnaKalorijskaVrednost.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUkupnaKalorijskaVrednost.setBackground(Color.GRAY);
		lblUkupnaKalorijskaVrednost.setBounds(204, 299, 266, 60);
		Gulaš.add(lblUkupnaKalorijskaVrednost);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(17, 50, 13, 235);
		Gulaš.add(separator_7);
		
		JLabel label_7 = new JLabel("dinara");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_7.setBounds(619, 352, 74, 49);
		Gulaš.add(label_7);
		
		JLabel label_9 = new JLabel("Ukupna cena namirnica");
		label_9.setFont(new Font("Dialog", Font.BOLD, 18));
		label_9.setBounds(510, 313, 218, 33);
		Gulaš.add(label_9);
		
		JLabel lblMast = new JLabel("Mast");
		lblMast.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		lblMast.setBounds(40, 197, 79, 33);
		Gulaš.add(lblMast);
		
		txt_Mast = new JTextField();
		txt_Mast.setText("0");
		txt_Mast.setColumns(10);
		txt_Mast.setBounds(157, 203, 59, 22);
		Gulaš.add(txt_Mast);
		
		JLabel label_8 = new JLabel("gr");
		label_8.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		label_8.setBounds(226, 162, 53, 33);
		Gulaš.add(label_8);
		
		JPanel PunjenaPaprika = new JPanel();
		tabbedPane.addTab("Punjena paprika", null, PunjenaPaprika, null);
		PunjenaPaprika.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 805, 415);
		PunjenaPaprika.add(panel_1);
		
		JLabel lblUkupno2 = new JLabel("   ");
		lblUkupno2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUkupno2.setBorder(new LineBorder(new  Color(0, 0, 0), 2));
		lblUkupno2.setBounds(526, 356, 178, 46);
		panel_1.add(lblUkupno2);
		
		JPanel Pasulj = new JPanel();
		tabbedPane.addTab("Pasulj", null, Pasulj, null);
		Pasulj.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 805, 415);
		Pasulj.add(panel_2);
		
		JLabel lblPasulj1 = new JLabel("Pasulj");
		lblPasulj1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblPasulj1.setBackground(Color.GRAY);
		lblPasulj1.setBounds(24, 12, 227, 33);
		panel_2.add(lblPasulj1);
		
		JLabel lblPasulj = new JLabel("Pasulj");
		lblPasulj.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblPasulj.setBounds(40, 50, 53, 25);
		panel_2.add(lblPasulj);
		
		JLabel lblLuk1 = new JLabel("Luk");
		lblLuk1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblLuk1.setBounds(40, 82, 79, 33);
		panel_2.add(lblLuk1);
		
		JLabel lblSargarepa1 = new JLabel("\u0160argarepa");
		lblSargarepa1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblSargarepa1.setBounds(40, 123, 132, 25);
		panel_2.add(lblSargarepa1);
		
		JLabel lblRebra = new JLabel("Suva rebra");
		lblRebra.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblRebra.setBounds(40, 159, 121, 25);
		panel_2.add(lblRebra);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(24, 45, 370, 2);
		panel_2.add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(23, 243, 370, 7);
		panel_2.add(separator_13);
		
		JTextArea txtRecept3 = new JTextArea();
		txtRecept3.setText("Potopiti 500gr pasulja da stoji u vodi par sati da\r\n nabubri. Procediti ga i naliti vodom, \r\npa staviti da se kuva. Kad se napola skuva, \r\nponovo ga ocediti od vode i ostaviti sa strane. \r\nDodati 300gr rebra i zajedno kuvati jo\u0161 40 min.\r\nU sud u kom kuvate pasulj sipati malo ulja\r\n i na njega staviti 100gr seckanog luka i 100gr\r\n \u0161argarepe, dinstati dok ne omek\u0161a.");
		txtRecept3.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 16));
		txtRecept3.setBounds(423, 45, 370, 240);
		panel_2.add(txtRecept3);
		
		txt_Pasulj = new JTextField();
		txt_Pasulj.setColumns(10);
		txt_Pasulj.setText("0");
		txt_Pasulj.setBounds(157, 54, 59, 22);
		panel_2.add(txt_Pasulj);
		
		txt_Luk2 = new JTextField();
		txt_Luk2.setColumns(10);
		txt_Luk2.setText("0");
		txt_Luk2.setBounds(157, 89, 59, 22);
		panel_2.add(txt_Luk2);
		
		txt_Sargarepa1 = new JTextField();
		txt_Sargarepa1.setColumns(10);
		txt_Sargarepa1.setText("0");
		txt_Sargarepa1.setBounds(157, 125, 59, 22);
		panel_2.add(txt_Sargarepa1);
		
		txt_Rebra = new JTextField();
		txt_Rebra.setColumns(10);
		txt_Rebra.setText("0");
		txt_Rebra.setBounds(157, 163, 59, 22);
		panel_2.add(txt_Rebra);
		
		txt_Brasno1 = new JTextField();
		txt_Brasno1.setColumns(10);
		txt_Brasno1.setText("0");
		txt_Brasno1.setBounds(157, 198, 59, 22);
		panel_2.add(txt_Brasno1);
		
		JLabel lblGr_2 = new JLabel("gr");
		lblGr_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblGr_2.setBounds(228, 46, 53, 33);
		panel_2.add(lblGr_2);
		
		JLabel label_30 = new JLabel("gr");
		label_30.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_30.setBounds(228, 86, 53, 25);
		panel_2.add(label_30);
		
		JLabel lblgr1 = new JLabel("gr");
		lblgr1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblgr1.setBounds(228, 117, 53, 33);
		panel_2.add(lblgr1);
		
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
				double pasulj1=Double.parseDouble(txt_Pasulj.getText());
				double pasulj2=0.3;
				double pasulj=(pasulj1 * pasulj2);
				String ukPasulj = String.format("%.2f", pasulj);
				lblUkupno3.setText(ukPasulj);
				
				double pasuljkal=1.43;
				double pasuljkcl=(pasulj1*pasuljkal);
				String ukPasuljKal = String.format("%.2f", pasuljkcl);
				lblKcal3.setText(ukPasuljKal);
				
				double luk1=Double.parseDouble(txt_Luk2.getText());
				double luk2=0.038;
				double luk=(luk1 * luk2);
				String ukLuk= String.format("%.2f", pasulj + luk);
				lblUkupno3.setText(ukLuk);
				
				double lukkal=0.12;
				double lukkcl=(luk1*lukkal);
				String ukLukKal = String.format("%.2f", pasuljkcl + lukkcl);
				lblKcal3.setText(ukLukKal);
				
				double sar1=Double.parseDouble(txt_Sargarepa1.getText());
				double sar2=0.035;
				double sar=(sar1 * sar2);
				String ukSar= String.format("%.2f", pasulj + luk + sar);
				lblUkupno3.setText(ukSar);
				
				double sarkal=0.413;
				double sarkcl=(sar1*sarkal);
				String ukSarKal = String.format("%.2f", pasuljkcl + lukkcl + sarkcl);
				lblKcal3.setText(ukSarKal);
		
				double rebra1=Double.parseDouble(txt_Rebra.getText());
				double rebra2=0.345;
				double rebra=(rebra1 * rebra2);
				String ukRebra= String.format("%.2f", pasulj + luk + sar + rebra);
				lblUkupno3.setText(ukRebra);
				
				double rebrakal=4.23;
				double rebrakcl=(rebra1*rebrakal);
				String ukRebraKal = String.format("%.2f", pasuljkcl + lukkcl + sarkcl + rebrakcl);
				lblKcal3.setText(ukRebraKal);
				
				double bra1=Double.parseDouble(txt_Brasno1.getText());
				double bra2=0.05;
				double bra=(bra1 * bra2);
				String ukBra = String.format("%.2f", pasulj + luk + sar + rebra + bra);
				lblUkupno3.setText(ukBra);
				
				double brakal=3.5;
				double brakcl=(bra1*brakal);
				String ukBraKal = String.format("%.2f", pasuljkcl + lukkcl + sarkcl + rebrakcl + brakcl);
				lblKcal3.setText(ukBraKal);
				
				double zacin2= 15;
				if(Zacini3.isSelected()) {
					String ukza2= String.format("%.2f", pasulj + luk + sar + rebra + bra + zacin2);
					lblUkupno3.setText(ukza2);
				}
			}
		});
		Potvrdi3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Potvrdi3.setBounds(38, 337, 156, 53);
		panel_2.add(Potvrdi3);
		
		JLabel lblBrasno1 = new JLabel("Bra\u0161no");
		lblBrasno1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblBrasno1.setBounds(40, 197, 79, 25);
		panel_2.add(lblBrasno1);
		
		
		JLabel label_22 = new JLabel("gr");
		label_22.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_22.setBounds(226, 190, 53, 33);
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
		
		JLabel lblPunjenaPaprika = new JLabel("Punjena paprika");
		lblPunjenaPaprika.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 26));
		lblPunjenaPaprika.setBackground(Color.GRAY);
		lblPunjenaPaprika.setBounds(26, 11, 254, 33);
		panel_1.add(lblPunjenaPaprika);
		
		JLabel MlMeso = new JLabel("Mleveno meso");
		MlMeso.setForeground(new Color(0, 0, 0));
		MlMeso.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		MlMeso.setBounds(40, 60, 129, 33);
		panel_1.add(MlMeso);
		
		JLabel lblPaprika = new JLabel("Paprika");
		lblPaprika.setForeground(new Color(0, 0, 0));
		lblPaprika.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblPaprika.setBounds(40, 91, 107, 33);
		panel_1.add(lblPaprika);
		
		JLabel lblPirinac = new JLabel("Pirina\u010D");
		lblPirinac.setForeground(new Color(0, 0, 0));
		lblPirinac.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblPirinac.setBounds(40, 124, 59, 33);
		panel_1.add(lblPirinac);
		
		JLabel lblLuk2 = new JLabel("Luk");
		lblLuk2.setForeground(new Color(0, 0, 0));
		lblLuk2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblLuk2.setBounds(40, 151, 79, 33);
		panel_1.add(lblLuk2);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(24, 45, 370, 2);
		panel_1.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(24, 241, 370, 7);
		panel_1.add(separator_9);
		
		JTextArea txtRecept2 = new JTextArea();
		txtRecept2.setText("Ocistiti 1kg paprika od semenki. \r\nU jedan tiganj stavite 500gr mlevenog \r\nmesa i redom mu dodajte 100gr luka i \r\n100gr sargarepe. Dobro izmesajte,\r\nprobajte da vidite da li je dobrog ukusa,\r\n zatim smesom puniti paprike.\r\n U duboku serpu stavite ulje, poredjajte paprike,\r\n dodajte vodu i stavite da se kuva.");
		txtRecept2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		txtRecept2.setBounds(423, 45, 370, 241);
		panel_1.add(txtRecept2);
		
		JLabel label_20 = new JLabel("Ukupna cena namirnica");
		label_20.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		label_20.setBounds(510, 313, 218, 33);
		panel_1.add(label_20);
		
		txt_MlMeso = new JTextField();
		txt_MlMeso.setColumns(10);
		txt_MlMeso.setText("0");
		txt_MlMeso.setBounds(157, 68, 59, 22);
		panel_1.add(txt_MlMeso);
		
		txt_KKupus = new JTextField();
		txt_KKupus.setColumns(10);
		txt_KKupus.setText("0");
		txt_KKupus.setBounds(157, 99, 59, 22);
		panel_1.add(txt_KKupus);
		
		txt_Pirinac = new JTextField();
		txt_Pirinac.setColumns(10);
		txt_Pirinac.setText("0");
		txt_Pirinac.setBounds(157, 132, 59, 22);
		panel_1.add(txt_Pirinac);
		
		txt_Luk1 = new JTextField();
		txt_Luk1.setColumns(10);
		txt_Luk1.setText("0");
		txt_Luk1.setBounds(157, 159, 59, 22);
		panel_1.add(txt_Luk1);
		
		JLabel lblGr_1 = new JLabel("gr");
		lblGr_1.setForeground(new Color(0, 0, 0));
		lblGr_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblGr_1.setBounds(228, 60, 53, 33);
		panel_1.add(lblGr_1);
		
		JLabel lblgr3 = new JLabel("gr");
		lblgr3.setForeground(new Color(0, 0, 0));
		lblgr3.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		lblgr3.setBounds(226, 91, 53, 33);
		panel_1.add(lblgr3);
		
		JLabel label_23 = new JLabel("gr");
		label_23.setForeground(new Color(0, 0, 0));
		label_23.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_23.setBounds(226, 124, 53, 33);
		panel_1.add(label_23);
		
		JLabel label_24 = new JLabel("gr");
		label_24.setForeground(new Color(0, 0, 0));
		label_24.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		label_24.setBounds(226, 151, 53, 33);
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
				double mlmeso1=Double.parseDouble(txt_MlMeso.getText());
				double mlmeso2=0.418;
				double mlmeso=(mlmeso1 * mlmeso2);
				String ukMlmeso = String.format("%.2f", mlmeso);
				lblUkupno2.setText(ukMlmeso);
				
				double mlmesokal=3.16;
				double mlmesokcl=(mlmeso1*mlmesokal);
				String ukMlmesoKal = String.format("%.2f", mlmesokcl);
				lblKcal2.setText(ukMlmesoKal);
				
				
				double kiskupus1=Double.parseDouble(txt_KKupus.getText());
				double kiskupus2=0.15;
				double kiskupus=(kiskupus1 * kiskupus2);
				String ukKiskupus = String.format("%.2f", mlmeso + kiskupus);
				lblUkupno2.setText(ukKiskupus);
				
				double kiskupuskal=0.186;
				double kiskupuskcl=(kiskupus1*kiskupuskal);
				String ukKiskupusKal = String.format("%.2f", mlmesokcl + kiskupuskcl);
				lblKcal2.setText(ukKiskupusKal);	
				
				double pirinac1=Double.parseDouble(txt_Pirinac.getText());
				double pirinac2=0.142;
				double pirinac=(pirinac1 * pirinac2);
				String ukPirinac = String.format("%.2f", mlmeso + kiskupus + pirinac);
				lblUkupno2.setText(ukPirinac);
				
				double pirinackal=1.3;
				double pirinackcl=(pirinac1*pirinackal);
				String ukPirinacKal = String.format("%.2f", mlmesokcl + kiskupuskcl + pirinackcl);
				lblKcal2.setText(ukPirinacKal);
				
				
				double luk1=Double.parseDouble(txt_Luk1.getText());
				double luk2=0.038;
				double luk=(luk1 * luk2);
				String ukLuk= String.format("%.2f", mlmeso + kiskupus + pirinac + luk);
				lblUkupno2.setText(ukLuk);
				
				double lukkal=0.12;
				double lukkcl=(luk1*lukkal);
				String ukLukKal = String.format("%.2f", mlmesokcl + kiskupuskcl + pirinackcl + lukkcl);
				lblKcal2.setText(ukLukKal);
				
				double sar1=Double.parseDouble(txt_Sargarepa.getText());
				double sar2=0.035;
				double sar=(sar1 * sar2);
				String ukSar= String.format("%.2f", mlmeso + kiskupus + pirinac + luk + sar);
				lblUkupno2.setText(ukSar);
				
				double sarkal=0.413;
				double sarkcl=(sar1*sarkal);
				String ukSarKal = String.format("%.2f", mlmesokcl + kiskupuskcl + pirinackcl + lukkcl + sarkcl);
				lblKcal2.setText(ukSarKal);
		
				
				double zacin1= 15;
				if(Zacini2.isSelected()) {
					String ukza1= String.format("%.2f", mlmeso + kiskupus + pirinac + luk + sar + zacin1);
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
		
		JLabel lblSargarepa2 = new JLabel("\u0160argarepa");
		lblSargarepa2.setForeground(Color.BLACK);
		lblSargarepa2.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		lblSargarepa2.setBounds(40, 185, 97, 33);
		panel_1.add(lblSargarepa2);
		
		txt_Sargarepa = new JTextField();
		txt_Sargarepa.setText("0");
		txt_Sargarepa.setColumns(10);
		txt_Sargarepa.setBounds(157, 192, 59, 22);
		panel_1.add(txt_Sargarepa);
		
		JLabel label = new JLabel("gr");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		label.setBounds(226, 185, 53, 33);
		panel_1.add(label);
		
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
			textArea.append("\n Vrednost namirnica za gulaš je "+lblUkupno1.getText()+" dinara.");
			textArea.append("\n Vrednost namirnica punjenu papriku je "+lblUkupno2.getText()+" dinara.");
			textArea.append("\n Vrednost namirnica za pasulj je "+lblUkupno3.getText()+" dinara.");
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
