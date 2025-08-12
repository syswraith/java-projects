import java.util.Scanner;

public class LargestThreeInt
{
    public static void main(String[] args)
    {
        int i, j, k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        i = scanner.nextInt();
        System.out.print("> ");
        j = scanner.nextInt();
        System.out.print("> ");
        k = scanner.nextInt();
        if (i > j)
        {
            if (i > k) { System.out.println(i); }
            else { System.out.println(k); }
        }
        else
        {
            if (j > k) {System.out.println(j); }
            else { System.out.println(k); }
        }
    }
}
