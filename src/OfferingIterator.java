import java.util.Iterator;

/**
 * SER-515 Iterator Class
 * 
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-19-2022
 */

public class OfferingIterator {

	private OfferingList offeringList;

	public boolean hasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	public Object Next(Iterator iterator) {
		if(this.hasNext(iterator))
		{
			return iterator.next();
		}
		else
			return null;
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
