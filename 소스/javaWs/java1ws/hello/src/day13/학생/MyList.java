package day13.학생;
 

public class MyList<T> {
    private T[] items;
    private int size;

    public MyList(int capacity) {
        items = (T[]) new Object[capacity];  // 제네릭 배열은 생성할 수 없으므로 이렇게 사용
        size = 0;
    }

    public void add(T item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }

    public T get(int i) {
        return items[i];  // 형변환 없이 안전하게 반환
    }
    
    
    
    public static void main(String[] args) {
    	 MyList<String> stringList = new MyList<>(5);
         stringList.add("Hello");
         stringList.add("World");

         // 문자열 가져오기
         String firstItem = stringList.get(0);
         String secondItem = stringList.get(1);

         // 출력
         System.out.println("First Item: " + firstItem);   // 출력: Hello
         System.out.println("Second Item: " + secondItem); // 출력: World

         // MyList 객체 생성 - Integer 타입을 다루는 리스트
         MyList<Integer> integerList = new MyList<>(3);
         integerList.add(100);
         integerList.add(200);

         // 정수값 가져오기
         Integer firstInt = integerList.get(0);
         Integer secondInt = integerList.get(1);

         // 출력
         System.out.println("First Integer: " + firstInt);   // 출력: 100
         System.out.println("Second Integer: " + secondInt); // 출력: 200
		
	}
}