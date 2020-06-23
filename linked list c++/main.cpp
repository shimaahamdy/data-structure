#include <iostream>
#include <cstdlib>

using namespace std;
class linkedlist
{
private:
    struct  link
    {
        int value;
        link *next;
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
        a->next=first;
        first=a;
    }
    void insertlast(int x)
    {
        linkptr a =new link();
        a->value=x;
        if(empty_is())first=a;
        last->next=a;
        last=a;
    }
    int deletefirst()
    {
        linkptr a = first;
        if(first->next==NULL)last=NULL;
        first=first->next;
        int x = a->value;
        delete a;
        return x;
    }
    bool empty_is()
    {
        return (first==NULL);
    }
    void displayitems()
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
    bool deletekey(int key)
    {
        linkptr current = first;
        linkptr past = first;
        while(current!=NULL)
        {
            if(current->value==key && current!=first)
            {
                past->next=current->next;
                delete current;
                delete past;
                return true;
            }
            else if(current->value==key && current==first)
            {
                first=first->next;
                delete current;
                delete past;
                return true;
            }
            else{
                past=current;
                current=current->next;
            }

        }
        delete current;
        delete past;
        return false;
    }
};


int main()
{

     linkedlist n;
     n.insertfirst(15);
     n.insertfirst(20);
     n.insertfirst(30);
     if(n.findkey(17)==NULL)cout<<"founded";
     return 0;
}
