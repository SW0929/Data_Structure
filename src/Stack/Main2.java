package Stack;

//������ Stack �ڹ� Ŭ������ ����

import java.util.Stack;
import java.io.*;

public class Main2 {

	public static void main(String[] args) throws IOException{
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < 10; i++) {
			stack.push(i);
			System.out.println("push -> " + stack);
		}
		
		for(int j = stack.size(); j > 0; j--) {
			stack.pop();
			System.out.println("pop -> " + stack);
		}
	}

}
