package loginSystem;

import java.util.HashMap;

public class IDandPasswords {
HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Sikha","pizza");
		logininfo.put("Aditya","PASSWORD");
		logininfo.put("Rohan","abc123");
		logininfo.put("Neha","exam123");
	}
	
	public HashMap<String, String> getLoginInfo(){
		return logininfo;
	}

}
