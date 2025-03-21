import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner uwu = new Scanner (System.in);
        
    int i, c = 0, n, sum = 0, avg;
    
        for (i = 0; n != -1; i++) {
            n = uwu.nextInt ();
            sum = sum + n;
            c++;
        }
        avg = sum / (c - 1);
        System.out.print ("Average = " + avg);
    }
}

