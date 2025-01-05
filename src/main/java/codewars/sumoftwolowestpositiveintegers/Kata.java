package codewars.sumoftwolowestpositiveintegers;

public class Kata {

    public static long sumTwoSmallestNumbers(long[] numbers) {
        long smallest = Long.MAX_VALUE;
        long secondSmallest = Long.MAX_VALUE;

        for (long number : numbers) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest) {
                secondSmallest = number;
            }
        }
        return smallest + secondSmallest;
    }

}
