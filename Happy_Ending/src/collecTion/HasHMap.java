package collecTion;

import java.util.HashMap;

public class HasHMap {
	public static void main(String[] args) {
		HashMap<String, String> cityCode = new HashMap<String, String>();
		
		cityCode.put("USA", "United States of America");
		cityCode.put("IN", "India");
		cityCode.put("UK", "United Kingdom");
		cityCode.put("PAK", "Pakistan");
		cityCode.put("RUS", "Russia");
		cityCode.put("JPN", "Japan");
		
		System.out.println(cityCode);
		
//		cityCode.putAll(cityCode);
//		System.out.println(cityCode);
		
//		System.out.println(cityCode.putIfAbsent("BH", "BHARAT"));
//		System.out.println(cityCode.get("IN"));
		
//		System.out.println(cityCode.getOrDefault("INA", "Not Found"));
//		System.out.println(cityCode.keySet());
//		System.out.println(cityCode.values());
//		System.out.println(cityCode.entrySet());
		
		System.out.println(cityCode.replace("IN", "BHARAT"));
		System.out.println(cityCode);
		
		
//		System.out.println(cityCode.remove("PAK"));
//		System.out.println(cityCode.remove("PAK", "Pakistan"));
		System.out.println(cityCode);
//		System.out.println(cityCode);
		
	}
}
