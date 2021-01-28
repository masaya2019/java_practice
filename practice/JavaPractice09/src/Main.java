public class Main {
  public static void main(String[] args) throws Exception {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Hero h1 = new Hero();
    h1.name = "ミナト";
    // h1.hp = 100;
    h1.sword = s;

    Hero h2 = new Hero();
    h2.name = "アサカ";
    // h2.hp = 100;

    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;

    System.out.println(h1.name + "の現在の武器は、" + h1.sword.name);
    h1.attack();

    w.heal(h1);
    w.heal(h2);
    w.heal(h2);

    Hero h3 = new Hero("ミナト");
    System.out.println(h3.hp + " " + h3.name);

    Hero h4 = new Hero();
    System.out.println(h4.name);
  }
}
