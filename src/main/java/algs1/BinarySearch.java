package algs1;

import static java.lang.Math.*;

/**
 * Created by Vasiliy Kylik on 28.06.2017.
 */
public class BinarySearch {

  public static int bSearch(int[] numbers, int value) {
    int low = 0;
    int high = numbers.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (value == numbers[mid]) {
        System.out.println("Value " + value + " is located at index of " + mid);
        return 0;
      } else if (value > numbers[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return 1;
  }

  public static void squareBruteForce(double a) {
    double epsilon = 0.01;
    int numGuesses = 0;
    double ans = 0.0;
    while (abs(pow(ans, 2) - a) >= epsilon)// ans*ans
    {
      ans += 0.00001;
      numGuesses += 1;
    }
    if (abs(pow(ans, 2) - a) >= epsilon) {
      System.out.println("failed " + numGuesses);
    } else {
      System.out.println(ans + " close to square root of "
              + a + " with " + numGuesses + " number of guesess");
    }
  }

  public static void square_BinarySearch(double a) {
    double epsilon = 0.01;
    double low = 0.0;
    double high = a;
    int guesses = 0;
    double guess = (high + low) / 2.0;
    while (abs((pow(guess, 2)) - a) >= epsilon) {
      if (pow(guess, 2) < a) {
        low = guess;
      } else {
        high = guess;
      }
      guess = (high + low) / 2.0;
      guesses+=1;
    }
    System.out.println(guess + " is close to square root of "
            + a + ". Guesses:" + guesses);
  }

  public static void main(String[] args) {
    int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    bSearch(nums, 8);
    squareBruteForce(41.235554);
    square_BinarySearch(4123424234.235554);
  }
}
