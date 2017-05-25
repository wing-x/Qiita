package Java.Nexts;

import java.util.Scanner;

/**
 * Created 2017/05/25.
 * nextLineの挙動とか
 */
public class Main5 {
   public static void main(String[] args) {
      String word = "123 test";
      Scanner sc = new Scanner(word);
      String line = sc.nextLine();

      System.out.println(word);
      //実行結果:123 test
      System.out.println(line);
      //実行結果:123 test
   
   }
}
//System.inでキーボートからの入力を受け付けるという風に引数で定義している
//Scanner sc = new Scanner(System.in)；
//なので引数として変数名を指定すればそれが使える
//これが基本！