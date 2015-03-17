import java.util.List;
import org.json.simple.JSONObject;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String workingDir = System.getProperty("user.dir");
		String filename = workingDir + "\\SistemaExperto\\src\\jason.json";
		
		JSONReader jreader;
		List<JSONObject> objects;
		
		// creamos una instancia de la clase JSONReader, mandando como argumento el nombre de nuestro json file
		jreader = new JSONReader(filename);
		objects = jreader.getObjects();
		
		//ahora ejecutamos el sistema experto y mostramos el resultado
		ExpertSystem es = new ExpertSystem(objects);
		String retval = es.start();
		
		System.out.println("Será un(a): " + retval + "?");
		
		
		

	}

}
