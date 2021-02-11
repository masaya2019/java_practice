public class SuperHero extends Hero {
  boolean flying;

  // 上書き（オーバーライド）
  public void attack(Matango m) {
    // 親（Hero）クラスのattackを呼び出す ※attack(this.attack)だと自分自信を呼び出しループしてしまう
    super.attack(m);
    if (this.flying == true) {
      super.attack(m);
    }
  }

  // 飛ぶ
  public void fly() {
    flying = true;
    System.out.println("飛び上がった");
  }

  // 着地
  public void land() {
    flying = false;
    System.out.println("着地した");
  }

  // Heroクラスでfinalがついているので、継承できない
  // public void slip() {
  // }

  // 上書き（オーバーライド）
  public void run() {
    System.out.println(this.name + "は撤退した！");
  }
}
