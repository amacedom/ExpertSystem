import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class JSONReader {
	
	JSONParser parser;
	JSONArray array;
	String content;
	
	
	public JSONReader (String filename) {
		// recibimos el nombre del archivo como parametro en el constructor para tratar de abrirlo y pasarlo a una cadena
		this.content = "Error al leer el JSON";
		this.parser = new JSONParser();
		
		try {
			System.out.println("Abriendo archivo... " + filename);
			content = new Scanner(new File(filename)).useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(content);
		System.out.println("Parseando archivo JSON...");
		
		try {
			Object obj = JSONValue.parse(content);
			this.array = (JSONArray) obj;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public List<JSONObject> getObjects() {
		List<JSONObject> jsonObjects = new ArrayList<JSONObject>();
		
		for(Object o: this.array)
		{
			JSONObject jObject = new JSONObject();
			jObject = (JSONObject) o;
			jsonObjects.add(jObject);
		}
	
		return jsonObjects;
	}
	
}
