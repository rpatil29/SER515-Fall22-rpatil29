/**
 * SER-515 Buyer Class
 * 
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-19-2022
 */
public class Buyer extends Person {

	Buyer()
	{
		super(productMenu);
	}
	
	Buyer(ProductMenu productMenu)
	{
		super(productMenu);
	}
	public void showMenu() {
		System.out.println("Buyer Menu Items are: ");
		
	}
	
	@Override
	public void showAddButton() {
		System.out.println();
	}
	
	public void showViewButton() {
		System.out.println();
	}

	public void showRadioButton() {
		System.out.println();

	}

	public ProductMenu createProductMenu() {
		String test = "Produce";
		if (test.equalsIgnoreCase("Meat")) {
			return new MeatProductMenu();
		} else {
			return new ProduceProductMenu();
		}
	}

}
