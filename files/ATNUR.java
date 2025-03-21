import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner uwu = new Scanner (System.in);
        int a, b, r;
        a = uwu.nextInt ();
        b = uwu.nextInt ();
    
        r = add (a, b);
    }
}
int y;
class add (int m, int n) {
    if (n == 0)
        return m;
        y = add (m, n-1) + 1;
        return y;
}