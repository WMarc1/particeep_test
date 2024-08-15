package collection;

import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */

import java.util.stream.Collectors;

class CollectionTest {

  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    return input.stream().map(x -> Math.pow((x * 2) + 3, 5)).collect(Collectors.toList());
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    return input.stream()
        .map(res -> {
          if (res == null || res.isEmpty())
            return "";
          String result = res.substring(0, 1).toUpperCase() + res.substring(1).toLowerCase();
          return result + result;
        }).collect(Collectors.toList());
  }

}
