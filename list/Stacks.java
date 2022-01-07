package list;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		Stack<String> color = new Stack<>();
		
		color.push("Red");
		color.push("Orange");
		color.push("Yellow");
		color.push("Green");
		color.push("Blue");
		color.push("Purple");
		color.push("Pink");
		System.out.println(color);
		
		System.out.println();
		
		System.out.println(color.peek());
		
		System.out.println();
		
		color.pop();
		System.out.println(color);
		System.out.println(color.peek());

	}

}
