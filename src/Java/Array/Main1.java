package Java.Array;

import java.util.Arrays;

/**
 * Created 2017/05/24.
 * Main1では通常のArrayの挙動一覧
 */
public class Main1 {
  public static void main(String[] args) {
    
    //配列の作成の仕方
    //宣言方法その1
    
    //配列の型と名前を宣言
    //int[] num;  
    
    //使う領域を確保する
    //num = new int[3];             

    //宣言方法その2
    //上のやり方を同時に行う方法 
    int[] num = new int[3];               

    //配列への格納
    num[0] = 1;
    num[1] = 2;
    num[2] = 3;

    //作成から格納までまとめてやる場合
    // int[] num = {1, 2, 3};

    //配列の取り出し
    System.out.println(num[0]);
    //実行結果：1

    //まとめて全部取り出す方法

    // 通常のfor文でループさせる場合
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
      //実行結果：1 2 3
    }

    System.out.println(" ");                //実行後の見栄えのために入れてます

    //拡張for文を使う場合
    for (int value : num) {               
      //valueは任意の変数名,普通のforとは異なり、変数名をそのまま使う
      System.out.print(value + " ");      
      //実行結果：1 2 3
    }
    System.out.println(" ");                //同上

    //配列の中身を一括で表示する方法（Rubyで言うpメソッド的なやつ）
    // Arrays.toStringを使うと良い感じに出る
    //使用時の注意として、使う際はimport java.util.Arrays;の宣言が必要な事
    //もう一つは対象の配列が多次元配列の場合、Arrays.deepToStringと書かないといけない
    
    System.out.println(Arrays.toString(num));
    //実行結果：[1, 2, 3]

    //こうやって書くと謎の文字列になる
    System.out.println(num);
    //実行結果:[I@1540e19d


    //補則とか色々
    //Arrayでは最初に宣言した要素数を超えて格納することは出来ない
    //num[3] = 4;  //配列の4番目に4を格納するように書いても意味が無く、実際には入らない
    //System.out.println(num[3]);
    //挙動としてはコンパイルエラーは出ないが実行にエラーが出る
    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3という風に怒られる
    //また配列への格納宣言をしてない所、例えばnum[5]やnum[6]の値を表示させようとした場合にも同じエラーが出る
  }
}
