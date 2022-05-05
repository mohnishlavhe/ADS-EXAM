class Stack{
	
	private int arr[];
	private int max;
	private int top;
	
	Stack(int s){
		top = -1;
		max = s;
		arr = new int[max];
	}
	public boolean isFull(){
		return (top >= (max - 1));
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	public void push(int x){
		arr[top++] = x;
	}
	
	public int pop(){
		return arr[top--];
	}
	void display(){
		for(int i=0; i<=top; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args){
		Stack o = new Stack(2);
		Stack ob = new Stack(4);
		o.push(5);
		ob.push(10);
		ob.push(15);
		o.push(11);
		ob.push(7);
		ob.push(40);
		o.display();
		ob.display();
		o.pop(11);
		ob.pop(40);
		o.display();
		ob.display();
	}
}