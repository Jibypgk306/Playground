#include<iostream> 
using namespace std; 
struct Node 
{ 
int value; 
struct Node* next; 
}; 
void ntol(struct Node *start, int n) 
{ 
struct Node *main_ptr = start; 
struct Node *ref_ptr = start; 
int count = 0; 
if(start != NULL) 
{ 
	while( count < n ) 
	{ 
		if(ref_ptr == NULL) 
		{ 
	 cout<<"There is no nth node in the list";
		return; 
		} 
		ref_ptr = ref_ptr->next; 
		count++; 
	} 

	while(ref_ptr != NULL) 
	{ 
		main_ptr = main_ptr->next; 
		ref_ptr = ref_ptr->next; 
	} 
cout<<main_ptr->value<<" is the nth node element in the list";
} 
} 

void push(struct Node** startadd, int value) 
{ 
struct Node *temp,*newnode;
    temp=*startadd;
    newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->value=value;
    newnode->next=NULL;
    if(*startadd==NULL)
      *startadd=newnode;
    else{
      while(temp->next!=NULL)
      {
        temp=temp->next;  
       }
      temp->next=newnode;
}
} 
int main() 
{ 
struct Node* start = NULL; 
int value,n;
do
  {    
    cin>>value;
    if(value>0)
      push(&start,value);
   }while(value>0);
  cout<<"Enter the nth node: "<<endl;
  cin>>n;
   ntol(start, n); 
} 