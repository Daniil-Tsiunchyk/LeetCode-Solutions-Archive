import java.util.*;

public class Problem_380 {

  public static class RandomizedSet {

    private final Map<Integer, Integer> valueToIndexMap;
    private final List<Integer> values;
    private final Random random;

    public RandomizedSet() {
      valueToIndexMap = new HashMap<>();
      values = new ArrayList<>();
      random = new Random();
    }

    public boolean insert(int val) {
      if (valueToIndexMap.containsKey(val)) {
        return false;
      }
      valueToIndexMap.put(val, values.size());
      values.add(val);
      return true;
    }

    public boolean remove(int val) {
      if (!valueToIndexMap.containsKey(val)) {
        return false;
      }
      int index = valueToIndexMap.get(val);
      int lastElement = values.get(values.size() - 1);
      values.set(index, lastElement);
      valueToIndexMap.put(lastElement, index);
      values.remove(values.size() - 1);
      valueToIndexMap.remove(val);
      return true;
    }

    public int getRandom() {
      int randomIndex = random.nextInt(values.size());
      return values.get(randomIndex);
    }

    public static void main(String[] args) {
      RandomizedSet randomizedSet = new RandomizedSet();
      System.out.println(randomizedSet.insert(1));
      System.out.println(randomizedSet.remove(2));
      System.out.println(randomizedSet.insert(2));
      System.out.println(randomizedSet.getRandom());
      System.out.println(randomizedSet.remove(1));
      System.out.println(randomizedSet.insert(2));
      System.out.println(randomizedSet.getRandom());
    }
  }
}
