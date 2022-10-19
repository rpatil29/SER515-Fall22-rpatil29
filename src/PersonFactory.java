
public class PersonFactory extends Person{

	PersonFactory(ProductMenu productMenu) {
		super(productMenu);
	}
	
	@Override
	public void showMenu() {}

	@Override
	public ProductMenu createProductMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Person createObject(String str) {
		Person person;
		System.out.println("Factory Pattern used for user Creation");
		if(str.equalsIgnoreCase("Buyer"))
		{
			person = new Buyer();
		}
		else
		{
			person = new Seller();
		}
		return person;
	}
	

}
