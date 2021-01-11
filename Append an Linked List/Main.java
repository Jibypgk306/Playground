#include<stdio.h>
#include<stdlib.h>
#include<iostream>
using namespace std;
struct node
{
int data; 
struct node *link;
};
void display(struct node *temp)
{
  while(temp!=NULL)
  {
    cout<<temp->data<<endl;
    temp = temp->link;
  }
}
void append(struct node **,int);
int main()
{
  struct node *head;
  head = NULL;
  int data;
  do
  {
    cin>>data;
    if(data > 0)
      append(&head,data);
  }
  while(data>0);
  display(head);
  return 0;
}

void append(struct node **headadd,int data)
{
  struct node *temp;
  temp = *headadd;
  struct node *newnode= (struct node *) malloc(sizeof(struct node));
  newnode-> data = data;
  newnode-> link = NULL;
  if(*headadd== NULL)
    *headadd= newnode;
  else
  {
    while(temp->link != NULL)
    {
      temp = temp->link;
    }
    temp->link = newnode;
  } 
}