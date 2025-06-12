// Enter a number and print it back


import java.util.Scanner;
public class Print_user_Input
{
    public static void method(Scanner sc)
    {
        System.out.print(sc.nextInt());
    }
    public static void main(String[] args)
    {
        method(new Scanner(System.in));  
    }
}