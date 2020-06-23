
public class linkstack {
	private linklist stacklist;

	public linkstack()
	{
		stacklist=new linklist();
	}

	public void push(int x)
	{
		stacklist.insertfirst(x);
	}
	public int pop()
	{
		return stacklist.deletefirst();
	}
	public boolean isEmpty()
	{
		return stacklist.empty();
	}
	public void dispalyItems()
	{
		stacklist.dispalyitems();
	}
}
