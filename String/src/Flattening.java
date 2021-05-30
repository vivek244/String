import java.util.LinkedList;

public class Flattening {
	static Node head;
	static class Node{
		int data;
		Node rigth;
		Node down;
		Node(int d){
			data=d;rigth=null; down=null;
		}
	}
	
	static Node merge(Node a,Node b) {
		if(a ==null) return b;
		if(b==null )return a;
		Node res;
		
		if(a.data<b.data) {
			res=a;
			res.down=merge(a.down,b);
		}
		else {
			res=b;
			res.down=merge(a,b.down);
		}
		res.rigth=null;
		return res;
	}
	
	static Node flat(Node root) {
		if(root==null || root.rigth==null) return root;
		root.rigth=flat(root.rigth);
		root=merge(root,root.rigth);
		return root;
	}
	
	void push(int data) {
		Node temp=new Node(data);
		temp.down=head;
		head=temp;
	}
	
	static void print(Node nod) {
		nod=head;
		while(nod !=null) {
			System.out.print(nod.data + " ");
			nod=nod.down;
			}
//			if(nod ==null) 
//				 nod=nod.rigth;
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList L = new LinkedList();
		
		head=new Node(10);
		head.down=new Node(15);
		head.down.down=new Node(5);
		head.down.down.down=new Node(36);
		
		head.rigth=new Node(48);
		head.rigth.down=new Node(30);
		head.rigth.down.down=new Node(25);
		
		head.rigth.rigth=new Node(20);
		head.rigth.rigth.down=new Node(70);
		
		print(head);
		
		head=flat(head);
		print(head);

	}

}
