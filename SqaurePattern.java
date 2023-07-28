// print this patter 
// 12
 
// ************ 
// ************ 
// ************ 
// ************ 
// ************ 
// ************ 
// ************ 
// ************ 
// ************ 
// ************ 
// ************
import java.util.Scanner;

public class SqaurePattern {
    public static void main(String args[]) throws Exception {
      Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
    for(int j=1; j<=n;j++){
      System.out.print("*");
     }System.out.println();
    }
    }
  }

