
public class linklist {
	private link first;
	private link last;
	
	public void insertfirst(int x)
	{
		link a=new link(x);
		if(empty())last=a;
		a.setnext(first);
		first=a;
	}
	public void insertlast(int x)
	{
		link a = new link(x);
		if(empty())first=a;
		last.setnext(a);
		last=a;
	}
	public int deletefirst()
	{
		int x=first.getvalue();
		if(first.getnext()==null)
		{
			last=null;
		}
		first=first.getnext();
		
		return x;
		
	}
	
	public boolean empty()
	{
		return first==null;
	}
	public void dispalyitems()
	{
		link current =first;
		while(current!=null)
		{
			System.out.print(current.getvalue()+" ");
			current=current.getnext();
		}
		System.out.println();
	}
	public link find(int key)
	{
		link current = first;
		while(current!=null)
		{
			if(current.getvalue()==key)return current;
			current=current.getnext();
		}
		return null;
	}
	public boolean deletekey(int key)
	{
		link current =first;
		link past=first;
		while(current!=null)
		{
			if(current.getvalue()==key && current!=first)
			{
				past.setnext(current.getnext());
				return true;
			}
			else if(current.getvalue()==key && current==first)
			{
				first=first.getnext();
				return true;
			}
			else
			{
				past=current;
				current=current.getnext();
			}
		}
		return false;
	}

}
