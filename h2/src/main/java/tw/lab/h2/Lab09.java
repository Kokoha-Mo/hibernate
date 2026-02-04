package tw.lab.h2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tools.jackson.core.JacksonException;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

/*
 *	ObjectMapper => Jackson core
 *	Object -> JSON: Map,List,POJO
 *	JSON -> Object: 對應
 *	write / read
 *	writeValueAsString 
 *	writeValue => JSON File
 *	readValue
 *
 *	readTree
 *	writerWithDefaultPrettyPrinter()
 */

public class Lab09 {
	public static void main(String[] args) {
		// java Object -> JSON String
		ObjectMapper mapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap();
		map.put("name", "Alex");
		map.put("age", 18);
		String json = "";
		try {
			json = mapper.writeValueAsString(map);
		}catch (JacksonException e) {
			System.out.println(e);
		}
		System.out.println(json);
		System.out.println("--------");
		
		String json2 ="""
				{
				  "date" : "1996-07-04 00:00:00",
				  "details" : [ {
				    "pname" : "Queso Cabrales",
				    "price" : 14.0000,
				    "qty" : 12
				  }, {
				    "pname" : "Singaporean Hokkien Fried Mee",
				    "price" : 9.8000,
				    "qty" : 10
				  }, {
				    "pname" : "Mozzarella di Giovanni",
				    "price" : 34.8000,
				    "qty" : 5
				  } ],
				  "employee" : "Buchanan",
				  "customer" : "Vins et alcools Chevalier"
				}
				""";
		
		Map<String, Object> result;
		result = mapper.readValue(json2,
				new TypeReference<Map<String, Object>>(){});
		System.out.println(result.get("date"));
		System.out.println(result.get("customer"));
		List<Map<String, Object>> details = (List<Map<String, Object>>) result.get("details");
		System.out.println(details.size());
		System.out.println(details.get(0).get("pname"));
	}
}
