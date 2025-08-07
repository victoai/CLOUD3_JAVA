package day13.string;

public class blank {

	public static void main(String[] args) {
		String str1 = "";
		String str2 = "   ";

		System.out.println(str1.isEmpty()); // true
		System.out.println(str2.isEmpty()); // false

		System.out.println(str2.isBlank()); // true (Java 11 이상)
	}

}
