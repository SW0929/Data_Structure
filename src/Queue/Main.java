package Queue;

//�迭�� ǥ���� ������ ���� ť
//ex) ũ�Ⱑ 5�� ��� enqueue -> 1, 2, 3, 4 | dequeue -> 1, 2, 3, 4 ������ ���Եǰų� �����ȴ�.
import java.util.*;

public class Main {
	static int front = 0; //����
	static int rear = 0; //�Ĵ�

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ť ũ�� -> ");
		int num = Integer.parseInt(sc.nextLine());
		int queue[] = new int[num];
		
		while(true) {
			System.out.print("enqueue/dequeue/init/size/stop -> ");
			String state = sc.nextLine();
			
			//switch���� ����ص� ������� ���� �ð�����x
			
			if(state.equals("enqueue")) {
				if(is_full(queue)) {
					System.out.println("overflow");
				}else {
					enqueue(queue);
				}
			}
			else if(state.equals("dequeue")) {
				if(is_empty()) {
					System.out.println("underflow");
				}else {
					dequeue(queue);
				}
			}
			else if(state.equals("stop")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if(state.equals("init")) {
				init();
			}
			else if(state.equals("size")) {
				size(queue);
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		sc.close();
	}
	
	//������ ����
	private static void enqueue(int queue[]) {
		
		rear = (rear + 1) % queue.length;
		queue[rear] = rear;
		System.out.printf("enqueue -> %d\n", queue[rear]);
		
	}
	
	//������ ����
	private static void dequeue(int queue[]) {
		
		front = (front + 1) % queue.length;
		queue[front] = front;
		System.out.printf("dequeue -> %d\n", queue[front]);
		
	}
	
	//ť�� ����ִ� Ȯ��
	private static boolean is_empty() {
		if(front == rear) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//ť�� ��ȭ���� Ȯ��
	private static boolean is_full(int queue[]) {
		
		if(front == (rear + 1) % queue.length) {
			return true;
		}
		else {
			return false;
		}
	}

	//ť �ʱ�ȭ
	private static void init() {
		front = 0;
		rear = 0;
	}

	//ť size
	private static void size(int queue[]) {
		System.out.printf("queue size -> %d", (rear - front + queue.length) % queue.length);
	}
}
