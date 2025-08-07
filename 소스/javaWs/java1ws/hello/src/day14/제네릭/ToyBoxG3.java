package day14.제네릭;

public class ToyBoxG3<T> {
	
	//Object  list[];
	T[]  list ;
	int index;
	
	
	//생성자
	public  ToyBoxG3() {
		
		list  = (T[])new Object[10];
		index=0;
	}
	
	
	public void add( T toy) {
		list[index]= toy;
	}
	
	
	public T get( int i) {
		return  list[i];
	}
	
	
	public int size() {
		return index;
	}
	

}
