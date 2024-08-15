package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use
 * Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    if (i == null || n == null || i < 0 || n < 0) {
      return Option.none();
    }

    if (n == 0) {
      return Option.some(1);
    }

    if (i == 0) {
      return Option.some(0);
    }

    try {
      int res = 1;
      for (int j = 0; j < n; j++) {
        if (res > Integer.MAX_VALUE / i)
          return Option.none();
        res *= i;
      }
      return Option.some(res);

    } catch (Exception e) {

      return Option.none();
    }
  }
}
