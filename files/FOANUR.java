import java.util.Scanner;
class fact (int);
public class Main
{
    public static void main(String[] args) {
        Scanner uwu = new Scanner (System.in);
        int num, f;
        num = uwu.nextInt ();
        f = fact (num);
    }
}
class fact (int aj) {
    if (aj == 1 || aj == 0)
        return 1;
    else 
        return (aj * fact (aj - 1));
}