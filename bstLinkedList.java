
public class bstLinkedList {
	
	private node root;
	
	public boolean find(int key)
	{
		node current=root;
		while(current.getValue()!=key)
		{
			if(key>current.getValue())
				current=current.getRightChild();
			else
				current=current.getLeftChild();
			if(current==null)return false;
		}
		return true;
	}
	
	public void insert(int value)
	{
		node newChild= new node();
		newChild.setValue(value);
		
		if(root==null)
			root=newChild;
		else
		{
			node current=root;
			node parent;
			
			while(true)
			{
				parent=current;
				if(value<current.getValue())
				{
					current=current.getLeftChild();
				if(current==null)
				{
					parent.setLeftChild(newChild);
				    return;
				}
				}
				else
				{
					current=current.getRightChild();
					if(current==null)
						{
						parent.setRightChild(newChild);
						return;
						}
				}
				
			}
		}
	}
	
	public void inOrder(node child)
	{
		while(child!=null)
		{
			inOrder(child.getLeftChild());  //left
			System.out.print(child+" ");    //node
			inOrder(child.getRightChild()); //right
		}
	}
	public void preOrder(node child)
	{
		while(child!=null)
		{
			System.out.print(child+" ");    //node
			inOrder(child.getLeftChild());  //left
			inOrder(child.getRightChild()); //right
		}
	}
	
	public void postOrder(node child)
	{
		while(child!=null)
		{
			inOrder(child.getLeftChild());  //left
			inOrder(child.getRightChild()); //right
			System.out.print(child+" ");    //node
			
		}
	}
	public int min()
	{
		node current =root;
		node last=root;
		while(current!=null)
		{
			last=current;
			current=current.getLeftChild();
		}
		return last.getValue();
	}
	
	public int max()
	{
		node current =root;
		node last=root;
		while(current!=null)
		{
			last=current;
			current=current.getRightChild();
		}
		return last.getValue();
	}
	public int maxDepth(node child)
	{
		if(child==null)return -1;
		int leftDepth=maxDepth(child.getLeftChild());
		int rightDepth=maxDepth(child.getRightChild());
		return Math.max(leftDepth,rightDepth)+1;
	}
	
	public boolean delete(int key)
	{
		node current=root;
		node parent=root;
		boolean isLeftChild=false;
		while(current.getValue()!=key)
		{
			parent=current;
			if(key<current.getValue())
			{
				isLeftChild=true;
				current=current.getLeftChild();
			}
			else
			{
				isLeftChild=false;
				current=current.getRightChild();
			}
			if(current==null)return false;	
		}
		if(current.getRightChild()==null && current.getLeftChild()==null)
		{
			if(current==root)
				root=null;
			else if(isLeftChild)
				parent.setLeftChild(null);
			else parent.setRightChild(null);
		}
		else if(current.getRightChild()==null)
			if(current==root)
				root=current.getLeftChild();
			else if(isLeftChild)
				parent.setLeftChild(current.getLeftChild());
			else parent.setRightChild(current.getLeftChild());
		else if(current.getLeftChild()==null)
			if(current==root)
				root=current.getRightChild();
			else if(isLeftChild)
				parent.setLeftChild(current.getRightChild());
			else parent.setRightChild(current.getRightChild());
		
		
		
	}
	
}
