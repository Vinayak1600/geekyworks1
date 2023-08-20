package vkpatil;
import java.util.Scanner;
public class Trees {
	static class Node
	{
		int value;
		Node left,right;
		
		Node(int value)
		{
			this.value=value;
			left=null;
			right=null;
		}
	}
	public void insertNode(Node node,int value)
	{
		if(value<node.value)
		{
			if(node.left!=null)
			{
				insertNode(node.left,value);
			}
			else
			{
				System.out.println("inserted "+value+" to left of node "+node.value);
				node.left=new Node(value);
			}
		}
		else if(value>node.value)
		{
			if(node.right!=null)
			{
				insertNode(node.right,value);
			}
			else
			{
				System.out.println("inserted "+value+" to right of node "+node.value);
				node.right=new Node(value);
			}
		}
	}
	public void traverseInOrder(Node node)
	{
		if(node!=null)
		{
			traverseInOrder(node.left);
			System.out.println(" "+node.value);
			traverseInOrder(node.right);
		}
	}
	public void traversePreOrder(Node node)
	{
		if(node!=null)
		{
			System.out.println(" "+node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}
	public void traversePostOrder(Node node)
	{
		if(node!=null)
		{
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.println(" "+node.value);
		}
	}
	public void levelOrderTraversal(Node node)
	{
		int h=height(node);
		int i;
		for(i=1;i<=h;i++)
		{
			currentLevel(node,i);
		}
	}
	public int height(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		else
		{
			int lh=height(node.left);
			int rh=height(node.right);
			if(lh>rh)
			{
				return(lh+1);
			}
			else
			{
				return(rh+1);
			}
				
		}
	}
	public void currentLevel(Node node,int level)
	{
		if(node==null)
		{
			return;
		}
		if(level==1)
		{
			System.out.println(node.value+" ");
		}
		else if(level>1)
		{
			currentLevel(node.left,level-1);
			currentLevel(node.right,level-1);
		}
	}

	public void operations()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("binary tree example");
		Trees t=new Trees();
		System.out.println("enter the root node value");
		int d=s.nextInt();
		Node root=new Node(d);
		do {
			System.out.println("1.enter values in a tree");
			System.out.println("2.display nodes");
			System.out.println("3.display in pre-order");
			System.out.println("4.display in post-order");
			System.out.println("5:display level order tree");
			System.out.println("6:exit");
			System.out.println("enter your choice");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter the value");
				int v1=s.nextInt();
				t.insertNode(root, v1);
				break;
			case 2:
				System.out.println("displying tree in in-order");
				t.traverseInOrder(root); 
				break;
			case 3:
				System.out.println("displyaing tree in pre-order");
				t.traversePreOrder(root);
				
				break;
			case 4:
				System.out.println("displaying tree in post-order");
				t.traversePostOrder(root);
				break;
			case 5:
				System.out.println("displaying level-order traversal tree");
				t.levelOrderTraversal(root);
			case 6:
				dataStructure.main(null);
				System.exit(1);
				default:
					System.out.println("please enter correct choice");
			}
		}while(true);
		
		
	}

}
