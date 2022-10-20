/**
 * SER-515 Node Visitor Abstract class
 * 
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-19-2022
 */
public abstract class NodeVisitor {

	public abstract void visitProduct(Product product);

	public abstract void visitTrading(Trading trading);

	public abstract void visitFacade(Facade facade);
	
	public abstract Reminder visitProduct(ClassProductList cpl);

}
