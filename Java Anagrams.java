import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char[] charArray_a = a.toCharArray();
        Arrays.sort(charArray_a);
        a = new String(charArray_a);
        
        char[] charArray_b = b.toCharArray();
        Arrays.sort(charArray_b);
        b = new String(charArray_b);
        if(a.compareTo(b)==0) return true;
        else return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}