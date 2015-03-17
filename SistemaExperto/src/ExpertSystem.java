import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONObject;


public class ExpertSystem {
	
	List<JSONObject> jsonObjects;
	
	public ExpertSystem (List<JSONObject> jObjects){
		this.jsonObjects = jObjects;
	}
	
	public String start(){
		String input;
		Scanner in = new Scanner(System.in);
		
		System.out.println("tiene motor? y/n");
		input = in.nextLine();
		//ver si tiene motor y no
		if(input.equals("y"))
		{
			System.out.println("cuantas llantas tiene?");
			int tires = in.nextInt();
			switch(tires) 
			{
			case 2:
				return "motocicleta";
				
			case 3:
				return "MiniVan";
				
			case 4:
				System.out.flush();
				System.out.println("que tamaño es? ( b(grande) / m(mediano) / s(pequeño) )");
				input = in.next();
				if(input.equals("b"))
				{
					return "SUV";
				}
				if(input.equals("m"))
				{
					return "sedan";
				}
				else{
					System.out.println("tiene 2 puertas? y/n");
					input = in.next();
					if(input.equals("y"))
					{
						return "Sports Car";
					}
	
				}
				
				
			default: 
				break;
			}
		}
		else
		{
			System.out.println("cuantas llantas tiene?");
			int tires = in.nextInt();
			switch(tires) 
			{
			case 2:
				System.out.println("es una bicicleta");
				return "bicicleta";
				
			case 3:
				System.out.println("es un triciclo");
				return "triciclo";
				
			default: 
				break;
			}
			
		}
			
		in.close();
		
		return "Lo siento no se de que estas hablando";
	}

}
