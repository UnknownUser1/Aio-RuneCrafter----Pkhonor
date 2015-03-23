package aiorunecrafterpkhonor.misc;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import aiorunecrafterpkhonor.Main;

public class Gui extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Gui() {
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) {
		if (comboBox_runeId.getSelectedIndex() == 0) {
			Main.alterName = "Air Runes";
			Variables.runeId = 2478;
		} else {
			if (comboBox_runeId.getSelectedIndex() == 1) {
				Main.alterName = "Mind Runes";
				Variables.runeId = 2479;
			} else {
				if (comboBox_runeId.getSelectedIndex() == 2) {
					Main.alterName = "Body Runes";
					Variables.runeId = 2483;
				} else {
					if (comboBox_runeId.getSelectedIndex() == 3) {
						Main.alterName = "Chaos Runes";
						Variables.runeId = 2487;
					} else {
						if (comboBox_runeId.getSelectedIndex() == 4) {
							Main.alterName = "Nature Runes";
							Variables.runeId = 2486;
						} else {
							if (comboBox_runeId.getSelectedIndex() == 5) {
								Main.alterName = "Law Runes";
								Variables.runeId = 2485;
							} else {
								if (comboBox_runeId.getSelectedIndex() == 6) {
									Main.alterName = "Death Runes";
									Variables.runeId = 2488;
								} else {
									if (comboBox_runeId.getSelectedIndex() == 7) {
										Main.alterName = "Blood Runes";
										Variables.runeId = 2480;
									}
								}
							}
						}
					}
				}
			}
		}
		setVisible(false);
	}

	private void initComponents() {
		tabbedPane1 = new JTabbedPane();
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		panel2 = new JPanel();
		comboBox_runeId = new JComboBox<>();
		label5 = new JLabel();
		panel3 = new JPanel();
		label4 = new JLabel();
		checkBox_reLogin = new JCheckBox();
		textField_password = new JTextField();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		button_run = new JButton();

		// ======== this ========
		setTitle("Aio RuneCrafter");
		setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 8));
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		// ======== tabbedPane1 ========
		{

			// ======== panel1 ========
			{

				panel1.setLayout(null);

				// ---- label1 ----
				label1.setText("- More Runes To Come!");
				label1.setFont(new Font("Trajan Pro", Font.BOLD, 12));
				panel1.add(label1);
				label1.setBounds(5, 30, 175, label1.getPreferredSize().height);

				// ---- label2 ----
				label2.setText("- Supports Relogging!");
				label2.setFont(new Font("Trajan Pro", Font.BOLD, 12));
				panel1.add(label2);
				label2.setBounds(5, 55, 200, label2.getPreferredSize().height);

				// ---- label3 ----
				label3.setText("Information");
				label3.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
				panel1.add(label3);
				label3.setBounds(35, 5, 135, label3.getPreferredSize().height);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for (int i = 0; i < panel1.getComponentCount(); i++) {
						Rectangle bounds = panel1.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width,
								preferredSize.width);
						preferredSize.height = Math.max(bounds.y
								+ bounds.height, preferredSize.height);
					}
					Insets insets = panel1.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel1.setMinimumSize(preferredSize);
					panel1.setPreferredSize(preferredSize);
				}
			}
			tabbedPane1.addTab("Information", panel1);

			// ======== panel2 ========
			{
				panel2.setLayout(null);

				// ---- comboBox_runeId ----
				comboBox_runeId.setModel(new DefaultComboBoxModel<>(
						new String[] { "Air Runes", "Mind Runes", "Body Runes",
								"Chaos Runes", "Nature Runes", "Law Runes",
								"Death Runes", "Blood Runes" }));
				panel2.add(comboBox_runeId);
				comboBox_runeId.setBounds(5, 30, 95,
						comboBox_runeId.getPreferredSize().height);

				// ---- label5 ----
				label5.setText("Select Rune");
				panel2.add(label5);
				label5.setBounds(new Rectangle(new Point(5, 5), label5
						.getPreferredSize()));

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for (int i = 0; i < panel2.getComponentCount(); i++) {
						Rectangle bounds = panel2.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width,
								preferredSize.width);
						preferredSize.height = Math.max(bounds.y
								+ bounds.height, preferredSize.height);
					}
					Insets insets = panel2.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel2.setMinimumSize(preferredSize);
					panel2.setPreferredSize(preferredSize);
				}
			}
			tabbedPane1.addTab("Options", panel2);

			// ======== panel3 ========
			{
				panel3.setLayout(null);

				// ---- label4 ----
				label4.setText("Login Information");
				label4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
				panel3.add(label4);
				label4.setBounds(40, 5, 130, label4.getPreferredSize().height);

				// ---- checkBox_reLogin ----
				checkBox_reLogin.setText("Want to Relog?");
				panel3.add(checkBox_reLogin);
				checkBox_reLogin.setBounds(0, 30, 130,
						checkBox_reLogin.getPreferredSize().height);

				// ---- textField_password ----
				textField_password.setToolTipText("hi");
				textField_password.setText("Enter Password");
				panel3.add(textField_password);
				textField_password.setBounds(5, 60, 110, 20);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for (int i = 0; i < panel3.getComponentCount(); i++) {
						Rectangle bounds = panel3.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width,
								preferredSize.width);
						preferredSize.height = Math.max(bounds.y
								+ bounds.height, preferredSize.height);
					}
					Insets insets = panel3.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel3.setMinimumSize(preferredSize);
					panel3.setPreferredSize(preferredSize);
				}
			}
			tabbedPane1.addTab("Login", panel3);
		}
		contentPane.add(tabbedPane1);
		tabbedPane1.setBounds(0, 30, 245, 115);

		// ---- label6 ----
		label6.setText("UAio RuneCrafter!");
		label6.setFont(new Font("Tekton Pro Ext", Font.BOLD, 19));
		contentPane.add(label6);
		label6.setBounds(25, 5, 195, label6.getPreferredSize().height);

		// ---- label7 ----
		label7.setText("Made By");
		label7.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(label7);
		label7.setBounds(10, 185, 65, label7.getPreferredSize().height);

		// ---- label8 ----
		label8.setText("UnknownUser");
		label8.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(label8);
		label8.setBounds(25, 200, 100, label8.getPreferredSize().height);

		// ---- button_run ----
		button_run.setText("Run");
		button_run.addActionListener(e -> {
			button1ActionPerformed(e);
			button1ActionPerformed(e);
		});
		contentPane.add(button_run);
		button_run.setBounds(5, 155, 90, 20);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for (int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width,
						preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height,
						preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
	}

	private JTabbedPane tabbedPane1;
	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JPanel panel2;
	private JComboBox<String> comboBox_runeId;
	private JLabel label5;
	private JPanel panel3;
	private JLabel label4;
	public static JCheckBox checkBox_reLogin;
	public static JTextField textField_password;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JButton button_run;
}
