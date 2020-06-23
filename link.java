
public class link {
	private int value;
	private link next;
	private link previous;
	
	public link(int x)
	{
		value=x;
	}
	public int getvalue()
	{
		return value;
	}
	public link getprevious()
	{
		return previous;
	}
	public void setprevious(link a)
	{
		previous=a;
	}
	public link getnext()
	{
		return next;
	}
	public void setnext(link a)
	{
		next=a;
	}

}
