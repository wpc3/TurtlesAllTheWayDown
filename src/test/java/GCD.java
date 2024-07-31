import java.time.Duration;
import java.time.Instant;

public class GCD {


        // recursive implementation
        public static int gcd(int p, int q) {
            if (q == 0) return p;
            else return gcd(q, p % q);
        }

        //non-recursive
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

//    public static long compareMethod(){
//        Instant start = Instant.now();
//        // CODE to be timed goes HERE
//
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start, finish).toMillis();
//        return timeElapsed;
//    }

    public static void main(String[] args) {
        int a = 900000000;
        int b = 300000000;

        Instant start = Instant.now();
        int gcd1 = GCD.gcd(a,b);
        Instant finish = Instant.now();
        long timeElasped = Duration.between(start,finish).toMillis();
        System.out.println("GCD: " + gcd1);
        System.out.println("Time taken for GCD1 " + timeElasped);


         start = Instant.now();
        int gcd2 = GCD.gcd2(a,b);
        finish = Instant.now();
         timeElasped = Duration.between(start,finish).toMillis();
        System.out.println("GCD2: " + gcd2);
        System.out.println("Time taken for GCD2 " + timeElasped);


    }

}
