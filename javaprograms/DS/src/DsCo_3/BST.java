package DsCo_3;
import java.util.*;
public class BST
{
	BST root = null, left, right, ptr, pre, ptr1, pre1;
	int n;
	public void insert()
	{
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value");
		BST newnode=new BST();
		x = s.nextInt();
		newnode.n = x;
		newnode.left = null;
		newnode.right = null;

			if(root==null)
			{
				root=newnode;
			}
			else
			{
				ptr=root;
				while(ptr!=null)
				{
					pre=ptr;
					if(x<ptr.n)
					{
						ptr=ptr.left;
					}
					else
					{
						ptr=ptr.right;
					}
				}
				if(x<pre.n)
				{
					pre.left=newnode;
				}
				else
				{
					pre.right=newnode;
				}
			}

		}
		public void search()
		{
			int x;
			int count=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter value");
			x=s.nextInt();

			ptr=root;
			while(ptr!=null)
			{
				if(x<ptr.n)
				{
					ptr=ptr.left;
				}
				else if(x<ptr.n)
				{
					ptr=ptr.right;
				}
				else
				{
					count++;
					break;
				}
			}

		}
		public void maximum()
		{
			ptr=root;
			while(ptr.right!=null)
			{
				ptr=ptr.right;
			}
			System.out.println(ptr.n);
		}
		public void minium()
		{
			ptr=root;
			while(ptr.left!=null)
			{
				ptr=ptr.left;
			}
			System.out.println(ptr.n);
		}
		public void preorder(BST root)
		{
			if(root!=null)
			{
				System.out.println(root.n);
				preorder(root.left);
				preorder(root.right);
			}
		}
		public void inorder(BST root)
		{
			if(root!=null)
			{
				inorder(root.left);
				System.out.println(root.n);
				inorder(root.right);
			}
		}
		public void postorder(BST root)
		{
			if(root!=null)
			{
				postorder(root.left);
				postorder(root.right);
				System.out.println(root.n);
			}
		}
		public void deletion()
		{
			int x;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter value");
			x=s.nextInt();

			ptr=root;
			while(ptr.n!=x)
			{
				pre=ptr;
				if(x<ptr.n)
				{
					ptr=ptr.left;
				}
				else
				{
					ptr=ptr.right;
				}
			}

			if(ptr.left==null && ptr.right==null)
			{
				if(ptr==pre.right)
				{
					pre.right=null;
					ptr=null;
				}
			}
			else if(ptr.left!=null && ptr.right==null)
			{
				if(ptr==pre.left)
				{
					pre.left=ptr.left;
					ptr=null;
				}
				else
				{
					pre.right=ptr.left;
					ptr=null;
				}
			}
			else if(ptr.left==null && ptr.right!=null)
			{
				if(ptr==pre.left)
				{
					pre.left=ptr.right;
					ptr=null;
				}
				else
				{
					pre.right=ptr.right;
					ptr=null;
				}
			}
			else
			{
				ptr1=ptr.left;
				while(ptr1.right!=null)
				{
					pre1=ptr1;
					ptr1=ptr1.right;
				}
				ptr.n=ptr1.n;
				pre1.right=ptr.right;
				ptr1=null;

			}
	}
	public static void main(String[] args)
	{
		BST n=new BST();
		Scanner s=new Scanner(System.in);

		while(true)
		{
		  System.out.println("1. Create newnode");
	      System.out.println("2. Search");
	      System.out.println("3. Find Biggest value");
	      System.out.println("4. Find Least value");
	      System.out.println("5. inOrder");
	      System.out.println("6. PreOrder");
	      System.out.println("7. PostOrder");
	      System.out.println("8. Deletion");
	      System.out.print("Enter your option: ");

	      int ch=s.nextInt();
	      switch(ch)
	      {
	      case 1: n.insert();
	      break;
	      case 2: n.search();
	      break;
	      case 3: n.maximum();
	      break;
	      case 4: n.minium();
          break;
	      case 5: n.inorder(n);
	      break;
	      case 6: n.preorder(n);
	      break;
	      case 7: n.postorder(n);
	      break;
	      case 8: n.deletion();
	      break;
	      }
	      System.out.println("\n");
	    }
	  }
}
