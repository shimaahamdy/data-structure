
public class revers_word {
	private String in;
	private String out;
	
	public revers_word (String x)
	{
		in=x;
	}
	public void rev()
	{
		stackc x=new stackc(in.length());
		for(int i=0;i<in.length();++i)
		{
			x.push(in.charAt(i));
		}
		
		while(!x.empty())
		{
			System.out.print(x.pop());
		}
		
	}

}
