
public class Reverse_dll {
	static Node head;
	static class Node {
		int data;
		Node prev,next;
		
		Node(int d){
			data=d;
			prev=next=null;
		}
	}
	
	static void reverse() {
		Node temp=null;
		Node curr=head;
		while(curr!=null) {
			temp=curr.prev;
			curr.prev=curr.next;
			curr.next=temp;
			curr=curr.prev;
		}
		 if (temp != null) {
	            head = temp.prev;
	        }
	}
	
	static void pair(Node head,int x) {
		Node f=head;
		Node s=head;
		while(s.next!=null)
			s=s.next;
		boolean found=false;
		
		while(f!=s && s.next !=f) {
			if((f.data + s.data) ==x) {
				found=true;
				System.out.println("(" + f.data + ","+ s.data + ")" );
				f=f.next;
				s=s.prev;
			}
			else {
				if((f.data + s.data) <x) 
					f=f.next;
				else s=s.prev;    
			}
		}
		if(found==false)
			System.out.println("No pass found");
	}
	
	
	static void print(Node hh) {
		while(hh !=null) {
			System.out.print(hh.data + " ");
			hh=hh.next;
		}
		System.out.println();
	}
	
	static void push(int data) {
		Node temp=new Node(data);
		temp.prev=null;
		temp.next=head;
		if(head!=null) {
			head.prev=temp;
		}
		head=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(20);
		push(15);
		push(25);
		push(30);
		print(head);
		
		reverse();
		print(head);
		int x=45;
		pair(head,45);

	}

}
