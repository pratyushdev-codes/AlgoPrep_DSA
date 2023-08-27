// 1.Take as input String.

// a. Write a recursive function which counts, the number of times “aaa”
// appears in the string. Print the value returned.

// b. Write a recursive function which counts, the number of times “aaa”
// appears in the string, but only such instances of “aaa” should be
// considered which do not overlap. Print the value returned.

// Example(To be used only for expected output):

// Input:
// aaaaaa

// output
// 4
// 2

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/recursion-count-of-aaa-hw

public class aaaCount{
       public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.next();
        System.out.println(count1(st,0,0));
        System.out.println(count2(st,0,0));
    }

    private static int count2(String st, int vidx, int count) {
        if(vidx>=st.length()-2){
            return count;
        }
        if(st.charAt(vidx)=='a' && st.charAt(vidx)==st.charAt(vidx+1)&&st.charAt(vidx+1)==st.charAt(vidx+2)){
            int temp = count2(st,vidx+3,count+1);
            return temp;
        }
        else{
            int temp = count2(st,vidx+1,count);
            return temp;
        }
       
    }

    private static int count1(String st, int vidx, int count) {
        if(vidx==st.length()-2){
            return count;
        }
        if(st.charAt(vidx)=='a' && st.charAt(vidx)==st.charAt(vidx+1)&&st.charAt(vidx+1)==st.charAt(vidx+2)){
            int temp=count1(st,vidx+1,count+1);
            return temp;
        }else{
            int temp=count1(st,vidx+1,count);
            return temp;
        }
    }
}
