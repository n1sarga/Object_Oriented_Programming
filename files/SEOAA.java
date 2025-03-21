import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner uwu = new Scanner (System.in);
        int i, a [5] = {1, 2, 3, 4, 5};
    
        int min = a [0];
        for (i = 1; i < 5; i++) {
        if (min > a [i]) {
            min = a [i];
        }
    }
    System.out.print ("Min = " + min);
    }
}

