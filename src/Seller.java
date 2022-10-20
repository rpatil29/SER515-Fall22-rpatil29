public class Seller extends Person {

	Seller()
	{
		super(productMenu);
	}
	
	Seller(ProductMenu productMenu)
	{
		super(productMenu);
	}
	public void showMenu() {
		System.out.println("Seller Menu Items are: ");
		
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
		if (test.equalsIgnoreCase("Produce")) {
			return new MeatProductMenu();
		} else {
			return new ProduceProductMenu();
		}
	}

}
