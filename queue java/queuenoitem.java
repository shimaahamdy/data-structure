
public class queuenoitem {


	private int maxsize;
	private int []queueitems;
	private int front;
	private int rear;
	
	queuenoitem(int siz)
	{
		maxsize=siz+1;
		queueitems = new int [maxsize];
		front=0;
		rear=-1;
		
	}
	public void insert(int j)
	{
		if(rear==maxsize-1)rear=-1;
		queueitems[++rear]=j;
		
	}
	public int remove()
	{
		int x =queueitems[front++];
		if(front==maxsize)front =0;
	
		return x;
		
	}
	public int peakfront()
	{
		return queueitems[front];
	}
	public boolean full()
	{
		return (rear+2==front || front+maxsize-1==rear) ;
	}
	public boolean empty()
	{
		return (rear+1==front || front+(maxsize-1)==rear);
	}
	public int size()
	{
	    if(rear>=front)return rear-front+1;
	    else return (maxsize-front)+(rear+1);
	}



}
