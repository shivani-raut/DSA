class Stack
{
		private int top;//represents the index position of top element
		private int maxSize;//max size of array
		private int[] arr;
		
		Stack(int maxSize)
		{
			this.top = -1;
			this.maxSize = maxSize;
			arr = new int[maxSize];
		}
		
		//checking if the stack is full
		public boolean isFull()
		{
			if(top >= (maxSize - 1))
			{
				return true;
			}
			return false;
		}
		// Adding a new elemnt to the top of the stack
		public boolean push(int data)
		{
	    	if(isFull())
			{
				return false;
			}
			else
			{
				arr[++top] = data;
				return true;
			}
		}
		
		//Return the top most element of stack
		public int peek()
		{
			if(top<0)
			{
				return Integer.MIN_VALUE;
			}
			else
			{
				return arr[top];
			}
		}
		
		//Displaying the stack
		public void display()
		{
			System.out.println("Displaying stack elements");
			for(int i = top;i >= 0;i--)
			{
				System.out.println(arr[i]);
			}
		}
		
		//Checking if the stack is empty or not
		public boolean isEmpty()
		{
			if(top<0)
				return true;
			else
				return false;
		}
		public int pop()
		{
			if(isEmpty())
				return Integer.MIN_VALUE;
			else
				return arr[top--];
		}
}
class StackPop
{
	public static void main(String args[]) 
	{
		Stack stack = new Stack(5);
		System.out.println("Stack created.\n");

		if (stack.push(1))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		if (stack.push(2))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		if (stack.push(3))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		if (stack.push(4))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		if (stack.push(5))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		stack.display();

		if (stack.push(6))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		System.out.println("The top element is : " + stack.peek());
		
			int poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

		poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

		poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

		poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

		poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

		poppedElement = stack.pop();
		if (poppedElement == Integer.MIN_VALUE)
			System.out.println("Stack is empty\n");
		else
			System.out.println("The element popped out is : " + poppedElement + "\n");

	}
}

	

				