import java.io.*;
import java.util.*;

public class DriverCode {
	
	public static Hashtable<String, List<String>> userProduct = new Hashtable<>(); 
	
	public static Hashtable<String, List<String>> buyerInfo = new Hashtable<>();
	
	public static Hashtable<String, List<String>> sellerInfo = new Hashtable<>();
	
	public static Hashtable<String, List<String>> productInfo = new Hashtable<>();

	void fillHashTables(Hashtable<String, List<String>> hs, File file)
	{
		List<String> list;
		try {
		Scanner myReader = new Scanner(file);
		while(myReader.hasNextLine())
		{
			String[] line  = myReader.nextLine().split(":");
			if(hs.containsKey(line[0])){
				hs.get(line[0]).add(line[1]);
			}
			else {
				list = new ArrayList<>();
				list.add(line[1]);
				hs.put(line[0],list);
			}
			
		}
		myReader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		DriverCode dc = new DriverCode();
		
		File userProductFile = new File("files/UserProduct.txt");
		File buyerInfoFile = new File("files/BuyerInfo.txt");
		File sellerInfoFile = new File("files/SellerInfo.txt");
		File productInfoFile = new File("files/ProductInfo.txt");
		
		//Filling hashtables with all the information of files 
		dc.fillHashTables(userProduct, userProductFile);
		dc.fillHashTables(buyerInfo, buyerInfoFile);
		dc.fillHashTables(sellerInfo, sellerInfoFile);
		dc.fillHashTables(productInfo, productInfoFile);
		
		
		Facade fc = new Facade();
		fc.startFacade();
		

	}

}

//tutu:Beef
//tutu:Tomato
//mimi:Beef
//mimi:Onion
//pepe:Beef
//pepe:Tomato
//pepe:Onion

