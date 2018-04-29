import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

                //Write your code here
        Comparator<String> compare_string = new Comparator<String>(){
            public int compare(String s1, String s2){
                BigDecimal d1 = new BigDecimal(s1);
                BigDecimal d2 = new BigDecimal(s2);
                
                return d2.compareTo(d1);
            }
        };

        Arrays.sort(s,0,n,compare_string);

                //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
