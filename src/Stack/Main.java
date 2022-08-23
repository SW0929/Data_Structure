package Stack;

//�迭�� Stack ���� ǥ�� (������)
//������ ������ ����������
//LIFO(Last-In-First_out)

import java.util.*;

public class Main {
	static int top = -1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� ũ�� �Է� -> ");
		int n = sc.nextInt();
		int stack[] = new int[n];
		
		while(true) {
			System.out.print("push/pop/out -> ");
			String state = sc.nextLine();
			
			if(state.equals("out")) {
				//���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			else if(state.equals("push")) {
				
				//���� ��ȭ���� Ȯ��
				if(is_full(stack, top)) {
					
					System.out.println("������ ��ȭ�����Դϴ�.");
					continue;
				}
				else 
				{
					//���� ������ ����
					System.out.printf("push -> %d\n", push(stack));
					
				}
				
			}
			
			else if(state.equals("pop")) {
				
				if(is_empty(top)) {
					System.out.println("���ÿ� �����Ͱ� �������� �ʽ��ϴ�.");
					continue;
				}
				else {
					//���� ������ ����
					pop(stack);
		
				}
				
			}
			else {
				System.out.println("�ǹٸ��� ���� �Է��Դϴ�. ���Է� �ϼ���.");
				continue;
			}
		}
		sc.close();
		
	}
	
	//������ ����
	private static int push(int stack[]) {
		stack[++top] = top;
		return stack[top];
	}
	
	//������ ����
	private static void pop(int stack[]) {
		System.out.printf("pop -> %d\n", stack[top]);
		--top;
	}
	
	//�����Ͱ� �������
	private static boolean is_empty(int top) {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	//���� ��ȭ����
	private static boolean is_full(int stack[], int top) {
		if(top == stack.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
}