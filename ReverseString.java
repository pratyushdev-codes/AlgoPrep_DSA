import java.util.*;
public class ReverseString {
    public static void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb = sb.reverse();
        sb.getChars(0, sb.length(), s, 0);
    }
    
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original string: " + Arrays.toString(s));
 
        reverseString(s);
        System.out.println("Reversed string: " + Arrays.toString(s));
    }
}
