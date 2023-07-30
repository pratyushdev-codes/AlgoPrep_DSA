public class FactorialOfaNumber {

    public static void main(String[] args) {
        int n = 4;
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;   
        }
        System.out.println(ans);
    }
}
