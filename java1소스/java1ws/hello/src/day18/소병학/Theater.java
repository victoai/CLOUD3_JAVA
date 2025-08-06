package day18.소병학;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public class Theater {
    private String theaterName;
    private int[] size;
    private Map<String, String[]> movieAndTime;

    // 기본 생성자
    public Theater() {
    }

    // 모든 필드를 포함한 생성자
    public Theater(String theaterName, int[] size, Map<String, String[]> movieAndTime) {
        this.theaterName = theaterName;
        this.size = size;
        this.movieAndTime = movieAndTime;
    }

    // Getter 및 Setter
    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public Map<String, String[]> getMovieAndTime() {
        return movieAndTime;
    }

    public void setMovieAndTime(Map<String, String[]> movieAndTime) {
        this.movieAndTime = movieAndTime;
    }

    // toString 메소드
    @Override
    public String toString() {
        return "Theater [theaterName=" + theaterName + ", size=" + Arrays.toString(size) + ", movieAndTime="
                + movieAndTimeToString() + "]";
    }

    // Map<String, String[]>를 문자열로 변환하는 메소드
    private String movieAndTimeToString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String[]> entry : movieAndTime.entrySet()) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(entry.getKey())
              .append("=")
              .append(Arrays.toString(entry.getValue()));
        }
        return sb.toString();
    }
}
