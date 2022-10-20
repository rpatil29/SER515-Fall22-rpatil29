/**
 * SER-515 Trading Class
 * 
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-19-2022
 */

public class Trading {

	private OfferingList offeringList;

	private Product product;

	public void accept(NodeVisitor visitor) {

	}

	public void addTrading() {
		System.out.println("Add the trading details");
		
	}

	public void viewTrading() {
		System.out.println("View the trading details");
		
	}

	public void decideBidding() {
		System.out.println("Decide the bidding");
		
	}

	public void submitBidding() {
		System.out.println("Submit Bidding");
		
	}

}
