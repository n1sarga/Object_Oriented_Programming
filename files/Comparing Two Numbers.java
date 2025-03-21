import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner uwu = new Scanner (System.in);
        int a = uwu.nextInt ();
        int b = uwu.nextInt ();
        
        if (a > b) {
            System.out.print ("Large = " + a);
            System.out.print ("Small = " + b);
        }
        else {
            System.out.print ("Large = " + b);
            System.out.print ("Small = " + a);
        }
    }
}
