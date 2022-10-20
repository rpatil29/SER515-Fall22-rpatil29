import java.util.*;

public class OfferingList {

	private Set<String> product;

	private Trading trading;

	private OfferingIterator offeringIterator;

	public Iterator createIterator() {
		product = DriverCode.productInfo.keySet();
		
		return this.product.iterator();
	}

	

}
