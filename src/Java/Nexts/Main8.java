package Java.Nexts;

import java.util.Scanner;

/**
 * Created 2017/05/25.
 */
public class Main8 {
  public static void main(String[] args){
    String word = "123 test\n";
    Scanner sc = new Scanner(word);
    int num     = sc.nextInt();

    String word2 = sc.next();

    String line = sc.nextLine();
  
    System.out.println(word);//
    //実行結果:123test
    //
    //上に空白（改行）が入る
    
    System.out.println(num);
    //実行結果：123

    System.out.println(word2);
    //実行結果:test

    System.out.println(line);
    //実行結果: (空白）
    //空白だけど、実際には空行を読み込んでいるので、Lineが存在していないわけじゃない→エラーを吐かないのだ！
    //ここのSystem.out.println(line);にデバッグをつけて実行すると非常に分かりやすいぞ！

  }
}
