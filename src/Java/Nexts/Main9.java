package Java.Nexts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/05/25.
 * もっとスマートなやり方をQiitaで教えてもらう
 */
public class Main9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> ary = new ArrayList<String>();
    int num = Integer.parseInt(sc.nextLine());    //Integer.parseIntを使って、完全な数値に変換してしまえばnextLineで読み込める
    for (int i = 0; i < num; i++) {
      String word = sc.nextLine();
      ary.add(word);
    }
    System.out.println(ary);
  }
}
