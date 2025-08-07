package day12.학생.ShopMain;

public class ShopMain {
    public static void main(String[] args) {
        Item [] items = {new Album("I DO I DO" , 26000 ,"카라"),
                new Book("이것이 자바다" , 38000,"신용권","978-89-8406"),
                new Movie("데드풀과 울버린",15000, "라이언 레이놀즈", "숀 레비")};

        int totalPrice = 0;
        for (Item item : items) {
            //다운캐스팅해보기
            if(item instanceof Album){
                Album album = (Album) item;
                album.print();
            }
            else{
                item.print();
            }
            System.out.println();
            totalPrice += item.getPrice();
        }
        System.out.println("가격의 합: " + totalPrice);
    }
}
