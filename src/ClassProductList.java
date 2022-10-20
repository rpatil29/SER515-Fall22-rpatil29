import java.util.*;

public class ClassProductList {


	private ReminderVisitor reminderVisitor;

	private ProductIterator productIterator;

	private Hashtable<String, List<String>> product;

	public Reminder accept(NodeVisitor visitor) {
		System.out.println("Product List Reminder");
		return visitor.visitProduct(this);

	}
	
	
	
	public Iterator createIterator()
	{
	    product = DriverCode.productInfo;
		return product.values().iterator();
	}
}
