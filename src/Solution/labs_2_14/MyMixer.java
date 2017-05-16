package Solution.labs_2_14;

public class MyMixer<T> {
  T[] arr;

  MyMixer(T[] arr) {
    this.arr = arr;
  }

  T[] shuffle() {
    T value;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        if (i + 1 != arr.length) {
          value = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = value;
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    Integer[] intARR = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    String[] strARR = {"one", "two", "three", "fore", "five", "six", "seven"};

    MyMixer mixerInt = new MyMixer<>(intARR);
    MyMixer mixerString = new MyMixer<>(strARR);

    System.out.println("\nshuffled Ints: ");
    Object[] shuffledInts = mixerInt.shuffle();
    for (Object o : shuffledInts)
      System.out.print(" " + o + " ");

    System.out.println("\n\nshuffled Strings: ");
    Object[] shuffledStrings = mixerString.shuffle();
    for (Object o : shuffledStrings)
      System.out.print(" " + o + " ");

  }
}