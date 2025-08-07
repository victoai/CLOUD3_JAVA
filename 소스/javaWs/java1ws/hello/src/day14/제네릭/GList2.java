package day14.제네릭;

public class GList2<T> {
    private T[] items;
    private int size;

    public GList2(int capacity) {
        items = (T[]) new Object[capacity];  //   Object 배열로 생성
        size = 0;
    }

    public void add(T item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }

    public T get(int i) {
        return items[i];  // 컴파일 타임에 T 타입으로 결정되므로 형변환 필요 없음
    }
    
    public void clear(){
		//current 초기화
		size=0;
		// nums= new int[3];		
	}
	
	public int size()
	{
		return size;
	}
}
