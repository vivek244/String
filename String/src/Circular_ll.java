
public class Circular_ll {
	static Node head;
	static class Node {
		int data;Node next;
		Node(int d)
		{ data=d;next=null;}
	}
	
	static boolean circle(Node head) {
		if(head== null) return true;
		Node nod=head.next;
		while(nod!=null && nod !=head) {
			nod=nod.next;
			
		}
		return (nod==head);
	}
	
	static void push(int data) {
		Node ll=new Node(data);
		ll.next=head;
		head=ll;
		
	}
	
	static void print(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node=node.next;
		}
		System.out.println();
	}
//	
//	static Node delete(Node head,int key) {
//		if(head==null) return null;
//		Node curr=head,prev = neww(head,key);
//		while(curr.data !=key) {
//			if(curr.next==head) {
//				System.out.println("Node not found");
//				break;
//			}
//			prev=curr;
//			curr=curr.next;
//		}
//	}
//	
	
	static Node neww(Node head,int data) {
		Node temp=new Node(data);
		temp.data= data;
		temp.next=null;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(20);
        push(41);
        push(15);
        push(36);
        push(40);
        push(48);
        push(20);
		
		print(head);
		System.out.println(circle(head));

	}

}
