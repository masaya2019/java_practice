public class App01 {
  public static void main(String[] args) throws Exception {
    // 5-1
    introduceOneself();
    // 5-2
    email("test@test.com", "送信テスト", "送信テストメールです。確認したらご返信ください。");
    // 5-3
    email("test@test.com", "送信テストメールです。確認したらご返信ください。");
    // 5-4
    double bottom = 10.0;
    double height = 5.0;
    double radius = 5.0;
    System.out.println("底辺の長さが" + bottom + "、高さが" + height + "の三角形の面積は" + calcTriangleArea(bottom, height) + "cm2");
    System.out.println("底辺の長さが" + radius + "の円の面積は" + calcCircleArea(radius) + "cm2");
  }

  // 5-1
  public static void introduceOneself() {
    // 名前
    String name = "田中太郎";
    // 年齢
    int age = 20;
    // 身長
    double height = 170.5;
    // 十二支
    char animal = '寅';
    System.out.println("私の名前は" + name + "です。");
    System.out.println(age + "歳で" + animal + "年生まれです。");
    System.out.println("身長は" + height + "cmあります。");
  }

  // 5-2
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました。");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }

  // 5-3
  public static void email(String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました。");
    System.out.println("本文：" + text);
  }

  // 5-4
  // 三角形の面積
  public static double calcTriangleArea(double bottom, double height) {
    return (bottom * height) / 2;
  }

  // 円の面積
  public static double calcCircleArea(double radius) {
    return radius * radius * 3.14;
  }
}