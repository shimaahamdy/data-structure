
public class queuex {
	private int maxsize;
	private int items;
	private int []queueitems;
	private int front;
	private int rear;
	
	queuex(int siz)
	{
		maxsize=siz;
		queueitems = new int [maxsize];
		front=0;
		rear=-1;
		items=0;
	}
	public void insert(int j)
	{
		if(rear==maxsize-1)rear=-1;
		queueitems[++rear]=j;
		++items;
	}
	public int remove()
	{
		int x =queueitems[front++];
		if(front==maxsize)front =0;
		--items;
		return x;
		
	}
	public int peakfront()
	{
		return queueitems[front];
	}
	public boolean full()
	{
		return (items==maxsize) ;
	}
	public boolean empty()
	{
		return (items==0);
	}
	public int size()
	{
		return items;
	}

}
