#include <iostream>
#include <cstdlib>

using namespace std;
class doubledlinkedlist
{
private:
    struct  link
    {
        int value;
        link *next;
        link *previous;
    };
    typedef struct link *linkptr;
    linkptr first;
    linkptr last;
public:
    linkedlist()
    {
        first=NULL;
        last=NULL;
    }
    void insertfirst(int x)
    {
        linkptr a = new link();
        a->value=x;
        if(empty_is())last=a;
        else first->previous=a;
        a->next=first;
        a->previous=NULL;
        first=a;
    }
    void insertlast(int x)
    {
        linkptr a =new link();
        a->value=x;
        if(empty_is())first=a;
        else{
        a->previous=last;
        last->next=a;
        }
        a->next=NULL;
        last=a;
    }
    void inserafter(int x,int y)
    {
        linkptr current = findkey(x);
        if(current==last)insertlast(y);
		else if(current == NULL)  cout<<"no such item";
        else
        {
            linkptr a = new link();
            a->value=y;
            a->next=current->next;
            current->next->previous=a;
            current->next=a;
            a->previous=current;
            
        }
       
    }
    int deletefirst()
    {
        linkptr a = first;
        if(first->next==NULL)last=NULL;
        else first->next->previous=NULL;
        first=first->next;
        int x = a->value;
        delete a;
        return x;
    }
    int deletelast()
    {
        linkptr a = last;
        if(first->next==NULL)first=NULL;
        else last->previous->next=NULL;
        last=last->previous;
        int x = a->value;
        delete a;
        return x;
    }
    bool empty_is()
    {
        return (first==NULL);
    }
    void displayforward()
    {
        linkptr current = first;
        while(current!=NULL)
        {
            cout<<current->value<<" ";
            current=current->next;
        }
        cout<<endl;
        delete current;
    }
     void displaybackward()
	{
		linkptr current =last;
		while(current!=NULL)
		{
			cout<<current->value<<" ";
			current=current->previous;
		}
		cout<<endl;
		delete current;
	}
    linkptr findkey(int key)
    {
        linkptr current=first;
        while(current!=NULL)
        {
            if(current->value==key)return current;
            current=current->next;
        }
        delete current;
        return NULL;
    }
    void  deletekey(int key)
    {
        linkptr current = findkey(key);
        if(current==NULL)
        {cout<<"not founded";
        delete current;
        }
        else
        {
            if(current==first)first=current->next;
            else current->previous->next=current->next;
            if(current==last)last=current->previous;
            else current->next->previous=current->previous;
            delete current;
        }
    }
};
int main()
{
 doubledlinkedlist n;
 n.insertfirst(15);
 n.insertfirst(20);
 n.insertfirst(50);
 n.insertlast(29);
 n.insertlast(40);
 


 n.displayforward();
   return 0;
}
