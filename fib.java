public class fib {

    public static void main(String[] args) {
    System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n-2) + fibonacci(n-1);
        } else if (n == 1) {
            return 1;
        } else {
            return 0;
        }
    }

}
