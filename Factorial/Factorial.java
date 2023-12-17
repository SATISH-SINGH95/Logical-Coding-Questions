import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value to find factorial : ");

        Integer factorial = 1;

        Integer number = scan.nextInt();
        for(int i=1; i<=number; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);

    }
}