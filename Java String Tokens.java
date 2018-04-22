import java.io.*;
import java.util.*;
import org.apache.commons.lang.ArrayUtils;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        
        if(s.length()==0){
            System.out.println(0);
            return;
        }
        
        String[] parts = s.split("[^a-zA-Z]+");
        
        System.out.println(parts.length);
        for(String returnval : parts){
            System.out.println(returnval);
        }
    }
}