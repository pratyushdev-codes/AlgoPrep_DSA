import java.util.*;
public class InsertAsciiDifference{
    public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
		String st=scn.nextLine();
		System.out.println(insert(st));
	}

	private static String insert(String st) {
		String ans = "";
		
		for(int i=0;i<st.length()-1;i++){
			char ch1 = st.charAt(i);
			ans = ans + ch1;
			int temp = st.charAt(i+1)-st.charAt(i);
			ans = ans + temp;
		}
		
        ans = ans + st.charAt(st.length()-1);
        return ans;

    }
}
