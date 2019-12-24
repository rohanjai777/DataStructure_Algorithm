/*
Given a Stack,  you need to sort it with the help of temporary stack.

Solution :
Let’s say,  you have two stacks,  stack  and tempStack.
Pop an element from stack and compare it with head of tempStack.
If element it greater, push it to tempStack.
If element is lesser than  head of tempStack, pop the element from tempStack and push it to stack until you get the element which is greater than head of tempStack.
In the end,  tempStack will be sorted stack.
*/
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
		}
		else{	
		a[++top] = n;
		
		}
	}
	int pop(){
		if(top < 0){
			return 0;
		}
		else{
			return a[top--];
		}
	}
	
	int peek(){
		if(top < 0){
		return 0;
		}
		else
		return a[top];
	}
	
	int getTop(){
		return top;
	}
	
	void show(){
		for(int i = 0; i<=top;i++){
			System.out.print(a[i]+" ");
		}
	}
	
}

public class Sort{
    public static void main(String[] args){
        Stack s1 = new Stack();
        s1.push(4);
        s1.push(2);
        s1.push(3);
        s1.push(1);
        Stack s2 = new Stack();  // this is new stack used for sorting
        int temp = 0; // declare a temporary variable
        while(!s1.isEmpty()){   // loop until s1 is empty
            temp = s1.pop();  // firstly pop the element and store in temp variable
            while(!s2.isEmpty() && s2.peek()<temp){  // loop until s2 is empty and top element of s2 is less than temp element
                s1.push(s2.pop()); // pop from s2 and put it back in s1
            } 
            s2.push(temp);  // now after loop, top of s2 is grater than temp, so push the temp in s2
        }
        s2.show();   // to show full stack left---->right in array bottom---->top in stack
    }
}