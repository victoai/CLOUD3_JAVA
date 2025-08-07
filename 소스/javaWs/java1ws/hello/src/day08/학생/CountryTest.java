package day08.학생;

public class CountryTest {

	public static void main(String[] args) {
		
		Country kor = new Country();
		kor.name = "Korea";
		kor.capital = "Seoul";
		kor.population = 52000000;
		kor.language = "Korean";
		kor.continent = "Asia";
		
		Country usa = new Country();
		usa.name = "USA";
		usa.capital = "Washington D.C.";
		usa.population = 333000000;
		usa.language = "English";
		usa.continent = "North America";
		
		Country uk = new Country();
		uk.name = "United Kingdom";
		uk.capital = "London";
		uk.population = 67000000;
		uk.language = "English";
		uk.continent = "Europe";
		
		printCountryInfo(kor);
		printCountryInfo(usa);
		printCountryInfo(uk);
		

	}
	
	public static void printCountryInfo(Country c) {
		System.out.println("이름: " + c.name);
		System.out.println("수도: " + c.capital);
		System.out.println("인구: " + c.population);
		System.out.println("언어: " + c.language);
		System.out.println("대륙: " + c.continent);
		System.out.println("-------------------------");
	}
}
