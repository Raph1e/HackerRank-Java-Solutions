import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}