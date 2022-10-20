import java.util.Iterator;

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
