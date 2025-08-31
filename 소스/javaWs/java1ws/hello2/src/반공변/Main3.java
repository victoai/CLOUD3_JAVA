package 반공변;

import java.util.List;
import java.util.function.Consumer;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(1, 2, 3);
		numbers.forEach((Integer x) -> System.out.println(x));
		numbers.forEach((Number x) -> System.out.println(x.doubleValue()));
		numbers.forEach((Object x) -> System.out.println(x.toString()));
		
		
	}

}
