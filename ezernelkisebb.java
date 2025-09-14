public class ezernelkisebb {

   static int sumOfNums(int limit){
    int sum=0;
    
    for (int i=0; i<limit; i++){
        if (i%3 == 0 || i%5 == 0){
            sum=i+sum;
        }
    }
        return sum;
}

   public static void main(String[] args)
   {
       System.out.println("3 és 5 többszörösei 0-1000ig: " + sumOfNums(1000));
   }
}
