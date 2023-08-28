
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    
    for(int i = 0;i<n; i++){
        arr [i]=sc.nextInt();
    }
     int sp= sc.nextInt();
    int ep=sc.nextInt();

    reversePart(arr, sp, ep);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
  
}public static void reversePart(int []arr, int sp, int ep){
   int n=arr.length;
    while(sp>ep){
        int temp=arr[sp];
        arr[sp]=arr[ep];
        arr[ep]=temp;
        sp++;
        ep--;

    

    }

  for(int i = 0;i<n; i++){
       System.out.print(arr[i]+ " ");
    }
}
        
    }




