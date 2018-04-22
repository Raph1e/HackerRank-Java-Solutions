import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i=0;
        while(read.hasNextLine()){
            i++;
            System.out.println(i + " " + read.nextLine());
        }
        
        read.close();
    }
}