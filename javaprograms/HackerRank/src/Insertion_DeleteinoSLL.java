import java.util.*;
class node {
	node ptr, start=null, next, pre;
	int nivedhathomas;
	public void create() {
		node newnode=new node();
		Scanner s=new Scanner(System.in);
		newnode.nivedhathomas=s.nextInt();
		if(start==null) {
			start=newnode;
			start.next=null;
		}
		else {
			ptr=start;
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
			ptr.next=newnode;
			ptr.next.next=null;
		}
	}
	public void deleteatpos() {
		int count=0;
		Scanner s=new Scanner(System.in);
		int pos=s.nextInt();
		ptr=start;
		while(ptr!=null) {
			count++;
			pre=ptr;
			ptr=ptr.next;
			if(count==(pos-1)) {
				pre.next=ptr.next;
				break;
			}
		}
	}
	public void display() {
		ptr=start;
		while(ptr!=null) {
			System.out.print(ptr.nivedhathomas+" ");
			ptr=ptr.next;
		}
	}
}
public class Insertion_DeleteinoSLL {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int noofnodes=s.nextInt();
		node obj=new node();
		for(int i=1; i<=noofnodes; i++) {
			obj.create();
		}
		obj.deleteatpos();
		obj.display();
	}
}
