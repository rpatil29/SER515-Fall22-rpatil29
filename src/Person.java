/**
 * SER-515 Person abstract class
 * 
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-19-2022
 */
public abstract class Person {

	private int theProductMenu;

	protected static ProductMenu productMenu;

	public abstract void showMenu();
	
	@SuppressWarnings("static-access")
	Person(ProductMenu productMenu) {
		this.productMenu = productMenu;
	}
	
	public void showAddButton() {
		productMenu.showAddButton();

	}

	public void showViewButton() {
		productMenu.showViewButton();

	}

	public void showRadioButton() {
		productMenu.showRadioButton();

	}

	public abstract ProductMenu createProductMenu();
	

}
