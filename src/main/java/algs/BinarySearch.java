package algs;

/**
 * Created by Стрела on 24.01.2017.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,12,23,34,55,61,67,88,89,101 };
        System.out.println(rank(55, arr));
    }

    public static int rank(int val, int[] arr) {
        return rank(val, arr, 0, arr.length-1);
    }

    private static int rank(int val, int[] arr, int lo, int hi) {
        if (lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if (val < arr[mid]) {
            return rank(val, arr, lo, mid - 1);
        } else if (val > arr[mid]) {
            return rank(val, arr, mid + 1, hi);
        } else {
            return mid;
        }
    }
}
