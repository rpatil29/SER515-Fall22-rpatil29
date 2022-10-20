import java.util.*;
/**
 * SER-515 Offering List class
 * 
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-19-2022
 */

public class OfferingList {

	private Set<String> product;

	private Trading trading;

	private OfferingIterator offeringIterator;

	public Iterator createIterator() {
		product = DriverCode.productInfo.keySet();
		
		return this.product.iterator();
	}

	

}
