public class Cleric {
  String name;
  final int MAX_HP = 50;
  int hp = 50;
  final int MAX_MP = 10;
  int mp = 10;

  public void selfAid() {
    System.out.println(this.name + "はセルフエイドを唱えた");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("HPが最大値まで回復した");
  }

  public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間祈った");
    // MP回復量（sec + 0~2）
    int recover = sec + new java.util.Random().nextInt(3);
    // 最大MPを超えるかどうか
    if (this.mp + recover >= MAX_MP) {
      recover = MAX_MP - this.mp;
    }
    // MP回復
    this.mp += recover;
    System.out.println("MPが" + recover + "回復した");
    // 回復値を返す
    return recover;
  }
}
