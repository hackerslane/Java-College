// Check whether a number is divisible by 5 and 11 using if-else

package DAY1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.print("Enter the number -: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n%5==0 && n%11==0)
        System.out.print("Yes "+n+" is divisible by 5 and 11");

        else
        System.out.print("No "+n+" is not divisible by 5 and 11");
     

        

        sc.close();
    
}
    
}
