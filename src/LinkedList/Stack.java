package LinkedList;

//LinkedList�� ������ Stack

import java.util.*;

class Node {
	// -1�� NULL�� ����
	int datafield = -1;
	int linkfield = -1;
	int top = datafield; //HeadPointer
	
	//��� ����
	int push(int data) {
		datafield = data;
		linkfield = data - 1;
		top = datafield;
		return data;
	}
	//��� ����
	void pop() {
		datafield--;
		linkfield--;
		top = datafield;
	}

}

public class Stack {
	
	public static void main(String[] args) {
		Node node = new Node();
		LinkedList<Integer> linkedlist = new LinkedList<>();
		System.out.print("node push() -> ");
		
		//Stack�� 0~9 ��� ����
		for(int i = 0; i < 10; i++) {
			linkedlist.add(node.push(i));
			System.out.printf(" %d ", node.push(i));
			
		}
		System.out.println();
		
		node.pop();
		
		System.out.printf(" %d %d %d ", node.datafield, node.linkfield, node.top);
	}
	
	
}
