package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class CircularQueueImpl<T> implements CircularQueue<T> {
	private List<T> arr;
	
	public CircularQueueImpl() {
		arr = new ArrayList<T>();
	}
	
	@Override
	public List<T>  get(){
		return  arr;
	}

	@Override
	public void add(T t) {
		arr.add(t);
	}

	@Override
	public void addAll(Collection<T> t) {
		arr.addAll(t);
	}
	@Override
	public void remove(T t) {
		arr.remove(t);
	  	
	}

	@Override
	public void removeAll(Collection<T> t) {
		arr.removeAll(t);
	}
	
	@Override
	public T peek() {
		return arr.get(0);
	}
	

	@Override
	public T poll() {
		//lấy phần tử đầu của mản
		T rs = arr.get(0);
		//xóa phần tử đầu của mảng
		arr.remove(0);
		//thêm phần tử đó vào cuối mảng
		arr.add(rs);
		return rs;
	}
	
	
}
