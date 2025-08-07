package day11.학생.BookMgt;

import java.util.Scanner;

public class Book {

    private String title; // 제목
    private String author; // 저자
    private String location; // 위치
    private Boolean isRent; // 대출현황

    static String manager = "에이콘";

    public Book(String title, String author, String location, Boolean isRent) {
        super();
        this.title = title;
        this.author = author;
        this.location = location;
        this.isRent = isRent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getIsRent() {
        return isRent;
    }

    public void setIsRent(Boolean isRent) {
        this.isRent = isRent;
    }

    public void printInfo() {
        System.out.println(title + " " + author + " " + location + " " + isRent);
    }

    

}
