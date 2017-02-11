import java.util.*;
/*import java.util.Random;
import java.util.Scanner;*/
class bubble{
	 int i,j,c,count=0,flag=0;
 int a[]=new  int [100000];
Random r=new Random();
Scanner sc=new Scanner(System.in);
void display(int n)
{
	for(i=0;i<n;i=i+1)
{
	System.out.print("\n" +a[i]);
}

}
void swap(int j)
{
             	c=a[j];
		       a[j]=a[j+1];
		       a[j+1]=c;
}
void sort(int n,int ch)
{
	if(ch==2)
	{
	for(i=0;i<n;i=i+1)
{
	a[i]=r.nextInt(10000)+5;
}
display(n);
	}
	 if(ch==1)
	{
		System.out.print("\nENTER ELEMENTS\n");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
for(i=0;i<n;i++)
{
	for(j=0;j<(n-i-1);j++)
	{
		count++;
		if(a[j]>a[j+1])
		{
			swap(j);		       
			  flag=1;
		}
		
	}
	if(flag==0)
		{
			break;
		}
}
System.out.print("AFTER  SORTING");
display(n);
System.out.print("\nTOTAL NO. OF PASSES\n"+count);
}
}
public class random7{
	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
bubble b=new bubble();
int n,ch=1;
while(ch!=3)
{
System.out.print("\n**SORTING**");
System.out.print("\n1.manual");
System.out.print("\n2.random");
System.out.print("\n3.exit\n");
ch=sc.nextInt();
switch(ch)
{
	case 1:System.out.print("\nENTER THE TOTAL NO. OF ELEMENTS\n");
	       n=sc.nextInt();
	       b.sort(n,ch);
	       break;
	case 2:System.out.print("\nENTER THE TOTAL NO. OF ELEMENTS\n");
	        n=sc.nextInt();
	       b.sort(n,ch);
	       break;
	case 3:break;       
	default:System.out.print("INVALID INPUT");             
}
}
}
}