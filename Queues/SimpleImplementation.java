package Queues;

class queue {
	int[] arr;
	int size, cap;

	queue(int c) {
		size = 0;
		cap = c;
		arr = new int[cap];
	}
}

public class SimpleImplementation {

	public static void main(String[] args) {
		queue a = new queue(5);
		int size = 0;
		deque(a);
	}

	public static void deque(queue a) {
		if (isEmpty()) {
			return;
		}
		int size = 0;
		for (int i = 0; i < size - 1; i++) {
			a.arr[i] = a.arr[i + 1];
		}
		for(int val : a.arr) {
			System.out.println(val);
		}
		
	}

	static boolean isEmpty() {
		int size = 0;

		return (size == 0);

	}

	
}
