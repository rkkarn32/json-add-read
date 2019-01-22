package ramesh.maventest.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriter {

	public static void main(String[] args) {
		JSONArray jsonArray = new JSONArray();
		for(int i =0 ;i<=10; i++) {
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("name","name_"+i );
			jsonObj.put("age", (10*i+1) );
			jsonObj.put("job","Job_"+i );
			JSONObject empObj = new JSONObject();
			empObj.put("employee", jsonObj);
			jsonArray.add(empObj);
		}
		
//		jsonObj.put("list", jsonArray);
		
		try (FileWriter file = new FileWriter("myJson.json");FileWriter file2 = new FileWriter("myJson2.json");  ){
			file.write(jsonArray.toString());
			file2.write(jsonArray.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(jsonArray);
	}

}
