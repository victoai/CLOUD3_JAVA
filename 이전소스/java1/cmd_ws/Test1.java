
 import java.util.Scanner;

 class  Test1{
   public static void main( String [] args){

        Scanner sc = new Scanner( System.in);
        int randomSu;
        int input;
        randomSu =  ( int) ( Math.random() * 100 ) +1; 
        input = sc.nextInt();
        while(  input != randomSu ){                        
            if( input  > randomSu ){
               System.out.println(" down");
       
            }else if( input < randomSu)  {
               System.out.println(" up ");
            }  
            input = sc.nextInt();           
         } 
        ///
        System.out.println(" success");        
   }

}


