// Implementation of Stack using Array
class Stack{
	static final int capacity = 100;
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
		if(top >= capacity-1){
		System.out.println("Stack Overflow");}
		else{	
		a[++top] = n;
		System.out.println("Number "+"is pushed into the stack");
		}
	}
	int pop(){
		if(top < 0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			return a[top--];
		}
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
	
}

public class ArrayStack {
	public static void main(String [] args){
	Stack stack = new Stack();
	System.out.println(stack.isEmpty());
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.show();
	stack.getTop();
	System.out.println(stack.pop());
	System.out.println(stack.peek());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	stack.pop();
	}
}