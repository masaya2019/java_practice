public class App02 {
  public static void main(String[] args) throws Exception {
    int[] seq = new int[10];

    // 塩基配列ランダム生成
    for (int i = 0; i < seq.length; i++) {
      // 0~3をランダムに生成
      seq[i] = new java.util.Random().nextInt(4);
    }

    // 塩基配列を記号表示
    // for (int i = 0; i < seq.length; i++) {
    // switch (seq[i]) {
    // case 0:
    // System.out.print("A ");
    // break;
    // case 1:
    // System.out.print("T ");
    // break;
    // case 2:
    // System.out.print("G ");
    // break;
    // case 3:
    // System.out.print("C ");
    // break;
    // }
    // }
    char[] base = { 'A', 'T', 'G', 'C' };
    for (int i = 0; i < seq.length; i++) {
      System.out.print(base[seq[i]] + " ");
    }
  }
}
