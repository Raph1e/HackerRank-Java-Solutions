import java.util.Scanner;
public class Solution {
    public static String getDay(String day, String month, String year) {
        int D = Integer.valueOf(day);
        int M = Integer.valueOf(month);
        int Yr = Integer.valueOf(year);
        int C = 20;
        int Y = 0;
        
        if (M>=3 && M<=12) {
            M = M-2;
            Y = Yr%100;
            C = Yr/100;
        }
        else {
            M = M+10;
            Y = (Yr-1)%100;
            C = Yr/100;
        }
        
        if(Yr>2000 && Yr<3000)
        {
            double numday = D+((13*M-1)/5)+Y+(Y/4)+(C/4)-2*C;
            while(numday<0) {
                numday += 7;
            }
            int rem = (int)numday%7;
            switch (rem) {
                case 3 : return("WEDNESDAY");

                case 4 : return("THURSDAY");

                case 5 : return("FRIDAY");

                case 6 : return("SATURDAY");

                case 0 : return("SUNDAY");

                case 1 : return("MONDAY");

                case 2 : return("TUESDAY");

                default: return("Something went wrong with formula.");
            }
        }
        else
            return("Year out of range.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
    
