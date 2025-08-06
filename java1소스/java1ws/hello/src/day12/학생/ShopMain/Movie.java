package day12.학생.ShopMain;

public class Movie extends Item{
    private String actor;
    private String director;

    public Movie(String name , int price , String actor , String director){
        super(name , price);
        this.actor = actor;
        this.director = director;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("-> 배우: " + actor + ", 감독: " + director);
    }
}
