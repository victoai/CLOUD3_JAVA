package day07.학생;

public class 날씨정보반환_송수빈 {


    public static void main(String[] args) {
        String[] weather = weeklyWeather();

        System.out.println("이번주 날씨:");
        for (int i = 0; i < weather.length; i++) {
            System.out.println("Day " + (i + 1) + "- " + weather[i]);
        }
    }
    
    public static String[] weeklyWeather() {
//        return new String[] {"cloudy", "sunny", "sunny", "rainy", "sunny", "rainy", "cloudy"};
    	String[] result = { "cloudy", "sunny", "sunny", "rainy", "sunny", "rainy", "cloudy"};
    	return result;
    }
}


