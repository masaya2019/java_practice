public class App {
  public static void main(String[] args) throws Exception {

    Hero h = new Hero();
    h.run();

    SuperHero sh = new SuperHero();
    sh.run();

    Weapon w = new Weapon();

    System.out.println(w.name + "の値段は" + w.price + "円です。");

    PoisonMatango pm = new PoisonMatango('A');

    pm.attack(h);

    pm.attack(h);
  }
}
