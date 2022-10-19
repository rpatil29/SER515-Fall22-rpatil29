public class MeatProductMenu implements ProductMenu {

	public void showMenu(int UserType) {
		System.out.println("Meat Product Menu Selected");
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
