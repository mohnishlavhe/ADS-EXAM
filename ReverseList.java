class ReverseList{
	Node head;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		Node n = head;
		new_node.next = null;
		if(head == null){
			new_node.prev = null;
			head = new_node;
			return;
		}
		while(n.next != null){
			n = n.next;
		}
		n.next = new_node;
		new_node.prev = n;
	}
	
	void display(Node n){
		Node p = null;
		System.out.println("forward direction : ");
		while(n != null){
			System.out.print(n.data+" ");
			p = n;
			n = n.next;
		}
		System.out.println();
		System.out.println("reverse direction : ");
		while(p != null){
			System.out.print(p.data+" ");
			p = p.prev;
		}
	}
	
	public static void main(String[] args){
		ReverseList ob = new ReverseList();
		/*ob.insert(1);
		ob.insert(2);
		ob.insert(3);
		ob.insert(4);
		ob.insert(5);  */
		ob.insert(3);
		ob.insert(4);
		ob.insert(2);
		ob.insert(5);
		ob.display(ob.head);
	}
}