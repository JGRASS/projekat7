package gui.pitanja;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;

import java.awt.GridLayout;

import javax.swing.JButton;

import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.FlowLayout;

import javax.swing.LayoutStyle.ComponentPlacement;

import pitanja.PitanjaABCDSaSlikom;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class DodajNovoPitanje extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnNovaSlika;
	private JButton btnNovaSlika_1;
	private JButton btnNovaSlika_2;
	private JButton btnNovaSlika_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblSlika;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JPanel panel_10;
	private JLabel lblPitanjeGlasi;
	private JTextPane textPane;
	private JButton btnDodaj;
	private JPanel panel_11;
	private JRadioButton rdbtnLako;
	private JRadioButton rdbtnSrednje;
	private JRadioButton rdbtnTesko;
	private JLabel lblTezinaPitanja;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel panel_12;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblOcgovorC;
	private JLabel lblOdgovorD;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPanel panel_13;
	private JLabel label;
	private JTextPane textPane_1;
	private JButton button;
	private JPanel panel_14;
	private JLabel label_1;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JPanel panel_15;
	private JPanel panel_16;
	private JLabel label_2;
	private JTextPane textPane_2;
	private JButton button_1;
	private JPanel panel_17;
	private JLabel label_3;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JPanel panel_18;
	private JPanel panel_19;
	private JLabel label_4;
	private JTextPane textPane_3;
	private JButton button_2;
	private JPanel panel_20;
	private JLabel label_5;
	private JRadioButton radioButton_6;
	private JRadioButton radioButton_7;
	private JRadioButton radioButton_8;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JScrollPane scrollPane_4;
	private JLabel lblSlika_1;
	private JButton btnDodajSliku;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajNovoPitanje frame = new DodajNovoPitanje();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//my methods
	
	public String dodajNovo(){
		 JFileChooser chooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif");
		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(this.getContentPane());
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		            chooser.getSelectedFile().getName());
		    }
		    return chooser.getSelectedFile().getAbsolutePath().toString();
	}
	
	
	

	/**
	 * Create the frame.
	 */
	public DodajNovoPitanje() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DodajNovoPitanje.class.getResource("/javax/swing/plaf/metal/icons/Question.gif")));
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setTitle("Dodaj novo pitanje");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getTabbedPane(), BorderLayout.CENTER);
	}

	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.addTab("Novo ABCD pitanje sa slikom", null, getPanel(), null);
			tabbedPane.addTab("Novo ABCD txt pitanje", null, getPanel_1(), null);
			tabbedPane.addTab("Novo pitanje na dopunu", null, getPanel_2(), null);
			tabbedPane.addTab("Novo pitanje sa slikom na dopunu", null, getPanel_3(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getPanel_4(), BorderLayout.NORTH);
			panel.add(getPanel_5(), BorderLayout.CENTER);
			panel.add(getPanel_10(), BorderLayout.SOUTH);
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getPanel_12(), BorderLayout.CENTER);
			panel_1.add(getPanel_13_1(), BorderLayout.SOUTH);
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new BorderLayout(0, 0));
			panel_2.add(getPanel_15(), BorderLayout.CENTER);
			panel_2.add(getPanel_16(), BorderLayout.SOUTH);
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new BorderLayout(0, 0));
			panel_3.add(getPanel_18(), BorderLayout.CENTER);
			panel_3.add(getPanel_19(), BorderLayout.SOUTH);
		}
		return panel_3;
	}
	private JButton getBtnNovaSlika() {
		if (btnNovaSlika == null) {
			btnNovaSlika = new JButton("Nova slika 1");
			btnNovaSlika.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//!!! To-Do Pitati Bojana
					ImageIcon img = new ImageIcon(dodajNovo());
				//	Image imga = img.getImage();
					//imga.getHeight(observer)
					//imageUpdate(imga, 0, 50, 50, 50, 50);
					//img.setImage(imga);
					lblSlika.setIcon(img);
					lblSlika.setText(null);
				}
			});
		}
		return btnNovaSlika;
	}
	private JButton getBtnNovaSlika_1() {
		if (btnNovaSlika_1 == null) {
			btnNovaSlika_1 = new JButton("Nova slika 2");
			btnNovaSlika_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ImageIcon img = new ImageIcon(dodajNovo());
					lblNewLabel.setIcon(img);
					lblNewLabel.setText(null);
				}
			});
		}
		return btnNovaSlika_1;
	}
	private JButton getBtnNovaSlika_2() {
		if (btnNovaSlika_2 == null) {
			btnNovaSlika_2 = new JButton("Nova slika 3");
			btnNovaSlika_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ImageIcon img = new ImageIcon(dodajNovo());
					lblNewLabel_1.setIcon(img);
					lblNewLabel_1.setText(null);
				}
			});
		}
		return btnNovaSlika_2;
	}
	private JButton getBtnNovaSlika_3() {
		if (btnNovaSlika_3 == null) {
			btnNovaSlika_3 = new JButton("Nova slika 4");
			btnNovaSlika_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ImageIcon img = new ImageIcon(dodajNovo());
					lblNewLabel_2.setIcon(img);
					lblNewLabel_2.setText(null);
				}
			});
		}
		return btnNovaSlika_3;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.add(getBtnNovaSlika());
			panel_4.add(getBtnNovaSlika_1());
			panel_4.add(getBtnNovaSlika_2());
			panel_4.add(getBtnNovaSlika_3());
		}
		return panel_4;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
			panel_5.add(getPanel_6());
			panel_5.add(getPanel_7());
			panel_5.add(getPanel_8());
			panel_5.add(getPanel_9());
		}
		return panel_5;
	}
	private JLabel getLblSlika() {
		if (lblSlika == null) {
			lblSlika = new JLabel("Slika");
			lblSlika.setSize(new Dimension(55, 55));
			
		}
		return lblSlika;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Slika");
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Slika");
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Slika");
		}
		return lblNewLabel_2;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.setLayout(new BorderLayout(0, 0));
			panel_6.add(getScrollPane(), BorderLayout.CENTER);
		}
		return panel_6;
	}
	private JPanel getPanel_7() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
			panel_7.setLayout(new BorderLayout(0, 0));
			panel_7.add(getScrollPane_1(), BorderLayout.CENTER);
		}
		return panel_7;
	}
	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
			panel_8.setLayout(new BorderLayout(0, 0));
			panel_8.add(getScrollPane_2(), BorderLayout.CENTER);
		}
		return panel_8;
	}
	private JPanel getPanel_9() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
			panel_9.setLayout(new BorderLayout(0, 0));
			panel_9.add(getScrollPane_3(), BorderLayout.CENTER);
		}
		return panel_9;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getLblSlika());
		}
		return scrollPane;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getLblNewLabel());
		}
		return scrollPane_1;
	}
	private JScrollPane getScrollPane_2() {
		if (scrollPane_2 == null) {
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setViewportView(getLblNewLabel_1());
		}
		return scrollPane_2;
	}
	private JScrollPane getScrollPane_3() {
		if (scrollPane_3 == null) {
			scrollPane_3 = new JScrollPane();
			scrollPane_3.setViewportView(getLblNewLabel_2());
		}
		return scrollPane_3;
	}
	private JPanel getPanel_10() {
		if (panel_10 == null) {
			panel_10 = new JPanel();
			panel_10.setLayout(new BorderLayout(0, 0));
			panel_10.add(getLblPitanjeGlasi(), BorderLayout.WEST);
			panel_10.add(getTextPane(), BorderLayout.CENTER);
			panel_10.add(getBtnDodaj(), BorderLayout.EAST);
			panel_10.add(getPanel_11(), BorderLayout.SOUTH);
		}
		return panel_10;
	}
	private JLabel getLblPitanjeGlasi() {
		if (lblPitanjeGlasi == null) {
			lblPitanjeGlasi = new JLabel("Pitanje glasi:");
		}
		return lblPitanjeGlasi;
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
		}
		return textPane;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
		}
		return btnDodaj;
	}
	private JPanel getPanel_11() {
		if (panel_11 == null) {
			panel_11 = new JPanel();
			panel_11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_11.add(getLblTezinaPitanja());
			panel_11.add(getRdbtnLako());
			panel_11.add(getRdbtnSrednje());
			panel_11.add(getRdbtnTesko());
		}
		return panel_11;
	}
	private JRadioButton getRdbtnLako() {
		if (rdbtnLako == null) {
			rdbtnLako = new JRadioButton("Lako");
			buttonGroup.add(rdbtnLako);
		}
		return rdbtnLako;
	}
	private JRadioButton getRdbtnSrednje() {
		if (rdbtnSrednje == null) {
			rdbtnSrednje = new JRadioButton("Srednje");
			buttonGroup.add(rdbtnSrednje);
		}
		return rdbtnSrednje;
	}
	private JRadioButton getRdbtnTesko() {
		if (rdbtnTesko == null) {
			rdbtnTesko = new JRadioButton("Tesko");
			buttonGroup.add(rdbtnTesko);
		}
		return rdbtnTesko;
	}
	private JLabel getLblTezinaPitanja() {
		if (lblTezinaPitanja == null) {
			lblTezinaPitanja = new JLabel("Tezina pitanja: ");
		}
		return lblTezinaPitanja;
	}
	private JPanel getPanel_12() {
		if (panel_12 == null) {
			panel_12 = new JPanel();
			GroupLayout gl_panel_12 = new GroupLayout(panel_12);
			gl_panel_12.setHorizontalGroup(
				gl_panel_12.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_12.createSequentialGroup()
						.addGap(46)
						.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel_12.createSequentialGroup()
								.addComponent(getLblOdgovorD())
								.addGap(18)
								.addComponent(getTextField_3()))
							.addGroup(gl_panel_12.createSequentialGroup()
								.addComponent(getLblOcgovorC())
								.addGap(18)
								.addComponent(getTextField_2()))
							.addGroup(gl_panel_12.createSequentialGroup()
								.addComponent(getLblNewLabel_4())
								.addGap(18)
								.addComponent(getTextField_1()))
							.addGroup(gl_panel_12.createSequentialGroup()
								.addComponent(getLblNewLabel_3())
								.addGap(18)
								.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, 635, GroupLayout.PREFERRED_SIZE)))
						.addGap(136))
			);
			gl_panel_12.setVerticalGroup(
				gl_panel_12.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_12.createSequentialGroup()
						.addGap(90)
						.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
							.addComponent(getLblNewLabel_3())
							.addComponent(getTextField(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
							.addComponent(getLblNewLabel_4())
							.addComponent(getTextField_1(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
							.addComponent(getLblOcgovorC())
							.addComponent(getTextField_2(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
							.addComponent(getLblOdgovorD())
							.addComponent(getTextField_3(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(190))
			);
			panel_12.setLayout(gl_panel_12);
		}
		return panel_12;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Odgovor A");
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Odgovor B");
		}
		return lblNewLabel_4;
	}
	private JLabel getLblOcgovorC() {
		if (lblOcgovorC == null) {
			lblOcgovorC = new JLabel("Odgovor C");
		}
		return lblOcgovorC;
	}
	private JLabel getLblOdgovorD() {
		if (lblOdgovorD == null) {
			lblOdgovorD = new JLabel("Odgovor D");
		}
		return lblOdgovorD;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JPanel getPanel_13_1() {
		if (panel_13 == null) {
			panel_13 = new JPanel();
			panel_13.setLayout(new BorderLayout(0, 0));
			panel_13.add(getLabel(), BorderLayout.WEST);
			panel_13.add(getTextPane_1(), BorderLayout.CENTER);
			panel_13.add(getButton(), BorderLayout.EAST);
			panel_13.add(getPanel_14(), BorderLayout.SOUTH);
		}
		return panel_13;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Pitanje glasi:");
		}
		return label;
	}
	private JTextPane getTextPane_1() {
		if (textPane_1 == null) {
			textPane_1 = new JTextPane();
		}
		return textPane_1;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Dodaj");
		}
		return button;
	}
	private JPanel getPanel_14() {
		if (panel_14 == null) {
			panel_14 = new JPanel();
			panel_14.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_14.add(getLabel_1());
			panel_14.add(getRadioButton());
			panel_14.add(getRadioButton_1());
			panel_14.add(getRadioButton_2());
		}
		return panel_14;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Tezina pitanja: ");
		}
		return label_1;
	}
	private JRadioButton getRadioButton() {
		if (radioButton == null) {
			radioButton = new JRadioButton("Lako");
		}
		return radioButton;
	}
	private JRadioButton getRadioButton_1() {
		if (radioButton_1 == null) {
			radioButton_1 = new JRadioButton("Srednje");
		}
		return radioButton_1;
	}
	private JRadioButton getRadioButton_2() {
		if (radioButton_2 == null) {
			radioButton_2 = new JRadioButton("Tesko");
		}
		return radioButton_2;
	}
	private JPanel getPanel_15() {
		if (panel_15 == null) {
			panel_15 = new JPanel();
			panel_15.setLayout(null);
			panel_15.add(getLblNewLabel_5());
			panel_15.add(getTextField_4());
		}
		return panel_15;
	}
	private JPanel getPanel_16() {
		if (panel_16 == null) {
			panel_16 = new JPanel();
			panel_16.setLayout(new BorderLayout(0, 0));
			panel_16.add(getLabel_2(), BorderLayout.WEST);
			panel_16.add(getTextPane_2(), BorderLayout.CENTER);
			panel_16.add(getButton_1(), BorderLayout.EAST);
			panel_16.add(getPanel_17(), BorderLayout.SOUTH);
		}
		return panel_16;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Pitanje glasi:");
		}
		return label_2;
	}
	private JTextPane getTextPane_2() {
		if (textPane_2 == null) {
			textPane_2 = new JTextPane();
		}
		return textPane_2;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Dodaj");
		}
		return button_1;
	}
	private JPanel getPanel_17() {
		if (panel_17 == null) {
			panel_17 = new JPanel();
			panel_17.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_17.add(getLabel_3());
			panel_17.add(getRadioButton_3());
			panel_17.add(getRadioButton_4());
			panel_17.add(getRadioButton_5());
		}
		return panel_17;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Tezina pitanja: ");
		}
		return label_3;
	}
	private JRadioButton getRadioButton_3() {
		if (radioButton_3 == null) {
			radioButton_3 = new JRadioButton("Lako");
		}
		return radioButton_3;
	}
	private JRadioButton getRadioButton_4() {
		if (radioButton_4 == null) {
			radioButton_4 = new JRadioButton("Srednje");
		}
		return radioButton_4;
	}
	private JRadioButton getRadioButton_5() {
		if (radioButton_5 == null) {
			radioButton_5 = new JRadioButton("Tesko");
		}
		return radioButton_5;
	}
	private JPanel getPanel_18() {
		if (panel_18 == null) {
			panel_18 = new JPanel();
			panel_18.setLayout(new BorderLayout(0, 0));
			panel_18.add(getScrollPane_4(), BorderLayout.CENTER);
		}
		return panel_18;
	}
	private JPanel getPanel_19() {
		if (panel_19 == null) {
			panel_19 = new JPanel();
			panel_19.setLayout(new BorderLayout(0, 0));
			panel_19.add(getLabel_4(), BorderLayout.WEST);
			panel_19.add(getTextPane_3());
			panel_19.add(getButton_2(), BorderLayout.EAST);
			panel_19.add(getPanel_20(), BorderLayout.SOUTH);
		}
		return panel_19;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Pitanje glasi:");
		}
		return label_4;
	}
	private JTextPane getTextPane_3() {
		if (textPane_3 == null) {
			textPane_3 = new JTextPane();
		}
		return textPane_3;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("Dodaj");
		}
		return button_2;
	}
	private JPanel getPanel_20() {
		if (panel_20 == null) {
			panel_20 = new JPanel();
			panel_20.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_20.add(getLabel_5());
			panel_20.add(getRadioButton_6());
			panel_20.add(getRadioButton_7());
			panel_20.add(getRadioButton_8());
		}
		return panel_20;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Tezina pitanja: ");
		}
		return label_5;
	}
	private JRadioButton getRadioButton_6() {
		if (radioButton_6 == null) {
			radioButton_6 = new JRadioButton("Lako");
		}
		return radioButton_6;
	}
	private JRadioButton getRadioButton_7() {
		if (radioButton_7 == null) {
			radioButton_7 = new JRadioButton("Srednje");
		}
		return radioButton_7;
	}
	private JRadioButton getRadioButton_8() {
		if (radioButton_8 == null) {
			radioButton_8 = new JRadioButton("Tesko");
		}
		return radioButton_8;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Odgovor");
			lblNewLabel_5.setBounds(62, 191, 42, 14);
		}
		return lblNewLabel_5;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(157, 188, 617, 20);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JScrollPane getScrollPane_4() {
		if (scrollPane_4 == null) {
			scrollPane_4 = new JScrollPane();
			scrollPane_4.setViewportView(getLblSlika_1());
			scrollPane_4.setColumnHeaderView(getBtnDodajSliku());
		}
		return scrollPane_4;
	}
	private JLabel getLblSlika_1() {
		if (lblSlika_1 == null) {
			lblSlika_1 = new JLabel("Slika");
		}
		return lblSlika_1;
	}
	private JButton getBtnDodajSliku() {
		if (btnDodajSliku == null) {
			btnDodajSliku = new JButton("Dodaj sliku");
			btnDodajSliku.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ImageIcon img = new ImageIcon(dodajNovo());
					lblSlika_1.setIcon(img);
					lblSlika_1.setText(null);
				}
			});
		}
		return btnDodajSliku;
	}
}
