public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {
		System.out.println("Visiting Product ");

	}

	public void visitTrading(Trading trading) {
		System.out.println("Visiting Trading");

	}

	public void visitFacade(Facade facade) {
		System.out.println("Visiting Facade");

	}

	@Override
	public Reminder visitProduct(ClassProductList cpl) {
		System.out.println("Visiting Class product list");
		return m_Reminder;
	}

}
