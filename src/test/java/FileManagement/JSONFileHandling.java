package FileManagement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Expectation=>
 * {"firstName":"John","lastName":"Smith","age":25,
 * "address":{"streetAddress":"21 2nd Street","city":"New York","state":"NY","postalCode":10021},
 * "phoneNumbers":[{"type":"home","number":"212 555-1234"},{"type":"fax","number":"646 555-4567"}]}
 */
@SuppressWarnings("unchecked")
public class JSONFileHandling {

	@BeforeMethod
	public void beforeMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase started-----------\n");
	}
	
	@AfterMethod
	public void afterMethod(Method method) {
		System.out.println("\n---------"+method.getName()+" Testcase completed-----------\n");
	}
	
	@Test(priority = 0)
	public void writeToJSONFile() {
		//Step1: Create JSON data in JSON form using JSONObject or collection
		JSONObject jsonData = new JSONObject();
		jsonData.put("firstName", "John");
		jsonData.put("lastName", "Smith");
		jsonData.put("age", 25);
		
		/*We can user JSONObject or map
		JSONObject addressObject = new JSONObject();
		addressObject.put("streetAddress", "21 2nd Street");
		addressObject.put("city", "New York");
		addressObject.put("state", "NY");
		addressObject.put("postalCode", 10021);*/
		
		Map<String, Object> addressObject = new LinkedHashMap<String, Object>(4);
		addressObject.put("streetAddress", "21 2nd Street");
		addressObject.put("city", "New York");
		addressObject.put("state", "NY");
		addressObject.put("postalCode", 10021);
		
		jsonData.put("address", addressObject);
		
		List<Object> phoneArray = new ArrayList<Object>();		//OR -> JSONArray phoneArray = new JSONArray();
		Map<String, Object> phoneObject = new LinkedHashMap<String, Object>(2);
		phoneObject.put("type", "home");
		phoneObject.put("number", "212 555-1234");
		phoneArray.add(phoneObject);
		
		phoneObject = new LinkedHashMap<String, Object>(2);
		phoneObject.put("type", "fax");
		phoneObject.put("number", "646 555-4567");
		phoneArray.add(phoneObject);
		
		jsonData.put("phoneNumbers", phoneArray);
		
		System.out.println("JSON DATA=> "+jsonData);
		
		try {
			FileWriter file = new FileWriter(".//src//test//resources//TestData//jsonData.json");
			file.write(jsonData.toJSONString());
			file.flush();	//It is used to flushes the data of FileWriter.
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 1)
	public void readJSONFile() {
		try {
			//Parsing json file
			Object obj = new JSONParser().parse(new FileReader(".//src//test//resources//TestData//jsonData.json"));
			
			//Casting a Object to JSONObject
			JSONObject jsonData = (JSONObject) obj;
			
			//Get data from json usin key
			String firstName = jsonData.get("firstName").toString();
			System.out.println("First Name=> "+firstName);
			
			String lastName = (String) jsonData.get("lastName");
			System.out.println("Last Name=> "+lastName);
			
			long age = (long) jsonData.get("age");
			System.out.println("Age=> "+age);
			
			JSONObject address = (JSONObject)jsonData.get("address");
			System.out.println("Address=> "+address);
			
			//convert JSON Objects to Map
			Map<String, Object> map = (Map<String, Object>)address;
			
			System.out.println("  Iterate map through for each loop=> ");
			for(Map.Entry<String, Object> ee:map.entrySet()) {
				System.out.println("     "+ee.getKey()+"=> "+ee.getValue());
			}			
			
			System.out.println("  Iterate map through iterator()=> ");
			Iterator<Map.Entry<String, Object>> itr = map.entrySet().iterator();
			while(itr.hasNext()){
				Map.Entry<String, Object> entry = itr.next();
				System.out.println("     "+entry.getKey()+"=> "+entry.getValue());
			}
			
			JSONArray phoneNos = (JSONArray)jsonData.get("phoneNumbers");
			System.out.println("Phone Numbers=> "+phoneNos);
			
			System.out.println("  Iterate JSONArray through List iterator (JSONArray converted to List)");
			List<Object> list = (List<Object>)phoneNos;
			Iterator<Object> itList = list.iterator();
			
			while(itList.hasNext()) {
				map = (Map<String, Object>)itList.next();
				for(Map.Entry<String, Object> entry:map.entrySet()) {
					System.out.println("     "+entry.getKey()+"=> "+entry.getValue());
				}
			}
			
			System.out.println("  Iterate JSONArray through iterator (directly use iterator on JSONArray)");
			itList = phoneNos.iterator();
			
			while(itList.hasNext()) {
				map = (Map<String, Object>)itList.next();
				for(Map.Entry<String, Object> entry:map.entrySet()) {
					System.out.println("     "+entry.getKey()+"=> "+entry.getValue());
				}
			}
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
	}
}
