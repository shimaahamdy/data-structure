
public class node {
	private int value;
	private node rightChild;
	private node leftChild;
	
	public void setValue(int value)
	{
		this.value=value;
		
	}
	
	public void setRightChild(node child)
	{
		rightChild=child;
		
	}
	public void setLeftChild(node child)
	{
		leftChild=child;
	}
	public int getValue(){
	   return value;
	}
	public node getRightChild()
	{
		return rightChild;
	}
	public node getLeftChild()
	{
		return leftChild;
	}
	
	

}
