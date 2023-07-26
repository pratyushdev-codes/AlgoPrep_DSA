import java.util.*;
public class ReverseInteger {
    public static void main(String[] args) {
       
       Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
            int lastnumber =n%10;
            System.out.print(lastnumber);
            n=n/10;
        }
    }
}