public class Matango {
  int hp;
  final int LEVEL = 10;
  char suffix;

  public Matango(char suffix) {
    this.suffix = suffix;
  }

  public void attack(Hero h) {
    System.out.println("キノコ" + this.suffix + "の攻撃！");
    h.hp -= 10;
    System.out.println("１０ダメージ");
  }

  public void run() {
    System.out.println("お化けキノコは" + this.suffix + "は逃げ出した！");
  }
}
