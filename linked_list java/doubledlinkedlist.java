
public class doubledlinkedlist {
	private link first;
	private link last;
	
	public void insertfirst(int x)
	{
		link a=new link(x);
		if(empty())last=a;
		else first.setprevious(a);
		a.setnext(first);
		first=a;
		
	}
	public void insertlast(int x)
	{
		link a = new link(x);
		if(empty())first=a;
		else{
		a.setprevious(last);
		last.setnext(a);
		}
		last=a;
	}
	public void insertafter(int x,int y)
	{
		link current = find(x);
		if(current==last)insertlast(y);
		else if(current == null )System.out.print("not founded");
		else
		{
			link a = new link(y);
			a.setnext(current.getnext());
			current.getnext().setprevious(a);
			current.setnext(a);
			a.setprevious(current);
		}
	}
	public void deletekey(int x)
	{
		link current = find(x);
		if(current==null)System.out.print("not fonded");
		else
		{
	    if(current==first)first=current.getnext();
	    else current.getprevious().setnext(current.getnext());
	    if(current==last)last=current.getprevious();
	    else current.getnext().setprevious(current.getprevious());
	}
	}
	public int deletefirst()
	{
		int x=first.getvalue();
		if(first.getnext()==null)
		{
			last=null;
		}
		else first.getnext().setprevious(null);
		first=first.getnext();
		
		return x;
		
	}
	public int deletelast()
	{
		int x=last.getvalue();
		if(first.getnext()==null)
		{
			first=null;
		}
		else last.getprevious().setnext(null);
		last=last.getprevious();
		
		return x;
	}
	public boolean empty()
	{
		return first==null;
	}
	public void dispalyitemsforward()
	{
		link current =first;
		while(current!=null)
		{
			System.out.print(current.getvalue()+" ");
			current=current.getnext();
		}
		System.out.println();
	}
	public void dispalyitemsbackward()
	{
		link current =last;
		while(current!=null)
		{
			System.out.print(current.getvalue()+" ");
			current=current.getprevious();
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
	


}
