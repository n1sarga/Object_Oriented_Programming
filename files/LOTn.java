import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner uwu = new Scanner (System.in);
        float a, b, c;
        a = uwu.nextInt ();
        b = uwu.nextInt ();
        c = uwu.nextInt ();
        
    if(a >= b && a >= c)
    {
        System.out.print("Largest number = " + a);
    }
    else if(b >= a && b >= c)
    {
        System.out.print("Largest number is = " + b);
    }
    else
    {
        System.out.print("Largest number is = " + c);
    }
    return 0;
}
