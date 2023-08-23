//Printing numbers in increasing order using recursion

public class IncreasingNumbersRecurssion{
     public static void main(String[] args) {
         inc(5);
    }
    
    public static void inc(int N) {
        if (N == 1) {
            System.out.println(1);
            return; // Added return to stop further recursion
        }
        
        inc(N - 1);
        System.out.println(N);
    }
}