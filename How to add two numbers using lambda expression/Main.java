public class Main {
    public static void main(String[] args) {

        Addition addition = (a,b)-> a+b;

        int result = addition.sum(10, 20);
        System.out.println(result);
    }
}
