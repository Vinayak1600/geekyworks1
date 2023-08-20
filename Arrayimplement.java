package vkpatil;
import java.util.Scanner;
class array1
{
	int a[];
	int x;
	
	public void insert(int a[])
	{
		this.a=a;
	}
	public void delete(int e)
	{
		int b[]=new int[a.length-1];
		x=e;
		int k=0;
		for(int i=x;i<a.length;i++)
		{
			
				a[i]=a[i+1];
			//b[k++]=a[i+1];
			
		}
		
	}
	public void display()
	{
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}

		
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.println(b[i]);
//		}
	}
}
public class Arrayimplement {
	Scanner s=new Scanner(System.in);
	public void arrayOperation()
	{
		System.out.println("enter the size of array");
		int size=s.nextInt();
		int a[]=new int[size];
		array1 arr =new array1();
		do
		{
			
			System.out.println("1:insert element in an array");
			System.out.println("2:delete array element");
			System.out.println("3::display array element");
			System.out.println("4:exit");
			System.out.println("Enter your choice");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the element");
				for(int i=0;i<a.length;i++)
				{
					a[i]=s.nextInt();
					System.out.println("Element inserted...");
				}
				
				arr.insert(a);
				break;
			case 2:
				System.out.println("Enter the index of array to delete");
				int e=s.nextInt();
				arr.delete(e);
				break;
			case 3:
				arr.display();
				break;
			case 4:
				dataStructure.main(null);
				System.exit(1);
				break;
				default:
					System.out.println("wrong choice");
			  }
		}
		   while(true);
	}
}
