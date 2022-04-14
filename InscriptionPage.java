package gestionLogistique;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;

public class InscriptionPage {

	JFrame frmPageDinscription;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField usernameField;
	private JPasswordField passwordField;

	
	/**
	 * Create the application.
	 */
	public InscriptionPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPageDinscription = new JFrame();
		frmPageDinscription.setResizable(false);
		frmPageDinscription.setOpacity(1.0f);
		frmPageDinscription.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Downloads\\images.png"));
		frmPageDinscription.setBackground(Color.DARK_GRAY);
		frmPageDinscription.getContentPane().setBackground(UIManager.getColor("CheckBox.highlight"));
		frmPageDinscription.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 51));
		panel.setBounds(0, 0, 728, 82);
		frmPageDinscription.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("INSCRIPTION");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_4.setForeground(SystemColor.inactiveCaption);
		lblNewLabel_4.setBounds(268, 23, 213, 36);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(0, 84, 728, 406);
		frmPageDinscription.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(123, 74, 100, 23);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(322, 74, 164, 23);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Prénom :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(123, 135, 100, 23);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(322, 135, 164, 25);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(123, 196, 118, 23);
		panel_1.add(lblNewLabel_2);
		
		usernameField = new JTextField();
		usernameField.setBounds(322, 196, 164, 23);
		panel_1.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(123, 257, 100, 23);
		panel_1.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(322, 257, 164, 25);
		panel_1.add(passwordField);
		
		JCheckBox showPassword = new JCheckBox("Afficher le mot de passe");
		showPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		showPassword.setBackground(new Color(0, 153, 153));
		showPassword.setBounds(322, 293, 164, 23);
		panel_1.add(showPassword);
		
		JButton addUser = new JButton("Enregistrer");
		addUser.setBorder(new CompoundBorder());
		addUser.setBackground(new Color(0, 102, 153));
		addUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addUser.setBounds(288, 344, 110, 31);
		panel_1.add(addUser);
		frmPageDinscription.setTitle("Page d'inscription");
		frmPageDinscription.setBounds(100, 100, 744, 529);
		frmPageDinscription.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		addUser.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == addUser) {
				String username = usernameField.getText();
				String password = passwordField.getText();
				usernameField.setText("");
	            passwordField.setText("");
				Accounts accounts = new Accounts(username, password);
				accounts.Save();
				
				JOptionPane.showMessageDialog(null, "Inscription réussie");
				
				}
			    
				if(e.getSource() == showPassword) {
					if(showPassword.isSelected()) {
						passwordField.setEchoChar((char) 0);
					}else {
						passwordField.setEchoChar('*');
					}
				}
				
				LoginFrame frame = new LoginFrame();
		        frame.setTitle("Login Form");
		        frame.setVisible(true);
		        frame.setBounds(10, 10, 520, 500);
		        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		        frame.setResizable(false);
		        frmPageDinscription.dispose();			
				
			}
		});
		
	}
	
}
