import java.util.*;
class node
{
	int data;
	node next;
}
public class link1
{
	public static void menu()
	{
	System.out.print("\n       **MENNU**");
	System.out.print("\n       (1).INSERT");
	System.out.print("\n       (2)DELETION");
	System.out.print("\n       (3).display");
	System.out.print("\n       (4).exit");
	System.out.print("\nEnter your choice");
	}
	public static void insert(int no,int i)
	{
	
					node temp=new node();
					temp.data=no;
					temp.next=null;
                     int i,j;
					 if(i==1)
					 {
						 temp.next=start;
						 start=temp;
						 n++;
					 }
					 else if(i>1 && i<=n+1)
					 {
						 for(np=start,j=1;j<i-1;j++,np=np.next)
                    {

                     }
                    temp.next=np.next;
                   np.next=temp;
				   n++;
					 }
                     
					 else{
						System.out.print("invalid input");
					}
public static void main(String args[])
{
	node start=new node();
	node p;
	node np;
	Scanner sc=new Scanner(System.in);
	int t=1;
	while(t==1)
	{
	System.out.print("\nFor linear list press l");
	System.out.print("\nFor circular list press c");
	System.out.print("\nFor exit e");
	char c='c';
	System.out.print("\nEnter your choice");
	c=sc.next().charAt(0);
	
	if(c=='l')
	{
		System.out.print("\nEnter the no.of terms");
		int  n=sc.nextInt();
		System.out.print("enter data");
					int no=sc.nextInt();
					start.data=no;
					start.next=null;
		for(int i=1;i<n;i++)
		{
					System.out.print("enter data");
					no=sc.nextInt();
					node temp=new node();
					temp.data=no;
					temp.next=null;
			         np=start;
					while(np.next!=null)
					{
						np=np.next;
					}
					np.next=temp;
		}
for(p=start;p!=null;p=p.next)
{
	System.out.print(p.data+"->");
}
menu();
		int ch;
		ch=sc.nextInt();
		while(ch!=4)
		{
		switch(ch)
		{
			case 1:
			System.out.print("enter data");
					no=sc.nextInt();
					 System.out.print("enter place");
					 i=sc.nextInt();
					insert(no,i);
					break;
			case 2:
					i=sc.nextInt();
					if(i>1 && i<=n)
					{
						for(np=start,j=1;j<i-1;j++,np=np.next)
                        {

                         }
                     p=np.next;
                     np.next=p.next;
					 p.next=null;
					 n--;
					}
					else if(i==1)
					{
						np=start;
						start=np.next;
						n--;
					}
					else{
						System.out.print("invalid input");
					}
                      
     
					break;
			case 3:	np=start;
			               if(start==null)
						   {
							   System.out.print("\nlist is  empty");
						   }
                 			while(np!=null)
				       {
					     System.out.print(np.data+"->");
					     np=np.next;
	                   }		

			             break;
			case 4:break;
			default:System.out.print("wrong  input");
			
		}
		menu();
		ch=sc.nextInt();
		}
	}
else if(c=='c')
{
	System.out.print("\nEnter the no.of terms");
		int  n=sc.nextInt();
		System.out.print("enter data");
					int no=sc.nextInt();
					start.data=no;
					start.next=start;
		for(int i=1;i<n;i++)
		{
				System.out.print("enter data");
					no=sc.nextInt();
					node temp=new node();
					temp.data=no;
					temp.next=null;	
					    np=start;
					while(np.next!=start)
					{
						np=np.next;
					}
					np.next=temp;
					temp.next=start;
		}
			menu();
			int ch;
		ch=sc.nextInt();
		while(ch!=4)
		{
		switch(ch)
		{
			case 1:System.out.print("enter data");
					no=sc.nextInt();
					node temp=new node();
					temp.data=no;
					temp.next=null;
                     int i,j;
					 System.out.print("enter place");
					 i=sc.nextInt();
					 if(i>1 && i<=n+1)
					 {
						  for(np=start,j=1;j<i-1;j++,np=np.next)
                    {

                     }
                    temp.next=np.next;
                   np.next=temp;
				   n++;
					 }
                    else if(i==1)
					{
						for(j=1,p=start;j<n;j++,p=p.next)
						{
							
						}
						temp.next=start;
						start=temp;
						p.next=start;
						n++;
					}
					else{
						System.out.print("invalid input");
					}
					break;
			case 2:
			       
					i=sc.nextInt();
					if(i>1 && i<=n)
					{
					for(np=start,j=1;j<i-1;j++,np=np.next)
                        {

                        }
                     p=np.next;
                     np.next=p.next;
                    n--;					 
					}
					else if(i==1)
					{
						np=start;
						start=np.next;
						for(j=1,p=start;j<n-1;j++,p=p.next)
						{
							
						}
						p.next=start;
					n--;	
					}
                      else{
						System.out.print("invalid input");
					}
					break;
			case 3:np=start;
			if(start==null)
			{
				System.out.print("list is empty");
			}
			while(np.next!=start)
			{
				System.out.print(np.data+"->");
				np=np.next;
			}
			System.out.print(np.data+"->");		

			             break;
			case 4:break;
			default:System.out.print("wrong  input");
			
		}
		menu();
		ch=sc.nextInt();
		}
	}
	else  if(c=='e')
	{
		break;
	}
else
{
	System.out.print("\ninvalid");
}
}
}
}