package vkpatil;
import java.util.Scanner;
public class dataStructure {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("perform data structure operation\n");
		
		
		do
		{
			System.out.println("1:Stack Operation\n");
			System.out.println("2:queue operation\n");
			System.out.println("3:linked list operation\n");
			System.out.println("4:Tree operation\n");
			System.out.println("5:Graph operation\n");
			System.out.println("6:Array operation\n");
			System.out.println("enter your choice\n");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
				
					Stack2 st=new Stack2();
					st.operation();
					break;
			case 2:
					queue q=new queue();
					q.queueOperation();
				break;
			case 3:
				llinkList1 l=new llinkList1();
				l.singlyLLOperation();
				break;
			case 4:
				Trees tree=new Trees();
				tree.operations();
				break;
			case 5:
				break;
			case 6:
				Arrayimplement a=new Arrayimplement();
				a.arrayOperation();
				break;
			
				default:
					System.out.println("wrong choice\n");
			}
			
		}while(true);
		
	}

	

}
