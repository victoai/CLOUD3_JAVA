package day08.학생;

public class Ksh1 {
	
	public static int Ksh_adder(int su1, int su2) {
		int sum = su1 + su2;
		return sum;
	}

	public static void Ksh_star(int a) {
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
