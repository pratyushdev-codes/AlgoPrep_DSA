import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       int n1=0;
       int n2=1;
       int count =0;
       while(count<n){
        System.out.print(n1 + " ");
        int n3=n1+n2;
        n1=n2;
        n2=n3;
        count =count+1;
       }
    }

}

}
