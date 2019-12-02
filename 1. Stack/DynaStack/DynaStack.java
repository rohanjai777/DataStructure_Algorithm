// Implementation of Stack using Dynamic Array
class Stack{
	static int capacity = 1;
	private int top;
	
	Stack(){
	top = -1;
	}
	
	int a[] = new int[capacity];
	
	boolean isEmpty(){
		if(top<0)
			return true;
		else
			return false;
	}
	
	void push(int n){
		if(getTop() == capacity-1){
			grow();
		}	
		a[++top] = n;
		System.out.println("Number "+"is pushed into the stack");
		
	}
	int pop(){
		int data;
		if(top < 0){
			System.out.println("Stack Underflow");
			data = 0;
		}
		else{
			data = a[top--];
			a[top+1] = 0;
			shrink();
		}
		return data;
	}
	
	int peek(){
		if(top < 0){
		System.out.println("Stack Underflow");
		return 0;
		}
		else
		return a[top];
	}
	
	int getTop(){
		return top;
	}
	
	void show(){
		for(int i = 0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	private void grow(){
		int [] arr = new int[capacity*2];
		capacity *=2;
		for(int i=0;i < a.length;i++){
			arr[i] = a[i];
		}
		a = arr;
	}
	
	void getCapacity(){
	    System.out.println(capacity);
	}
	
	private void shrink(){
		if((top+1)<((capacity/2)/2)){
			capacity = (capacity/2)/2;
			int arr[] = new int[capacity];
			for(int i=0;i<capacity;i++){
				arr[i] = a[i];
			}
			a = arr;
		}
	}
	
}

public class DynaStack {
	public static void main(String [] args){
	Stack stack = new Stack();
	System.out.println(stack.isEmpty());
	stack.push(10);
	stack.push(20);
	stack.show();
	System.out.println();
	stack.push(30);
	stack.push(40);
	stack.push(50);
	stack.show();
	System.out.println(stack.getTop());
	stack.pop();
	stack.pop();
	stack.pop();
	stack.show();
	stack.getCapacity();
	System.out.println(stack.getTop());
	stack.pop();
	stack.pop();
	stack.show();
	}
}