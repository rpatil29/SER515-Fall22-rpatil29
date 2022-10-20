public abstract interface ProductMenu {

	public abstract void showMenu(int UserType);

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();
	
	public default void AttachProducttoUser()
	{
		System.out.println("Product attached to user");
	}

	public default void productOperation() {
		System.out.println("Operation performed on the product");
	}

}
