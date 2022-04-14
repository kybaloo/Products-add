package gestionLogistique;

import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	/**
	 * Launch the application.
	 */
	
    public static void main(String[] args) throws IOException {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				/**
				* Launch the Inscription page
				*/
				try {
					InscriptionPage window = new InscriptionPage();
					window.frmPageDinscription.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
       
            
    }
}
