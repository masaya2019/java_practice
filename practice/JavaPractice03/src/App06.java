public class App06 {
  public static void main(String[] args) throws Exception {
    System.out.print("【数当てゲーム】");
    // 0~9までの数字をランダム生成
    int ans = new java.util.Random().nextInt(10);
    // 5回繰り返す
    for (int i = 0; i < 5; i++) {
      System.out.println("0~9の数字を入力してください");
      // 数字を入力
      int num = new java.util.Scanner(System.in).nextInt();
      // あたりの数字と入力された数字が等しいとき
      if (ans == num) {
        System.out.println("アタリ！");
        // for文を抜ける（ゲームを終了）
        break;
      } else {
        System.out.println("違います");
      }
      // 5回間違えたら答えを表示
      if (i == 4) {
        System.out.println("正解は" + ans + "でした");
      }
    }
    System.out.println("ゲームを終了します");
  }
}