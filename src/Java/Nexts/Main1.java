package Java.Nexts;

import java.util.*;

/**
 * Created 2017/05/23.
 * * sc.next()とsc.nextLine()の違いが気になったのでそのサンプルコード
 */
public class Main1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> ary = new ArrayList<String>();
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      String word = sc.nextLine();
      ary.add(word);
    }
    System.out.println(ary);
  }
}

/*
で、入力を以下のようにする
2
a
(本当はbまで打ちたい）
出力結果
[, a]
一番最初のやつなんやねん問題が浮上する、というか入力できねえ！っていう感じ
Main2の書き方、sc.next()を使う場合はこれが起きないのだ
この挙動の違いについて、Qiitaにも乗っけておこう
 */

/*
なんでこんな現象になるのか
とりあえず重要なこととして、.nextLine()は空白（空行）も読み込む
.next()は空白（空行は含まない）っていうのが重要らしいけど
入力の時に空行入れてないんだよなあ（白目）
あ、スキャナーの現在位置ってsc.nextInt()；だから、これが反映されてるのか！？
じゃあstringじゃなくて、int型にすれば挙動が分かるかも
えー、int型だと意味なかった模様うーん
それどころか空白すら発生しなかったえー、nextInt();とも挙動違うの！？
 */

/*
やっと原因が分かった、スキャナーの使いまわしが不味かったのか！
scannerは現在の位置を返す、.nextLine()は空白（空行）も読み込むのあわせ技でこの挙動が起きたのか
原因としては
1:ループ処理に入った段階で、
String word = sc.nextLine()
これが最初に読み込むのは、入力された物ではなく、
int num = sc.nextInt();
が読み込まれる、しかしこの時の値2はnumに格納されており、
すでに空行の状態になっている
しかし、nextLineは空行も読み込むので、そのまま処理が続行され
配列には空文字が格納される
この段階で1回目のループが終了する
ここから入力を受け取ってaryに追加するっていう挙動になる
少し分かりやすくした例を書いてMain5,Main6に記載予定

 */