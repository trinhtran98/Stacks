
public class api {
	public static void main(String[] args)
	{
		Stack nums= new Stack();
		nums.push(15);
		nums.push(8);
		nums.push(10);
		
		
		
		System.out.println("Peek value is " +nums.peek());
		System.out.println("Pop value is "+nums.pop());
		System.out.println("Size is " +nums.size());
		
		System.out.println("Empty = " + nums.isEmpty());
		nums.show();
	}
}
