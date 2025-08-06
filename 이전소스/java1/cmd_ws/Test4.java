class Test4{
   public static void main(String[] args){         
         int n=0;
         int sum1=0;
         int sum2=0 ;

         while(  n<10 ){
           n=n+1;
           sum1 = sum1 + n;
           System.out.println(  sum1  +", " );   
           sum2 = sum2 + sum1; 
         }
        System.out.println(  sum2);      
    }
}