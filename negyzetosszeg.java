public class negyzetosszeg {
    
    static int sumOfSquares(int limit){
        
        int negyzetosszeg = 0;
        for (int i = 0; i<=limit; i++){
            negyzetosszeg=(i*i)+negyzetosszeg;
        }
        return negyzetosszeg;
    }
    
    static int squareOfSum(int limit){
        
        int osszegnegyzet = 0;
        for (int i=0; i <= limit; i++){
            osszegnegyzet+=i;
        }
        return osszegnegyzet*osszegnegyzet;
    }
    
    public static void main(String[] args){
        
        System.out.println("A kettő különbsége: " + (squareOfSum(100)-sumOfSquares(100)));
        
        
        
    }
}
