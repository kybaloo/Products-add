package gestionLogistique;

import java.util.HashMap;
import java.util.Map.Entry;

public class Accounts<username, password> {
	
	private String username;
	private String password;
	HashMap<String, String> usersAccounts = new HashMap<>();
	
	public Accounts(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public void Save() {
		
		usersAccounts.put(username, password);
	}
	
	public boolean searchUsername(String userText) {
		return usersAccounts.containsKey(username);
		
	}
	

	public Object searchPassword(String pwdText) {
		// TODO Auto-generated method stub
		return usersAccounts.containsValue(password);
	}


}
