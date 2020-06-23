
public class PriorityQ {
	private int maxSize;
	private int[] qarr;
	private int items;
	
	public PriorityQ(int siz)
	{
		maxSize=siz;
		qarr = new int[maxSize];
		items=0;
	}
	
	public void insert(int x)
	{
		if(items==0)
			qarr[items++]=x;
		else
		{
			int j;
			for( j=items-1;j>=0;--j)
			{
				if(x>qarr[j])
					qarr[j+1]=qarr[j];
				else break;
			}
			qarr[j+1]=x;
			++items;
		}
		
	}
	public int pop()
	{
		return qarr[--items];
	}
	public int peek()
	{
		return qarr[items-1];
	}
	public boolean isEmpty()
	{
		return (items==0);
	}
	public boolean isFull()
	{
		return (items==maxSize);
	}
	
}
