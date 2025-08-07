package day18.소병학;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class SelectTheather implements ConsolePrint{
	private String movieName;
    private String movieRating;
    private String genre;
	private String runningTime;
    private String releaseDate;
    private ArrayList<String> theaters;
	
	public SelectTheather(Movie m) {
		movieName=m.getMovieName();
		movieRating=m.getMovieRating();
		genre=m.getGenre();
		runningTime=m.getRunningTime();
		releaseDate=m.getReleaseDate();
		theaters=m.getTheaters();
	}
	@Override
	public void print() {
		String filePath = "res/theaterinfo.json"; // 파일 경로를 지정하세요
		try(FileReader reader =new FileReader(filePath)){
			Gson gson = new Gson();
			Type type = new TypeToken<Map<String,Theater>>(){}.getType();
			Map<String,Theater> theaterinfo = gson.fromJson(reader,type);
			System.out.println(theaterinfo);
			
		 
			System.out.println("영화관을 골라주세요.");
			System.out.println(movieName + "이 상영되는 상영관 목록입니다");
			for(int i=0;i<theaters.size();i++) {
				
				String nameTh=theaters.get(i);
				System.out.println(nameTh);
				Theater th = theaterinfo.get(nameTh);
				
				th.setTheaterName(nameTh);
				
				
				int[] thsize=th.getSize();
				
				System.out.println( thsize[0]);
				
				String [] times;
				if(th.getMovieAndTime().containsKey(movieName)) {
					times=th.getMovieAndTime().get(movieName);
					System.out.println(times[0]);
				}
				System.out.println("\n"+nameTh+"관 총("+thsize[0]*thsize[1]+")");
				System.out.print("	영화:"+movieName+"	장르:"+ genre+"	러닝타임:"+runningTime);
  
 
			
			}
			
			 
			
			
		}catch (Exception e) {
            e.printStackTrace();
        }

	}
}
