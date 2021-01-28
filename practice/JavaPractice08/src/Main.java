public class Main {
  public static void main(String[] args) throws Exception {
    // 勇者を生成
    Hero h = new Hero();
    // 初期設定
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "が誕生しました！");

    // お化けキノコAを生成
    Matango m1 = new Matango();
    // 初期設定
    m1.hp = 50;
    m1.suffix = 'A';
    System.out.println("お化けキノコ" + m1.suffix + "があらわれた！");

    // お化けキノコAを生成
    Matango m2 = new Matango();
    // 初期設定
    m2.hp = 50;
    m2.suffix = 'B';
    System.out.println("お化けキノコ" + m2.suffix + "があらわれた！");

    // クレリックを生成
    Cleric c = new Cleric();
    // 初期設定
    c.name = "ミナミ";
    System.out.println("クレリック" + c.name + "が誕生しました！");

    // 行動を指示
    h.slip();
    c.selfAid();
    c.pray(1);
    c.selfAid();
    c.pray(10);
    m1.run();
    m2.run();
    h.run();
  }
}
