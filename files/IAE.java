import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner uwu = new Scanner (System.in);
    int array[100], position, c, n, value;

    n = uwu.nextInt ();

    for(c = 0; c < n; c++)
        array[c] = uwu.nextInt ();

    position = uwu.nextInt ();

    value = uwu.nextInt ();

    for(c = n-1; c >= position-1; c--)
        array[c+1] = array[c];

    array[position - 1] = value;

    for(c = 0; c <= n; c++) 
        System.out.print("  "+ array[c]);
    }
}

