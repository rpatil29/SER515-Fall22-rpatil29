import java.util.*;

/**
 * SER-515 ProductList class
 * 
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-19-2022
 */
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
