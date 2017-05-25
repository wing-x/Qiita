package Java.Nexts;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/05/25.
 * やっと原因が分かった感
 */
public class Main4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    ArrayList<String> ary = new ArrayList<String>();
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      String word = sc2.nextLine();
      ary.add(word);
    }
    System.out.println(ary);
  }
}
//これで正しく動いたーーーー！
/*
問題の原因はまだ完全に理解仕切れてないけど、何となくは分かった
scを使いまわしてたせい、ってのが一番大きいなこれ
ってかヤフー知恵袋に全く同じ質問あるやんっていう
https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q1325952893
 */