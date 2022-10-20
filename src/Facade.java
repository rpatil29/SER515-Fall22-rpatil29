import java.util.*;

public class Facade {

	private int UserType;

	private int nProductCategory;

	private Product theSelectedProduct;

	private ClassProductList theProductList;

	private Person thePerson;
	
	Scanner sc = new Scanner(System.in);

	public void startFacade() {
		System.out.println("Facade Pattern started ");
		UserType = login();
		
		//Implementing Bridge Pattern  and Factory Pattern
		System.out.println("Select from available food types ");
		System.out.println("1. Meat Product Menu");
		System.out.println("2. Produce Product Menu");
		nProductCategory= sc.nextInt();
		
		if(nProductCategory == 1)
		{
			createProductList(new MeatProductMenu(), UserType);
		}
		else if(nProductCategory == 2)
		{
			createProductList(new ProduceProductMenu(), UserType);
		}
		
		else {
			System.out.println("Bad Input");
			System.err.println("System Exit");
			System.exit(-1);
		}
		
		System.out.println("Implementing Visitor Pattern");
		remind();
		
		System.out.println("Iterator Pattern implemented");
		
		ClassProductList cpl = new ClassProductList();
		Iterator iterate = (Iterator) cpl.createIterator();	
		
		
		OfferingIterator oi = new OfferingIterator();
		OfferingList ol = new OfferingList(); 
		Iterator iterator2 = ol.createIterator(); 
 		while(oi.hasNext(iterate)) {
			System.out.println(iterator2.next());
			System.out.println(oi.Next(iterate));
			
		}
 		
 		System.out.println("End of iterator Pattern");
 		
 		sc.close();
		
		}
	
	public int login() {
		System.out.println("========= Login Screen =============");
		System.out.println("Please check the menu: \n\t 1. Buyer \n\t 2. Seller");
		System.out.println(" Enter the number: ");
		int person = sc.nextInt();
		if(person == 1)
		{
			System.out.println("Welcome Buyer");
			System.out.println("Please Enter your name: ");
			String name = sc.next();
			name = name.toLowerCase();
			if(DriverCode.buyerInfo.containsKey(name)) {
				System.out.println("Enter 4 digit passcode ");
				String passcode = sc.next();
				if(0 == passcode.compareToIgnoreCase(DriverCode.buyerInfo.get(name).get(0))){
					System.out.println("Welcome "+name);
					return 0;
				}
				
			}
		}
		if(person == 2)
		{
			System.out.println("Welcome Seller");
			System.out.println("Please Enter your name: ");
			String name = sc.next();
			name = name.toLowerCase();
			if(DriverCode.sellerInfo.containsKey(name)) {
				System.out.println("Enter 4 digit passcode ");
				String passcode = sc.next();
				if(0 == passcode.compareToIgnoreCase(DriverCode.sellerInfo.get(name).get(0))){
					System.out.println("Welcome "+name);
					return 1;
				}
				
			}
		}
		System.out.println("Invalid Credentials");
		System.err.println("Exiting");
		return -1;
	}

	public void addTrading(Trading trading) {
		trading.addTrading();

	}

	public void viewTrading(Trading trading) {
		trading.viewTrading();		
	}

	public void decideBidding(Trading trading) {
		trading.decideBidding();
	}

	public void submitBidding(Trading trading) {
		trading.submitBidding();
	}

	public void remind() {
		System.out.println("Calling reminder and visitor classes");
		ReminderVisitor remind = new ReminderVisitor();
		ClassProductList cpl = new ClassProductList();
		cpl.accept(remind);

	}

	/**
	 *  
	 */
	public void createUser(UserInformation userInformation) {
		userInformation.createUser();
	}

	public void createProductList(ProductMenu pm, int userType) {
		pm.showMenu(userType);

	}

	public void AttachProductToUser(ProductMenu pm) {
		pm.AttachProducttoUser();

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation(ProductMenu pm) {

		pm.productOperation();
	}

}
