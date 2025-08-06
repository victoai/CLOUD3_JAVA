package day08.학생;

public class WeatherTest {

	public static void main(String[] args) {
		
		String season = "여름";
		int month=8;
		int day=12;
		int temp=34;
		String weather="맑음";
		
        
		Weather c = new Weather();
		c.season="여름";
		c.month=8;
		c.day=12;
		c.temp=34;
		c.weather="맑음";
		
		  weatherInfo(c);
				

	}
	public static void  weatherInfo(Weather c) {
		System.out.println(c.season);
		System.out.print(c.month + "/");
		System.out.println(c.day);
		System.out.println(c.temp + "도");
		System.out.println(c.weather);
		
		 
	}
	
	

}
