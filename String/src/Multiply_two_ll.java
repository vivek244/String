
public class Multiply_two_ll {
	
	static Node head;
	static class Node{
		int data;Node next;
		Node(int d){
			data=d;next =null;
		}
	} 
	
	static void push(Node nod,int data) {
		nod=new Node(data);
		nod.next=head;
		head=nod;
	}
	
	static void print(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node=node.next;
		}
		System.out.println();
	}
	
	static long mul(Node f,Node s) {
		int n1=0;int n2=0;
		long N = 1000000007;
		
		while(f!=null || s!=null) {
			if(f!=null) {
				n1=(int) ((n1*10)%N + f.data);
				f=f.next;
			}
			if(s!=null) {
				n2=(int) ((n2*10)%N + s.data);
				s=s.next;
			}
		}
		return n1*n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node f=new Node(9);
		f.next=new Node(6);
		f.next.next=new Node(5);
		push(f,10);
		print(f);
		
		Node s=new Node(3);
		s.next=new Node(1);
		s.next.next=new Node(7);
		print(s);
		
		System.out.print("Result is: ");
        System.out.println(mul(f, s));

	}

}
