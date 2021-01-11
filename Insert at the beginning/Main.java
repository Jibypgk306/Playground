#include <iostream>
#include <stdlib.h>
using namespace std;
struct node {
   int data;
   struct node *next;
};

struct node *head = NULL;
struct node *current = NULL;

void reverse_print(struct node *list) {
   if(list == NULL) {
      return;
   }
   reverse_print(list->next);
  if((list->data) > 0)
  {
   cout<<(list->data);
   cout<<endl;
  }
}

void insert(int data) {
   struct node *link = (struct node*) malloc(sizeof(struct node));

   link->data = data;
   link->next = NULL;
   if(head==NULL) {
      head = link;
      return;
   }

   current = head;
   while(current->next!=NULL)
      current = current->next;

   current->next = link;
}
int main() {
  int data;
 while(!cin.eof())
 {
   cin>>data;
   insert(data);
 }
   reverse_print(head);
   return 0;
}
