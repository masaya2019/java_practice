public class Hero {
  String name;
  int hp;
  Sword sword;

  // コンストラクタ
  public Hero() {
    // 初期HPは100
    // this.hp = 100;
    // this.name = "ダミー";
    this("ダミー");
  }

  public Hero(String name) {
    // 初期HPは100
    this.hp = 100;
    this.name = name;
  }

  public void attack() {
    System.out.println(this.name + "は" + sword.name + "で攻撃した！");
  }
}
