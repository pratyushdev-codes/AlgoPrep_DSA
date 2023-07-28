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
     for(int j=2;j<=n;j++){
      System.out.println(" ");
    for(int i=1; i<=n;i++){
      System.out.print("*");
     }
    }
    }
  }

