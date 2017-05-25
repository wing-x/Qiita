package Java.Nexts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/05/25.
 * int型で試す
 */
public class Main3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ary = new ArrayList<>();
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      int num2 = sc.nextInt();
      ary.add(num2);
    }
    System.out.println(ary);
  }
}
