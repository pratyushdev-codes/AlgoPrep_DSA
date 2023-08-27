// Given N 2D Points, Calculate no. of distinct points among them.

// Ex: x[5] = {2, 1, 3, 2, 2}
//     y[5] = {3, 1, 2, 3, 4}
    
// The first array represents the x co-ordinates, the second array represents the y co-ordinate. Acoording to above examples the points are 
//     (x[0],y[0])->(2,3)
//     (x[1],y[1])->(1,1)
//     (x[2],y[2])->(3,2)
//     (x[3],y[3])->(2,3)
//     (x[4],y[4])->(2,4)
    
// Total number of distinct points are 4.
// Input Format

// The first line contains an Integer n denoting number of points.
// Second line contains n integer denoting the x-coordinates.
// Third line contains another n integer denoting the y-coordinates.

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/levelup-18aug-distinctpoints/submissions/code/1366018465
import java.util.*;
public class HashmapDistinctPoints{
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] x = new int[n];
        int[] y = new int[n];
        
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            y[i] = scanner.nextInt();
        }
        
        Set<String> distinctPoints = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            String point = x[i] + "," + y[i];
            distinctPoints.add(point);
        }
        
        int distinctCount = distinctPoints.size();
        System.out.println(distinctCount);
    }
}