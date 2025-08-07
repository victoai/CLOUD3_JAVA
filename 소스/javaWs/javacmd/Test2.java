
 import java.util.Scanner;

 class  Test2{
   public static void main( String [] args){
        Scanner sc = new Scanner( System.in);
        int randomSu;
        int input;
        int tryCnt=0;

        randomSu =  ( int) ( Math.random() * 100 ) +1; 
        input = sc.nextInt();
        while(  input != randomSu ){                        

            tryCnt++;
            if( input  > randomSu ){
               System.out.println(" down");
       
            }else if( input < randomSu)  {
               System.out.println(" up ");
            }  
            input = sc.nextInt();           
         }
 
        ///

        if( tryCnt  <=3) {
                System.out.println( "  get  snack !!! ");
        }else  {
                System.out.println("  just success");        
       } 
}



 


}