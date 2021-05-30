
public class Sort_kdll {
	static Node head;
	static class Node{
		int data;
		Node prev,next;
		Node(int d){
			data=d;next=prev=null;
		}
	}
	
	static void push(int data) {
		Node temp=new Node(data);
		temp.prev=null;
		temp.next=head;
		if(head !=null) {
			head.prev=temp;}
		head=temp;
	}
	
	 static void print(Node nod) {
		while(nod !=null) {
			System.out.print(nod.data + " ");
			nod=nod.next;
		}
		System.out.println();
	}
	
	static Node sort(Node head,int k) {
		if(head == null || head.next == null)
	        return head;
		
		for(Node i = head.next; i != null; i = i.next) {
	        Node j = i;
	        while(j.prev != null && j.data < j.prev.data) {
	        	Node temp = j.prev.prev;
	            Node temp2 = j.prev;
	            Node temp3 = j.next;
	            j.prev.next = temp3;
	            j.prev.prev = j;
	            j.prev = temp;
	            j.next = temp2;
	            if(temp != null)
	                temp.next = j;
	            if(temp3 != null)
	                temp3.prev = temp2;
	        }
	        
	        if(j.prev == null)
	            head = j;
	    }
	    return head;
	}	
	        
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(20);
		push(15);
		push(25);
		push(30);
		push(50);
		push(125);
		push(251);
		push(31);
		
		print(head);
		
		Node ll=sort(head,3);
		print(ll);
		
	}

}
