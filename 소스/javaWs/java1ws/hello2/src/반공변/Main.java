package 반공변;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 
		
		List<? super Dog> dogs = new ArrayList<Dog>(); 
		
		
		dogs.add(new Puppy());
		dogs.add( new Dog());
		//dogs.add(new Animal());		
		
		System.out.println( dogs.size());
		
		
		

	}

}
