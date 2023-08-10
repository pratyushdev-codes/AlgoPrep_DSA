//Reverse the whole array.
import java.util.*;

public class ReverseanArray {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };

        int sp = 0;
        int ep = arr.length - 1;

        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
