import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner uwu = new Scanner (System.in);
        
        int n = uwu.nextInt ();
        int i;
    
        System.out.print ("Factors are ");
        for (i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.print (" " + i);
            }
        }

    }
}

