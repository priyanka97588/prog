#include<stdio.h>
#include<stdlib.h>
struct node
{
  int n;
  struct node *next;
}*start,*p,*np,*prev;
ins_beg(struct node *p)
{
    np=start;
    p->next=start;
    start=p;
}
ins_end(struct node *p)
{
    for(np=start;np->next!=NULL;np=np->next)
  {

  }
  np->next=p;
}
ins_pos(struct node *p,int i)
{
    int j;
       for(np=start,j=1;j<i-1;j++,np=np->next)
       {

       }
       p->next=np->next;
       np->next=p;
}
del_beg()
{
    np=start;
    start=np->next;
    free(np);

}
del_end()
{
       for(np=start;np->next->next!=NULL;np=np->next)
       {

       }
       p=np->next;
       np->next=p->next;
       free(p);

}
del_pos(int i)
{
    int j;
       for(np=start,j=1;j<i-1;j++,np=np->next)
       {

       }
       p=np->next;
       np->next=p->next;
       free(p);

}
reverse()
{
    p=start;
    while(p!=NULL)
    {
        np=p->next;
        p->next=prev;
        prev=p;
        p=np;
    }
  start=prev;
}
rec_reverse(struct node *p)
{
    if(p==NULL)
    {
        return;
    }
    rec_reverse(p->next);
    printf("\n%d",p->n);

}
recc_reverse(struct node *p)
{
    if(p->next==NULL)
    {
        start=p;
        return;
    }
    recc_reverse(p->next);
    np=p->next;
    np->next=p;
    p->next=NULL;
}
int main()
{
   int i,ch=1;
   start=NULL;
    p=(struct node*)malloc(sizeof (struct node));
   printf("\nEnter a no.");
   scanf("%d",&p->n);
   p->next=NULL;
   start=p;
   while(ch==1)
   {
   printf("\nDO U WANT TO ADD  MORE 1/2");
   scanf("%d",&ch);
   if(ch==1)
   {
        p=(struct node*)malloc(sizeof (struct node));
       printf("\nEnter a no.");
       scanf("%d",&p->n);
        p->next=NULL;

       if(start==NULL)
        {
         start=p;
        }
       else
      {
       np=start;
      while(np->next!=NULL)
      {
          np=np->next;
      }
      np->next=p;
      }
   }
   }
   for(np=start;np!=NULL;np=np->next)
   {
       printf("%d\n",np->n);
   }

      /*p=(struct node*)malloc(sizeof (struct node));
       printf("\nEnter a no.");
       scanf("%d",&p->n);
       p->next=NULL;
       printf("\nEnter the position to be deleted");
       scanf("%d",&i);
       ins_pos(p,i);*/
       recc_reverse(start);
       for(np=start;np!=NULL;np=np->next)
   {
       printf("%d\n",np->n);
   }

   return 0;
}
