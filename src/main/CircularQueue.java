package main;

import java.util.Collection;
import java.util.List;

public interface CircularQueue<T> {

	//lấy tất cả các phần tử 
	List<T> get();
	
	//thêm 1 phần tử
	void add(T t);
	
	//thêm nhiều phần tử
	void addAll(Collection<T> t);
	
	//xóa 1 phần tử
	void remove(T t);
	
	//xóa nhiều phần tử
	void removeAll(Collection<T> t);
	
	//lấy phần tử đầu
	T peek();
	
	//lấy phần tử đầu và chuyển nó xuống cuối
	T poll();
	
}
		