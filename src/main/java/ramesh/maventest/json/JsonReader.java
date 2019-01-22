package ramesh.maventest.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		JSONArray arr = new JSONArray();
		arr = (JSONArray) jsonParser.parse(new FileReader("myJson.json"));
		
		for(Object str :arr) {
			System.out.println(str);
			displayJsonValue((JSONObject) str);
		}
	}
	private static void displayJsonValue (JSONObject jsonObj) {
		jsonObj = (JSONObject) jsonObj.get("employee");
		System.out.println("Name: "+jsonObj.get("name"));
		System.out.println("Age: "+jsonObj.get("age"));
		System.out.println("Job: "+jsonObj.get("job"));
	}
}
