package algs1;

/**
 * Created by Vasiliy Kylik on 28.06.2017.
 */
public class FactorialAlgorithm {
  public static int fact(int x) {
    if (x == 1) return 1;
    return x * fact(x - 1);
  }

  public static void main(String[] args) {
    System.out.println(fact(12));
  }
}
