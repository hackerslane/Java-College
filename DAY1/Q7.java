//Sum of first N natural numbers using while loop

package DAY1;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        System.out.print("Enter the number -: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
            
        }

        System.out.println("So the sum of first "+n+" natural numbers is "+sum);

        sc.close();
    
}
}
