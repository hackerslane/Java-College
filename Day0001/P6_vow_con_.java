package Day0001;


import java.util.Scanner;

public class P6_vow_con_ {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character -: ");
        char ch=sc.next().toLowerCase().charAt(0);

        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(ch+" is vowel.");
            break;

            default:
            System.out.println(ch+" is consonant.");
        }


        sc.close();

    }
    
}
