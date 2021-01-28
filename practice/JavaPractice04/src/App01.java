public class App01 {
  public static void main(String[] args) throws Exception {
    // 配列変数の宣言
    // int[] scores;
    // int型の要素を５つ作成し、scoresに代入（全て0で初期化される）
    // scores = new int[5];
    int[] scores = new int[5];
    // 配列の要素数
    int num = scores.length;
    System.out.println("配列の要素数は" + num);

    scores[1] = 30;
    // 0が出力される（エラーにならない）
    System.out.println("scores[0]の中身は" + scores[0]);
    System.out.println("scores[1]の中身は" + scores[1]);

    int scores1[] = { 20, 30, 40, 50, 80 };
    int[] scores2 = { 20, 30, 40, 50, 80 };

    // ループ
    for (int i = 0; i < scores1.length; i++) {
      System.out.println("scores1[" + i + "]の中身は" + scores1[i]);
    }

    // 合計点
    int sum = 0;
    // カウント
    int count = 0;
    for (int i = 0; i < scores2.length; i++) {
      sum += scores2[i];
      if (scores2[i] >= 50) {
        count++;
      }
    }
    // 平均点
    int avg = sum / scores2.length;
    System.out.println("合計点：" + sum + "平均点：" + avg);
    System.out.println("50点以上の科目の数は" + count);
  }
}
