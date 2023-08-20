package vkpatil;
import java.util.*;
public class Stack2 {
	Scanner s=new Scanner(System.in);
	public void operation()
	{
		ArrayList<Integer>al=new ArrayList<>();
		do
		{
			System.out.println("1:PUSH ");
			System.out.println("2:POP element");
			System.out.println("3:pop element from specified index");
			System.out.println("4:Display");
			System.out.println("5:exit");
			System.out.println("enter your choice");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
				try
				{
				System.out.println("enter the element in stack");
				int e=s.nextInt();
				
				al.add(e);
				System.out.println("element added successfully");
				}
				catch(InputMismatchException e)
				{
					System.out.println(e);
					System.out.println("please select option from below and enter the numerical values");
					s.nextLine();
					
				}
				break;
			case 2:
				if(al.isEmpty())
				{
					System.out.println("stack is underflow");
				}
				else
				{
				    				
					int a=al.size();
					al.remove(a-1);
					System.out.println("element removed successfully...");
				}
				break;
			case 3:
				if(al.isEmpty())
				{
					System.out.println("stack is underflow");
				}
				else
				{
				    
					System.out.println("enter the value from the stack to delete it");
					int v=s.nextInt();
					int b=al.indexOf(v);
					if(b!=-1)
					{
						al.remove(b);
						System.out.println("element deleted");
					}
					else
					{
						System.out.println("value is not present on that index");
						
					}
				}
				break;
			case 4:
				int size=al.size();
				if(al.isEmpty())
				{
					System.out.println("stack is empty");
				}
				else
				{
					for(int i=size-1;i>=0;i--)
					{
						int obj=al.get(i);
						System.out.println(obj);
					}
				}
				break;
			case 5:
				dataStructure.main(null);
				System.exit(1);
				break;
			default:
				System.out.println("wrong choice");
			}
		}while(true);
	}
}
