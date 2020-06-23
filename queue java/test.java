
public class test {
	public static void main(String[] args) { 
	queuenoitem x=new queuenoitem(5);
	x.insert(10);
	x.insert(20);
	x.insert(30);
	
	
	System.out.print(x.remove()+" "+x.remove());
	
	x.insert(20);
	x.insert(15);
	x.insert(60);
	
	
	System.out.println();
	System.out.println(x.size());
	
	while(!x.empty())
	{
		System.out.print(x.remove()+" ");
	}
	System.out.println();
	
	if(x.full())System.out.println("fullly");
	else System.out.println("not fullly");
	
	
	
	System.out.println(x.size());
	}
}
