package Java.Nexts;

import java.util.Scanner;

/**
 * Created 2017/05/25.
 */
public class Main6 {
  public static void main(String[] args){
    String word = "123 test";
    Scanner sc = new Scanner(word);
    int num     = sc.nextInt(); 
    String line = sc.nextLine();

    System.out.println(word);
    //実行結果:123test

    System.out.println(num);
    //実行結果：123
    
    System.out.println(line);
    //実行結果: test

  }
}
