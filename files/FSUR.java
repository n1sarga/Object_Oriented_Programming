import java.util.Scanner;
class printFibo (int);
public class Main
{
    public static void main(String[] args) {
        Scanner uwu = new Scanner (System.in);
        int k, n;
        longint i = 0, j = 1;
        n = uwu.nextInt ();
        printFibo (n);
    }
}
class printFibo (int aj) {
    statuc long int first = 0, second = 1, sum;
    if (aj > 1) {
        sum = first + second;
        first = second;
        System.out.print (sum);
    }
    else {
        System.out.println();
    }
}