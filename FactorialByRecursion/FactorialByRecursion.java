import java.util.Scanner;

public class FactorialByRecursion{

    static int fact = 1;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any no to find factorial : ");
        int number = scan.nextInt();

        FactorialByRecursion f = new FactorialByRecursion();
        f.factorial(number);
        System.out.println(fact);

    }

    public void factorial(int number){
        if(number>=1){
            fact = fact * number;
            factorial(number - 1);
        }
    }
}