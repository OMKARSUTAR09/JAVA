public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; 

        int t1 = 0;
        int t2 = 1;

        System.out.print(t1 + " " + t2 + " ");

        for (int i = 2; i < n; i++) {
            int nextTerm = t1 + t2;
            System.out.print(nextTerm + " ");
            t1 = t2;
            t2 = nextTerm;
        }
    }
}
