public class App04 {
  public static void main(String[] args) throws Exception {
    // 2行（→）3列（↓）
    // int[][] scores = new int[2][3];
    // scores[0][0] = 40;
    // scores[0][1] = 50;
    // scores[0][2] = 60;
    // scores[1][0] = 80;
    // scores[1][1] = 60;
    // scores[1][2] = 70;
    int[][] scores = { { 40, 50, 60 }, { 80, 60, 70 } };
    // {},{}の２つ
    System.out.println(scores.length);
    // 40, 50, 60の３つ
    System.out.println(scores[0].length);
  }
}
