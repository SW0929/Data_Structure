package Queue;

//������ Queue �ڹ� Ŭ������ ����
//poll()������ ��⿭�� ����ִٸ� null�� ��ȯ
//remove()������ ��⿭�� ��������� NoSuchElement ������ ��ȯ


import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			queue.add(i); //rear���� ���� ������ ����
			System.out.println("enqueue -> " + queue);
		}
		System.out.println("queue -> " + queue);
		for(int j = queue.size(); j > 0; j--) {
			queue.poll(); //front���� ���� ������ ����
			System.out.println("dequeue -> " + queue);
		}
		
	}

}
