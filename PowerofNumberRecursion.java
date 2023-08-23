public class PowerofNumberRecursion{
    public static void main(String[] args) {
        int ans = Pow(0,1 );
        System.out.println(ans);
        
    }public static int Pow(int a, int n){
        if (n == 0 ||a==1 ){
            return 1;
        }
            int temp = Pow(a,n-1);
            return temp*a;

    }
}
