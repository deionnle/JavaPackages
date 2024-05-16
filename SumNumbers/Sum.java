package SumNumbers;
import CubeNumber.Cube;

public class Sum {
    public static long sumnum(long x) {
        long n = Cube.cubenum(x);
        long sum = 0;
        for( long i = 1; i <= n; i ++ ) {
            sum += i;
        }
        return sum;
    }
}
