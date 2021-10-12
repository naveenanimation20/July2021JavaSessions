package HashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {

	public static void main(String[] args) {

		//<key,value>
		//name: macbook
		//price:1200
		//seller:
		//address:
		
		//properties -- config.properties --> <key, value> -- pair -- set
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		
		empMap.put("QTP", "Func Testing Tool");
		empMap.put("Selenium", "Func Web Testing Lib");
		empMap.put("JMeter", "Load Testing Tool");
		empMap.put("Postman", "API Testing Tool");
		empMap.put("Postman", "API Doc Testing Tool");
		empMap.put(null, "no tool");
		empMap.put(null, "no product");
		empMap.put("Zalenium", null);
		
		System.out.println(empMap);

		System.out.println(empMap.get("QTP"));
		System.out.println(empMap.get("Postman"));
		System.out.println(empMap.get("cypress"));
		System.out.println(empMap.get(null));
		System.out.println(empMap.get("Zalenium"));
		
		System.out.println("-----");
		//for each loop:
//		for(Map.Entry<String, String> e : empMap.entrySet()) {
//			String key = e.getKey();
//			String value = e.getValue();
//			System.out.println(key + ":" + value);
//		}
		
		//using lambda:
		empMap.forEach((k,v) -> System.out.println(k+":"+v));
		
	}

}
