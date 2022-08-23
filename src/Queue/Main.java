package Queue;

//배열로 표현한 정수형 원형 큐
//ex) 크기가 5일 경우 enqueue -> 1, 2, 3, 4 | dequeue -> 1, 2, 3, 4 순서로 삽입되거나 삭제된다.
import java.util.*;

public class Main {
	static int front = 0; //전단
	static int rear = 0; //후단

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("큐 크기 -> ");
		int num = Integer.parseInt(sc.nextLine());
		int queue[] = new int[num];
		
		while(true) {
			System.out.print("enqueue/dequeue/init/size/stop -> ");
			String state = sc.nextLine();
			
			//switch문을 사용해도 상관없음 실행 시간차이x
			
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
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(state.equals("init")) {
				init();
			}
			else if(state.equals("size")) {
				size(queue);
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		sc.close();
	}
	
	//데이터 삽입
	private static void enqueue(int queue[]) {
		
		rear = (rear + 1) % queue.length;
		queue[rear] = rear;
		System.out.printf("enqueue -> %d\n", queue[rear]);
		
	}
	
	//데이터 삭제
	private static void dequeue(int queue[]) {
		
		front = (front + 1) % queue.length;
		queue[front] = front;
		System.out.printf("dequeue -> %d\n", queue[front]);
		
	}
	
	//큐가 비어있는 확인
	private static boolean is_empty() {
		if(front == rear) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//큐가 포화상태 확인
	private static boolean is_full(int queue[]) {
		
		if(front == (rear + 1) % queue.length) {
			return true;
		}
		else {
			return false;
		}
	}

	//큐 초기화
	private static void init() {
		front = 0;
		rear = 0;
	}

	//큐 size
	private static void size(int queue[]) {
		System.out.printf("queue size -> %d", (rear - front + queue.length) % queue.length);
	}
}
