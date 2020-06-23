import java.util.*;;

public class test {
	public static void main(String[] args) { 
		//doubledlinkedlist a= new doubledlinkedlist();
		
		/*a.insertfirst(15);
		a.insertfirst(20);
		a.insertlast(30);
		a.insertlast(40);
		a.deletelast();
		a.deletefirst();
		a.dispalyitemsforward();
		*/
		/*stackx x =new stackx(10);
		x.push(20);
		x.push(40);
		x.push(60);
		x.push(80);
		
		while(!x.empty())
		{
			System.out.print(x.pop()+" ");
		}
		*/
		/*String love="love";
		revers_word x=new revers_word(love);
		x.rev();*/
		/*linkstack x = new linkstack();
		x.push(50);
		x.push(60);
		x.push(80);
		x.dispalyItems();
		x.pop();
		x.pop();
		x.dispalyItems();
		x.pop();
		if(x.isEmpty())System.out.print("empty");
		
	/*	queuenoitem x=new queuenoitem(5);
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
		
		*/
	/*	PriorityQ x = new PriorityQ(10);
		x.insert(35);
		x.insert(40);
		x.insert(5);
		x.insert(100);
		x.insert(70);
		
		while(!x.isEmpty())
		{
			System.out.print(x.pop()+" ");
			
		}
		if(x.isFull())System.out.print("fall");
		else System.out.print("nope");
		
		*/
		/*LinkedList y = new LinkedList();
		y.addFirst("shimaa");
		y.addFirst("noe");
		y.addFirst("rr");
	    System.out.print(y);*/
		/*Stack s = new Stack();
		
		s.push("shimaa");
		s.push("x");
		s.pop();
		System.out.print(s);
		*/
		
		
		
		/*System.out.println(recursion.traingles(4));
		System.out.println(recursion.traingleRec(4));
		System.out.println(recursion.factorial(5));
		int a[]={1,2,3,4,5,6,7,8,9};
		System.out.println(recursion.sum(a, 5));
		/*recursion.reverseArray(a, 0, 8);
		for(int i=0;i<9;++i)
		System.out.print(a[i]+" ");*/
	    
		/*System.out.println();
		if(recursion.binarySearch(a, 4, 0, 8))System.out.println("YEs");
		
		System.out.println(recursion.binarySum(a,0,8));*/
		
		/*int a[]={5,7,-2,-3,0,9,11,15,20,4,4};
		//sorting.bubbleSort(a,11);
		//sorting.selectionSort(a, 11);
		//sorting.insertionsort(a, 11);
		sorting.mergSort(a, 11);
		sorting.print(a);*/
		
		
	/*	
	 * test heap
	 * heap heap1 = new heap(50);
		heap1.insert(-5);
		heap1.insert(70);
		heap1.insert(30);
		heap1.insert(-8);
		heap1.insert(40);
		heap1.displayHeap();
		heap1.insert(300);
		heap1.insert(500);
		heap1.insert(800);
		heap1.remove();
		heap1.remove();
		heap1.displayHeap();
		while(!heap1.isEmpty())
		{
			System.out.print(heap1.remove()+" ");
		}
		
		*/
	
		bstLinkedList x = new bstLinkedList();
		x.insert(50);
		x.insert(300);
		x.insert(70);
		x.insert(3);
		x.insert(5);
		x.insert(80);
		System.out.print(x.max()+"  "+x.min());
		
	}
	

}
