import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner uwu = new Scanner (System.in);
        int i, a [5] = {1, 2, 3, 4, 5};
    
        int max = a [0];
        for (i = 1; i < 5; i++) {
        if (max < a [i]) {
            max = a [i];
        }
    }
    System.out.print ("Min = " + min);
    }
}

