public class FibonacciNumbersusingRecursion{
    public static void main(String[] args) {
       System.out.println(fibo(6));
        

    }public static int fibo(int N){
        if(N==1 || N==0){
            return N;
        }
        int temp1 = fibo(N-1);
        int temp2=fibo(N-2);
        return temp1+temp2;
    }
}