package gestionLogistique;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.CompoundBorder;
import javax.swing.JMenuBar;
import java.awt.ComponentOrientation;
import javax.swing.ListSelectionModel;

public class Menu {

	JFrame frmMenu;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	
	ArrayList<Products> prode = new ArrayList<>();
	
	
	
	
	
	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public Menu() throws FileNotFoundException, IOException {
		initialize();
		Table();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Downloads\\images.png"));
		frmMenu.setForeground(Color.DARK_GRAY);
		frmMenu.setBackground(Color.DARK_GRAY);
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 1154, 761);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new CompoundBorder());
		tabbedPane.setBackground(new Color(0, 153, 153));
		tabbedPane.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frmMenu.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel menuProd = new JPanel();
		tabbedPane.addTab("PRODUITS", null, menuProd, null);
		tabbedPane.setBackgroundAt(0, SystemColor.activeCaptionBorder);
		menuProd.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 447, 687);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		menuProd.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUITS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 427, 69);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id-Produit");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(20, 97, 157, 36);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom du Produit");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(20, 159, 157, 36);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Catégorie");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(20, 221, 157, 36);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quantité");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(20, 283, 157, 36);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Prix");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(20, 345, 157, 36);
		panel_2.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(198, 97, 157, 30);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(198, 164, 157, 30);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(198, 350, 157, 30);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Voitures", "Ordinateurs", "Bureaux"}));
		comboBox.setBounds(198, 224, 157, 30);
		panel_2.add(comboBox);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				String name = textField_1.getText();
				String cat = comboBox.getActionCommand();
				int quant = textField_4.getX();
				int price = textField_2.getY();
			
					
					Products[] product = {new Products(id, name, cat, quant, price)};
					ArrayList<Products> prod = new ArrayList<Products>(Arrays.asList(product));
					
					ObjectOutputStream oos = null;
					FileOutputStream fos = null;
					
					try {
						oos = new ObjectOutputStream(
								new BufferedOutputStream(
									new FileOutputStream(
										new File("ProdFile.txt"))));
						
						oos.writeObject(product);
						oos.writeObject(prod);
						oos.close();
						JOptionPane.showMessageDialog(null, "Produit enrégistré avec Succès");
					}catch (IOException eio){
						eio.printStackTrace();
					} finally {
						if (fos != null) {
							safeClose(fos);
						}
					}
					Table();
				
			}

			
	});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(161, 426, 120, 30);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Id-Produit");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(20, 503, 157, 36);
		panel_2.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setBounds(198, 503, 157, 30);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Rechercher");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField_3.getText();
				
				ObjectInputStream ois = null;
				FileInputStream fis = null;
				Products[] product = null;
				
				try {
					fis = new FileInputStream(new File("ProdFile.txt"));
					ois = new ObjectInputStream(fis);
					product = (Products[]) ois.readObject();
					ArrayList<Products> prod = (ArrayList<Products>) ois.readObject();
					
					for(Products produit : product) { 
						   if(produit.getId().equals(id)) { 
						       //found it!
							   System.out.println("Le produit s'y trouve");
							   System.out.println();
						   }else {
							   System.err.println("Le produit n'existe pas");
						   }
						}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(20, 592, 125, 31);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Supprimer");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(312, 592, 125, 30);
		panel_2.add(btnNewButton_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(198, 283, 83, 30);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(444, 0, 689, 687);
		menuProd.add(panel_4);
		panel_4.setLayout(null);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setRowHeight(22);
		table.setBounds(685, 685, -682, -685);
		table.setSize(300, 200);
		panel_4.add(table);
		
		JPanel menuCom = new JPanel();
		tabbedPane.addTab("COMMANDES\r\n", null, menuCom, null);
		menuCom.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(614, 11, 10, 10);
		menuCom.add(panel_3);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("FACTURES", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("SERVICES APRES VENTE\r\n", null, panel_1, null);
		
		
	}
	
	public void Table() {
		String [] produit = {"ID", "Nom du Produit", "Catégorie", "Quantité", "Prix"};
		String [] afficher = new String [6];
		DefaultTableModel model = new DefaultTableModel(null, produit);
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		try {
				fis = new FileInputStream(new File("ProdFile.txt"));
				ois = new ObjectInputStream(fis);
			
				Products[] product = (Products[]) ois.readObject();
				ArrayList<Products> prod = (ArrayList<Products>) ois.readObject();
				
				for(Products products : product) {
					afficher[0] = products.getId();
					afficher[1] = products.getName();
					afficher[2] = products.getCategory();
					afficher[3] = products.getCategory();
					afficher[4] = products.getCategory();
			
					model.addRow(afficher);
				}
				for(Products products : prod) {
					model.addColumn(prod);
				}
				ois.close();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
				},
				new String[] {
					"ID", "Nom du Produit", "Cat\u00E9gorie", "Quantit\u00E9", "Prix"
				}
			));
		} catch (Exception ex) {
			ex.printStackTrace();
			}
		}
	
	

	private void safeClose(Closeable closeable) {
		// TODO Auto-generated method stub
		try {
			closeable.close();
		} catch (IOException ioe) {
			// TODO: handle exception
			throw new RuntimeException(ioe);
		}
		
	}  
}
