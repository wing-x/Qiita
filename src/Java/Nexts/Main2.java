package Java.Nexts;

import java.util.*;

/**
 * Created 2017/05/23.
 */
public class Main2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> ary = new ArrayList<String>();
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      String word = sc.next();
      ary.add(word);
    }
    System.out.println(ary);
  }
}
/*
で、入力を以下のようにする
2
a
b
出力結果
[a, b]
*/