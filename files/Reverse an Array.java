import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner uwu = new Scanner (System.in);
        int c, d, n, a [100], b [100];
    
        for (c = 0; c < n; c++) {
            a [c] = uwu.nextInt ();
        }
        for (c = n - 1, d = 0; c >= 0; c--, d++) {
            b [d] = a [c];
        }
        for (c = 0; c , n; c++) {
            System.out.print (" " + a [c]);
        }
    }
}

