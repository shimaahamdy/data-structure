
public class heap {
 private int heaparr[];
 private int maxsize;
 private int currentSize;
 
 public heap(int maxsize)
 {
	 this.maxsize=maxsize;
	 heaparr = new int[maxsize];
	 currentSize=0;
 }
 public boolean isEmpty()
 {
	 return (currentSize==0);
 }
 public boolean insert(int val)
 {
	 if(currentSize==maxsize)return false;
	 heaparr[currentSize]=val;
	 trickleUp(currentSize++);
	 return true;
	 
 }
 public void trickleUp (int index)
 {
	 int bottom=heaparr[index];
	 int parent=(index-1)/2;
	 
	 while(index>0 && bottom>heaparr[parent])
	 {
		 heaparr[index]=heaparr[parent];
		 
		 index=parent;
		 parent = (parent-1)/2;
		 
	 }
	 heaparr[index]=bottom;
	 
 }
 public int remove()
 {
	 if(currentSize==0)
		 {
		    System.out.print("list is empty");
		    return -1;
		 }
	 int maxNode=heaparr[0];
	 heaparr[0]=heaparr[--currentSize];
	 trickleDown(0);
	 return maxNode;
	 
}
 public void trickleDown(int index)
 {
	 int largerChild;
	 int top=heaparr[index];
	 while(index<(currentSize/2))
	 {
		 int leftChild=(index)*2+1;
		 int righChild=(index)*2+2;
		 if(righChild<currentSize && heaparr[righChild]>heaparr[leftChild])
			 largerChild=righChild;
		 else largerChild=leftChild;
		 
		 if(top>=heaparr[largerChild])break;
		 heaparr[index]=heaparr[largerChild];
		 index=largerChild;
	 }
	 heaparr[index]=top;
 }
 public void displayHeap()
 {
	 for(int i=0;i<currentSize;++i)
		 System.out.print(heaparr[i]+"\n");
 }
 
 
}
