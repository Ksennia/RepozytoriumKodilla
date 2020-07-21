package stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static void getAverage(int[] numbers) {

        System.out.println(IntStream.range(0, numbers.length));
        OptionalDouble medium = IntStream.range(0, numbers.length).average();

    }
}
