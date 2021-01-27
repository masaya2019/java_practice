public class App03 {
  public static void main(String[] args) throws Exception {
    // 0~1を生成
    int isHungry = new java.util.Random().nextInt(2);
    String food = "ハンバーガー";
    // if (isHungry == 0) {
    // System.out.println("お腹がいっぱいです");
    // } else {
    // System.out.println("はらぺこです");
    // }
    System.out.println(isHungry == 0 ? "お腹がいっぱいです" : "はらぺこです");

    if (isHungry == 1) {
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");
  }
}
