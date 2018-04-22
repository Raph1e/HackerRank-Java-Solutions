import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = s.substring(0, k);
        largest  = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String mys = s.substring(i, i + k);
            if (smallest.compareTo(mys) > 0){
                smallest = mys;
            }
            if (largest.compareTo(mys) < 0) {
                largest = mys;
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}