package main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		CircularQueue<Integer> c = new CircularQueueImpl<Integer>();
		
		System.out.println("Thêm phần tử 10 vào mảng rỗng");
		c.add(10);
		System.out.println(c.get());
		
		System.out.println("Thêm phần tử 20, 25, 30, 200, 250, 300 vào mảng");
		c.addAll(Arrays.asList(20,25,30,200,250,300));
		System.out.println(c.get());
		
		System.out.println("Xóa phần tử 25");
		c.remove(25);
		System.out.println(c.get());
	
		System.out.println("Xóa phần tử 200, 30");
		c.removeAll(Arrays.asList(200,30));
		System.out.println(c.get());
		
		System.out.println("Lấy phần tử đầu");
		System.out.println(c.peek());
		System.out.println(c.get());
		
		System.out.println("Lấy và xóa phần tử đầu");
		System.out.println(c.poll());
		System.out.println(c.get());
	}

}
