package day18.링크드리스트;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex01 {
    public static void main(String[] args) {
    	// 조회  : O(n)   이는 최악의 경우 리스트의 모든 요소를 순차적으로 탐색해야 하기 때문
    	
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // for-each 루프를 사용한 순회
        for (String item : list) {
            System.out.println(item);
        }
        
        
     // for 루프를 사용한 순회
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        
        // Iterator를 사용한 순회
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
