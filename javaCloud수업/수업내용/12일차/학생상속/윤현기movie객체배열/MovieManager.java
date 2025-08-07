package chap_07.chap_01_class1.Ex05;

import java.util.Scanner;

/*
2. MovieManager 클래스를 만드세요:
        - Movie 배열을 관리
        - 최대 10개의 영화를 저장할 수 있는 배열 생성

        - 다음 메소드들을 구현:
          addMovie(): 새로운 영화 추가
          findMovieByTitle(): 제목으로 영화 검색
          getAverageRating(): 모든 영화의 평균 평점 계산
          getMoviesByYear(): 특정 년도의 영화들을 반환

          1. 필드에 배열을 선언한한다    ,  🚫배열을 선언하는것과 값을 초기화 하는것은 아예 다름!
          2. 생성자를 통해 배열의 값을 초기화.

          3. 필드에 배열안의 저장된 요소의 수를 추적하는 변수를 만든다.
          4. 생성자를 통해 추적변수의 값을 0으로 초기화.
 */

public class MovieManager {
    private Scanner sc; // 스케너 객체 생성
    private final Movie[] movies; // 배열 선언
    private int movieCount; // 현재 저장된 영화 수를 추적 하는 변수
    private double movieAvg;
    private int hap;

    public MovieManager() {
        this.sc = new Scanner(System.in); // 스케너 값 초기화
        this.movies = new Movie[10]; // 10개 크기의 배열 초기화
        this.movieCount = 0; // index  값 초기화
        this.hap = 0; // 점수 합
        this.movieAvg = 0.0; // 점수평균

    }

    // 매개변수가 없다면 ?? 어떤 영화를 배열에 추가해야 할지 알 수 없음.
    public void addMoive() {
        System.out.println("=========영화제목을 입력하세요=========");
        String addTitle = sc.next();
        System.out.println("=========감독이름을 입력하세요=========");
        String addName = sc.next();
        System.out.println("=========년도를 입력하세요=========");
        int addYear = sc.nextInt();
        System.out.println("=========점수를 입력하세요=========");
        int addRating = sc.nextInt();

        // 입력받은 것을 저장하기 위해서 movie 객체 생성
        Movie movie = new Movie(addTitle, addName, addYear, addRating);

        for (int i = 0; i < movies.length; i++) {
            // movies배열에서 빈자리 찾기
            // 빈자리를 찾는 이유? ⭐️직접 찾아주지 않으면 객체배열은 자기의 자리를 찾지 못한다.
            // ⭐유효성 체크 , 제목:한글,소문자,대문자체크 , 이름:제목과 동일,
            if (movies[i] == null && addTitle.matches("[가-힣a-zA-Z]+") && addName.matches("[가-힣a-zA-Z]+") && addYear > 0 && addRating > 0) {
                movies[i] = movie;
                System.out.println((i + 1) + "번쨰 영화가 추가 되었습니다.\n" + movies[i].toString());
                movieCount++; // index 증가
                break;
            } /* else {
                 System.out.println("항목에 올바르게 입력해주세요");
                break;
            } */
        }
    }

    // 저장한 영화정보 조회하기
    public void searchMovie() {
        System.out.println("\n=========저장한 영화 정보 입니다.=========");
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] != null) {
                System.out.println((i + 1) + "번째 " + movies[i].toString());
            } /*else {
                System.out.println("조회된 정보가 없습니다.");
                break;
            } */
        }
    }

    // 제목으로 영화검색하기
    public void findMovieTitle() {
        System.out.println("\n=========저장한 영화 정보 입니다.=========");
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] != null) {
                System.out.println((i + 1) + "번째 " + movies[i].toString());
            }/*else {
                System.out.println("조회된 정보가 없습니다.");
            }*/
        }

        System.out.println("=========찾고싶은 영화를 입력하세요.=========");
        String findTitle = sc.next();

        for (int i = 0; i < movies.length; i++) {
            if (movies[i] != null && movies[i].getTitle().equals(findTitle)) { //유효성 체크
                System.out.println((i + 1) + "번 쨰 \n" + movies[i].toString());
            } else {
                System.out.println("올바른 제목을 입력하세요");
                break;
            }
        }
    }

    // 저장된 영화 점수 평균 구하기
    // movies[i]중 점수만 뺴와야한다
    // 그러기 위해서는? getRating에 저장
    public void getAverageRating() {
        System.out.println("======= 저장된 정보 입니다 ======\n");
        for (int i = 0; i < movies.length; i++) {
            //객체배열의 자리 지정 해주기
            if (movies[i] != null) {
                System.out.println((i + 1) + "번째 " + movies[i].toString());
            }
        }

        //평균 구하기
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] != null && movies[i].getRating() > 0) { //유효성 체크
                this.hap += movies[i].getRating(); // this붙여서 명확화 하기
            }
        }

            this.movieAvg =  hap / movieCount; // this붙여서 명확화 하기

        System.out.println("영화점수의 합 : " + hap);
        System.out.println("평균은 : " + movieAvg);
    }

    // 특정 년도의 영화들을 반환
    public void getMoviesByYear() {
        System.out.println("년도를 입력해주세요");
        int putYear = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            //유효성 체크 : 객체배열의 자리 찾아주기 , 저장된년도와 입력년도가 같은지 , 저장된 년도가 0보다 큰지 , 입력년도가 0보다 큰지
            if (movies[i] != null && movies[i].getYear() == putYear && movies[i].getYear() > 0 && putYear > 0) {
                System.out.println(movies[i].toString() + "입니다");
            }
        }
    }

    //수정 메서드
    public void modifyMovies(){
        System.out.println("======= 영화정보를 조회 합니다 ======");
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] != null) {
                System.out.println((i + 1) + "번 째 " + movies[i].toString());
            }
        }

        System.out.println("수정 할 항목의 번호를 선택 하세요.");
        int modifyNum = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            //유효성 체크: 객체배열의 null값 체크 , 입력값이 0보다 큰지 , 입력값이 배열의 인덱스번호와 같은지
            if (movies[i] != null && modifyNum > 0 && modifyNum == movieCount ){
                System.out.println("=========영화제목을 입력하세요=========");
                String modifyTitle = sc.next();
                System.out.println("=========감독이름을 입력하세요=========");
                String modifyName = sc.next();
                System.out.println("=========년도를 입력하세요=========");
                int modifyYear = sc.nextInt();
                System.out.println("=========점수를 입력하세요=========");
                int modfiyRating = sc.nextInt();

                //수정 할 객체 생성
                Movie movies2 = new Movie(modifyTitle,modifyName,modifyYear,modfiyRating);
                movies[modifyNum-1] = movies2;
                System.out.println("수정완료!\n"+movies[modifyNum-1].toString());
                movieCount++;
                break;
            }

        }
    }
}

