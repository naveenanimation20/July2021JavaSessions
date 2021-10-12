package HashMapConcept;

import java.util.HashMap;


public class AmazonWeb {
	
	HashMap<String, Object> credMap = new HashMap<String, Object>();


	public void doLogin(String un, String pwd) {
		System.out.println(un + "::" + pwd);
	}

	//RBAC -- user permission
	//Ecomm -- product meta data, price data: hashmap<k,v>
	public HashMap<String, String> getUserCredentials() {
		// key -- role (admin)
		// value -- credentials (admin:admin)
		HashMap<String, String> credMap = new HashMap<String, String>();

		credMap.put("customer", "naveen@gmail.com:naveen123");
		credMap.put("seller", "seller@gmail.com:seller123");
		credMap.put("vendor", "vendor@gmail.com:vendor123");
		credMap.put("partner", "partner@gmail.com:partner123");
		credMap.put("admin", "admin@gmail.com:admin123");

		return credMap;

	}

	public static void main(String[] args) {

		AmazonWeb obj = new AmazonWeb();
		String custCred = obj.getUserCredentials().get("partner");
		String username = custCred.split(":")[0];
		String password = custCred.split(":")[1];

		obj.doLogin(username, password);
	}

}
