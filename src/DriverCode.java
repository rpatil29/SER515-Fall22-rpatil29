import java.io.*;
import java.util.*;

public class DriverCode {
	
	public static Hashtable<String, List<String>> userProduct = new Hashtable<>();

	public static void main(String[] args) {
		try {
		File buyerInfo = new File("files/UserProduct.txt");
		Scanner myReader = new Scanner(buyerInfo);
		List<String> list;
		while(myReader.hasNextLine())
		{
			String[] line  = myReader.nextLine().split(":");
			if(userProduct.containsKey(line[0])){
				userProduct.get(line[0]).add(line[1]);
			}
			else {
				list = new ArrayList<>();
				list.add(line[1]);
				userProduct.put(line[0],list);
			}
			
		}
		myReader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Excption Caught");
			e.printStackTrace();
		}
		Facade fc = new Facade();
		fc.viewTrading();
		

	}

}

//tutu:Beef
//tutu:Tomato
//mimi:Beef
//mimi:Onion
//pepe:Beef
//pepe:Tomato
//pepe:Onion
