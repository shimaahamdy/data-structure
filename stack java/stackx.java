
public class stackx {
	private  int maxsize;
	private int top;
	private int []stackarray;
	
	stackx(int siz)
	{
		maxsize=siz;
		top=-1;
		stackarray = new int[maxsize];
	}
	public void push(int x)
	{
		stackarray[++top]=x;
	}
	
	public int pop()
	{
		return(stackarray[top--]);
	}
	public int peak()
	{
		return stackarray[top];
	}
	public boolean empty()
	{
		return (top==-1);
	}
	public  boolean isfull()
	{
		return (top==maxsize-1);
	}

}
