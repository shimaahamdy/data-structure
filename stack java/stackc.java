
public class stackc {

	private  int maxsize;
	private int top;
	private char []stackarray;
	
	public stackc(int siz)
	{
		maxsize=siz;
		top=-1;
		stackarray = new char[maxsize];
	}
	public void push(char x)
	{
		stackarray[++top]=x;
	}
	
	public char pop()
	{
		return(stackarray[top--]);
	}
	public char peak()
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
