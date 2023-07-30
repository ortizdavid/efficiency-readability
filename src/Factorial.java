package src;

import java.util.stream.LongStream;

public class Factorial {

    public static long  factorial1(long number) {
        long result = 1L;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    public static long  factorial2(long  number) {
        if ((number == 0) || (number == 1)) {
            return 1L;
        } else {
            return number * factorial2(number - 1);
        }
    }

    public static long  factorial3(long  number) {
        return (number == 1) ? 1L : number * factorial3(number - 1);
    }

    public static long factorial4(long  number) {
        return LongStream.rangeClosed(2, number)
                    .reduce(1, (long a, long b) -> a * b);
    }

    public static long factorial5(long  number) {
        return LongStream.rangeClosed(2, number)
                    .parallel()
                    .reduce(1, (a, b) -> a * b);
    }

}
