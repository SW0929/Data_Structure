package Queue;

//정수형 Queue 자바 클래스로 구현
//poll()에서는 대기열이 비어있다면 null을 반환
//remove()에서는 대기열이 비어있으면 NoSuchElement 에러를 반환


import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			queue.add(i); //rear에서 부터 데이터 삽입
			System.out.println("enqueue -> " + queue);
		}
		System.out.println("queue -> " + queue);
		for(int j = queue.size(); j > 0; j--) {
			queue.poll(); //front에서 부터 데이터 삭제
			System.out.println("dequeue -> " + queue);
		}
		
	}

}
