package Java.Nexts;

import java.util.Scanner;

/**
 * Created 2017/05/25.
 */
public class Main7 {
  public static void main(String[] args){
    String word = "123 test";
    Scanner sc = new Scanner(word);
    int num     = sc.nextInt();
    String word2 = sc.next();
    
    //String line = sc.nextLine();
    //ちゃんとエラーが出る
    //Exception in thread "main" java.util.NoSuchElementException: No line found

    System.out.println(word);
    //実行結果:123test

    System.out.println(num);
    //実行結果：123

    System.out.println(word2);
    //実行結果:test

    //System.out.println(line);
    //実行結果: 上のエラーのせいでそもそも実行されない

  }
}
