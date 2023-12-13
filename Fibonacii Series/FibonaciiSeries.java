import java.util.Scanner;

public class FibonaciiSeries{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number till you want fibonacii terms : ");
        Integer n = scan.nextInt();

        Integer firstTerm = 0;
        Integer secondTerm = 1;

        if(n<=0){
            System.out.println("Please enter the number greater than 0");
        }else if(n==1){
            System.out.println(firstTerm);
        }else{
            System.out.println(firstTerm);
            System.out.println(secondTerm);
            for(int i=2; i<n; i++){
                Integer nextTerm = firstTerm + secondTerm;
                System.out.println(nextTerm);

                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }

}