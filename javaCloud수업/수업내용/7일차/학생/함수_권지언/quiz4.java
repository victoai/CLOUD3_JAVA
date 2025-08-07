package day07;

public class quiz4 {

	public static void main(String[] args) {
		
		int[] result = lotto();
		for( int lotto : result ) {
			System.out.print(lotto+" ");
		}
	}

	public static int[] lotto() {
		int[] lottonum = new int[7];
		for(int i=0; i<lottonum.length; i++) {
			int num = (int)Math.floor(Math.random()*36)+1;
			lottonum[i] = num;
		}
		return lottonum;
	}
	
}
