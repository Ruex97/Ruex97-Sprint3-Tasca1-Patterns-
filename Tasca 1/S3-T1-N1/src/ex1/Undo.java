package ex1;

import java.util.Stack;

public class Undo {
	
	private static Undo instance;
	private static Stack<Integer> history;
	
	/**
	 * I make a private constructor to avoid instances with "new" operator 
	 */
	private Undo() {
	
	}
	
	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
			history = new Stack<Integer>();
		}
		return instance;
	}
	
	
	public static Stack<Integer> getHistory() {
		return history;
	}

	public void addToStack(int command) {
		history.add(command);
		
	}
	
	public void deleteFromStack () {
		if (!history.empty()) {
			history.pop();
		}
	
	}
	
	public void showStack () {
		System.out.println(history.toString());
	}
	
	public int LastMove() {
		return history.size();
	}



	
	
	
	
	
	
}
