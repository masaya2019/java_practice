import java.util.Random;

public class App03 {
  public static void main(String[] args) throws Exception {
    System.out.println("♰ ♰ ♰ ようこそ占いの館へ ♰ ♰ ♰");
    System.out.println("あなたの名前を入力してください");
    System.out.print("> ");
    // （名前を入力）キーボードから1行文字列の入力を受け付ける
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    System.out.print("> ");
    // （年齢を入力）キーボードから1行文字列の入力を受け付ける
    String age = new java.util.Scanner(System.in).nextLine();
    // 0~3の乱数を生成
    int fortune = new java.util.Random().nextInt(4);
    // インクリメント
    fortune++;
    System.out.println("占いの結果が出ました！");
    System.out.println(age + "歳の" + name + "さんの運気番号は" + fortune + "です！");
    System.out.println("１：大吉、２：中吉、３：吉、４：凶");
  }
}
