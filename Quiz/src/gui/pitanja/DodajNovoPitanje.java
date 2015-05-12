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
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;

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
		setTitle("Dodaj novo pitanje");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 418);
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
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
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
					Image imga = img.getImage();
					imga.getHeight(observer)
					imageUpdate(imga, 0, 50, 50, 50, 50);
					img.setImage(imga);
					label.setIcon(img);
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
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setSize(new Dimension(55, 55));
			
		}
		return label;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
		}
		return lblNewLabel_2;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.setLayout(new BorderLayout(0, 0));
			panel_6.add(getLabel());
		}
		return panel_6;
	}
	private JPanel getPanel_7() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
			panel_7.setLayout(new BorderLayout(0, 0));
			panel_7.add(getLblNewLabel());
		}
		return panel_7;
	}
	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
			panel_8.setLayout(new BorderLayout(0, 0));
			panel_8.add(getLblNewLabel_1());
		}
		return panel_8;
	}
	private JPanel getPanel_9() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
			panel_9.setLayout(new BorderLayout(0, 0));
			panel_9.add(getLblNewLabel_2());
		}
		return panel_9;
	}
}
