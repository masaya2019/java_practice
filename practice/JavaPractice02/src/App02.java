public class App02 {
  public static void main(String[] args) throws Exception {
    // byte < short < int < long < float < double
    // int < double（int不可）
    double x = 3 + 5.0;
    // double > float
    double d = 2.0F;
    // String型なのでint不可
    String number = "5";
    // int -> String
    String s = 2 + "人目";
    // -128 < byte < 127
    byte b = 1;
    // true/falseはboolean（double不可）
    boolean b2 = true;
    // short > byte
    short s2 = (byte) 2;
  }
}
