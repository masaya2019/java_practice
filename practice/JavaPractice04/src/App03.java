public class App03 {
  public static void main(String[] args) throws Exception {
    int[] scores = { 20, 30, 40, 50, 80 };
    for (int value : scores) {
      System.out.println(value);
    }

    int[] arrayA = { 1, 2, 3 };
    // 同じアドレスを代入
    int[] arrayB = arrayA;
    arrayB[0] = 100;
    System.out.println(arrayA[0]);
  }
}
