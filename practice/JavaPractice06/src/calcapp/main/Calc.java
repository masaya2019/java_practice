package calcapp.main;

import calcapp.logics.*;

public class Calc {
  public static void main(String[] args) throws Exception {
    int a = 10;
    int b = 2;
    // importによりcalcapp.logics.が不要になる（つけてもよい）
    // int total = calcapp.logics.CalcLogic.tasu(a, b);
    // int delta = calcapp.logics.CalcLogic.hiku(a, b);
    int total = CalcLogic.tasu(a, b);
    int delta = CalcLogic.hiku(a, b);

    System.out.println("足すと" + total + "引くと" + delta);
  }
}
