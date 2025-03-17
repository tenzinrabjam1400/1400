import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 120; 
        // boolean[] isPrime = new boolean[n + 1];
//         Arrays.fill(isPrime, true);
//         isPrime[0] = isPrime[1] = false; 
//         for (int i = 2; i * i <= n; i++) {
//             if (isPrime[i]) {
//                 for (int j = i * i; j <= n; j += i) {
//                     isPrime[j] = false;
//                 }
//             }
//         }
// 
//         System.out.println("Prime numbers up to " + n + ":");
//         for (int i = 2; i <= n; i++) {
//             if (isPrime[i]) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();
        sieveOfEratosthenes(n);
    }

    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; 
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
