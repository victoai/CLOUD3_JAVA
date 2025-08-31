package 반공변;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		 
		
		ArrayList<Dog> list = new ArrayList<>();
		list.add( new Dog());
		
		
		ArrayList<Animal> list2 = new ArrayList<>();
		list2.add( new Animal());
		
		
		ArrayList<? super Dog> a =list;
		ArrayList<? super Dog> b =list2;
		
		
		Animal animal  = (Animal)b.get(0);
		
		System.out.println( animal);
		
		
		
		
		 
	}

}
