package Assignment5;

import java.util.Arrays;

public class Median {
    public double findMedian(Float[] a, int n)
    {
        // First we sort the array
        Arrays.sort(a);
        // check for even case
        if (n % 2 != 0)
            return Math.ceil(a[n / 2]);

        return (a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
}
