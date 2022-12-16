package KataLevel1;

import java.util.stream.IntStream;

public class Prime {
    public static boolean isPrime(int num) {
//        boolean result = true;
//        if (num <= 1) return false;
//        for (int i = 2; i < num; i++) {
//            if ( num % i == 0 ) {
//                result = false;
//                System.out.println("i: " + i + result );
//                return result;
//            } else  result = true;
//        }
//        return result;
        if (num <= 1) return false;
        return IntStream.range(2,num)
                .peek(System.out::print)
                .noneMatch(i -> num % i == 0);
    }

    public static void main(String[] args) {
        System.out.println("\nisPrime(4) = " + isPrime(7));
    }
}