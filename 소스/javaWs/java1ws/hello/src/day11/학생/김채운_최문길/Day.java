package day11.학생.김채운_최문길;

public class Day {
    private String title; // 할 일
    private String date; // 날짜
    private String desc; // 세부 사항
    private boolean result; // 실행 여부

    // 기본 생성자
    public Day() {
    }

    // 매개변수가 있는 생성자
    public Day(String title, String date, String desc) {
        this.title = title;
        this.date = date;
        this.desc = desc;
    }


    // toString() 메서드 재정의
    @Override
    public String toString() {
        return "Day{" +
                "할 일='" + title + '\'' +
                ", 날짜='" + date + '\'' +
                ", 세부사항='" + desc + '\'' +
                ", 실행여부='" + (result ? "O" : "X") + '\'' +
                '}';
    }

    // Setter 메서드들
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setResult(boolean result) {
        this.result = result;
    }


    // Getter 메서드들
    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDesc() {
        return desc;
    }




}
