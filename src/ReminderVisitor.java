/**
 * SER-515 Reminder Visitor Class
 * 
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-19-2022
 */

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
