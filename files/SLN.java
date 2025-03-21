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
        if(b >= c)
        {
            System.out.print("2nd largest number = "+ b);
        }
        else
        {
            System.out.print("2nd largest number = "+ c);
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            System.out.print("2nd largest number = "+a);
        }
        else
        {
            System.out.print("2nd largest number = "+c);
        }
    }

    else if(a >= b)
    {
        System.out.print("2nd largest number = " + a);
    else
    {
        System.out.print("2nd largest number = " + b);
    }
}
}
