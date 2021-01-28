public class Hero {
  String name;
  int hp;

  // 眠る
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠ってHPを回復した！");
  }

  // 座る
  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "回復した");
  }

  // 滑る
  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んでしまった！");
    System.out.println("５のダメージ！");
  }

  // 逃げる
  public void run() {
    System.out.println(this.name + "は、逃げ出した");
    System.out.println("GAME OVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}
