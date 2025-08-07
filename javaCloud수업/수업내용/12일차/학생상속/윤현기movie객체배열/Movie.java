package chap_07.chap_01_class1.Ex05;
/*
영화 관리 시스템을 만드세요.

요구사항:
1. Movie 클래스를 만드세요:
   - 제목(title), 감독(director), 개봉년도(year), 평점(rating) 정보를 가짐
   - 모든 필드는 private으로 설정
   - 생성자와 getter/setter 메소드 구현
*/
public class Movie {
    private String title;
    private String director;
    private int year;
    private int rating;

    public Movie(){

    }

    //생성자
    public Movie(String title , String director , int year , int rating){
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    //getter
    public String getTitle() {
        return title;
    }
    public String getDirector(){
        return director;
    }
    public int getYear(){
        return year;
    }
    public int getRating(){
        return  rating;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setRating(int rating){
        this.rating = rating;
    }

    public String toString(){
        return "제목: "+getTitle()+"\n"+"감독: "+getDirector()+"\n"+"년도 :"+getYear()+"\n"+"점수 :"+getRating();
    }

}
