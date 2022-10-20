/**
 * SER-515 ProduceProductMenu Class
 * 
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-19-2022
 */


public class ProduceProductMenu implements ProductMenu {

	public void showMenu(int UserType) {
		System.out.println("Produce Product Menu Selected");
		System.out.println("||  Bridge Pattern for connection ||");
		Person person;
		
		if(UserType == 0) {
			person = PersonFactory.createObject("Buyer");
		}
		else
		{
			person = PersonFactory.createObject("Seller");
		}
		person.showMenu();

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
