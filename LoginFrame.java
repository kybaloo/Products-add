package gestionLogistique;

import javax.swing.*;

import gestionLogistique.Menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame<username, password> extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Afficher le mot de passe");
    private final JPanel panel = new JPanel();
    private final JLabel lblNewLabel = new JLabel("Connectez-vous");


    LoginFrame() {
    	setBounds(new Rectangle(10, 10, 500, 600));
    	getContentPane().setBackground(new Color(0, 153, 153));
    	setBackground(Color.DARK_GRAY);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        userLabel.setBounds(87, 150, 100, 30);
        passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        passwordLabel.setBounds(87, 220, 100, 30);
        userTextField.setBounds(238, 152, 150, 30);
        passwordField.setBounds(238, 222, 150, 30);
        showPassword.setBackground(new Color(0, 153, 153));
        showPassword.setBounds(238, 248, 150, 30);
        loginButton.setBounds(87, 300, 100, 30);
        resetButton.setBounds(288, 300, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        panel.setBackground(new Color(0, 51, 51));
        panel.setBounds(0, 0, 510, 65);
        
        getContentPane().add(panel);
        panel.setLayout(null);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
        lblNewLabel.setForeground(SystemColor.inactiveCaptionBorder);
        lblNewLabel.setBounds(0, 11, 510, 43);
        
        panel.add(lblNewLabel);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
        	Accounts<username, password> accounts = new Accounts<username, password>(getName(), getPassword());
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equals(accounts.searchUsername(userText)) && pwdText.equals(accounts.searchPassword(pwdText))) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
        
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmMenu.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        
        
    }

	private String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}



    }

