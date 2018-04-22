import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
            Locale indLoc = new Locale("en", "IN");
            NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat ind  = NumberFormat.getCurrencyInstance(indLoc);
            NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat frn = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + ind.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + frn.format(payment));
    }
}