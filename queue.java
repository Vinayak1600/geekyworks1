package vkpatil;
import java.util.Scanner;
public class queue {
	Scanner s=new Scanner(System.in);
	int rear=-1;
	int front=-1,t=0;
	
	public void queueOperation()
	{
		System.out.println("how many element do you want to store in queue\n");
		int size=s.nextInt();
		int []qarr=new int[size];
		do
		{
			System.out.println("1:add element in queue or enqueue\n");
			System.out.println("2:delete element in queue or dequeue\n");
			System.out.println("3:display element in queue\n");
			System.out.println("enter your choice\n");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
				if(rear==size-1)
				{
					System.out.println("queue is overflow\n");
				}
				else
				{
					for(int i=0;i<size;i++)
					{
						rear=rear+1;
						System.out.println("enter the element in queue\n");
						qarr[rear]=s.nextInt();
						System.out.println("element added....");
					}
				}
				break;
			case 2:
				
				if(front==rear)
				{
					System.out.println("queue is underflow");
				}
				else
				{
					t++;
					int x=front;
					front=front+1;
					
					
					int value=qarr[front];
					System.out.println("deleted element-->"+value);
					for(int i=0;i<=rear;i++)//loop for rear pointer
					{
						if(front!=rear)
						{
							qarr[front]=qarr[front+1];//value shifting because after this we add value in it
							
						}
						
						else
						{
							break;
						}
						front++;
					}
					rear=rear-1;
					size=t;// size will be update to run case 1 again.
					front=x;//assign original value of front like front=0 initially.
				}
				
				break;
			case 3:
				if(rear==-1)
				{
					System.out.println("underflow\n");
				}
				else
				{
					for(int i=front;i<=rear-1;i++)
					{
						System.out.println("queue element---->"+qarr[front]);
						front++;
					}
				}
				break;
			case 4:
				dataStructure.main(null);
				System.exit(1);
				default:
					System.out.println("wrong choice enter choice again\n");
			}
		}while(true);
		
	}
	

}
