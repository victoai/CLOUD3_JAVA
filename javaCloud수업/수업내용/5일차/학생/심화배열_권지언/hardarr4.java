package day05;

public class hardarr4 {

	public static void main(String[] args) {

		char[][] arr = new char[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==0 || i==4 || j==0 || j==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
