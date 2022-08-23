package Stack;

//배열로 Stack 동작 표현 (정수형)
//벼열은 공간이 정해져있음
//LIFO(Last-In-First_out)

import java.util.*;

public class Main {
	static int top = -1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("스택 크기 입력 -> ");
		int n = sc.nextInt();
		int stack[] = new int[n];
		
		while(true) {
			System.out.print("push/pop/out -> ");
			String state = sc.nextLine();
			
			if(state.equals("out")) {
				//프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			else if(state.equals("push")) {
				
				//스택 포화상태 확인
				if(is_full(stack, top)) {
					
					System.out.println("스택이 포화상태입니다.");
					continue;
				}
				else 
				{
					//스택 데이터 삽입
					System.out.printf("push -> %d\n", push(stack));
					
				}
				
			}
			
			else if(state.equals("pop")) {
				
				if(is_empty(top)) {
					System.out.println("스택에 데이터가 존재하지 않습니다.");
					continue;
				}
				else {
					//스택 데이터 삭제
					pop(stack);
		
				}
				
			}
			else {
				System.out.println("옳바르지 않은 입력입니다. 재입력 하세요.");
				continue;
			}
		}
		sc.close();
		
	}
	
	//데이터 삽입
	private static int push(int stack[]) {
		stack[++top] = top;
		return stack[top];
	}
	
	//데이터 삭제
	private static void pop(int stack[]) {
		System.out.printf("pop -> %d\n", stack[top]);
		--top;
	}
	
	//데이터가 비어있음
	private static boolean is_empty(int top) {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	//스택 포화상태
	private static boolean is_full(int stack[], int top) {
		if(top == stack.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
}