package day23.추가;


class Actor{
     String 이름;
     String 대표작;
     String  소속사;  
}




public class ActorMain{

      public static void main( String[] args){
               Actor actor  =new Actor();
               input(actor);
               print(actor);
              
      }


     public static void input( Actor actor){

               actor.이름="이채민";
               actor.대표작="폭군의 세프";
               actor.소속사="바로엔터테인먼트";


  /*


     Scanner sc = new Scanner( System.in);
     actor.이름  = sc.nextLine();
     actor.대표작  = sc.nextLine();
     actor.소속사  = sc.nextLine();


*/
    }



   public static void print( Actor  actor){

            System.out.println(actor.이름);
            System.out.println(actor.대표작);
            System.out.println(actor.소속사);

   }



   

}
