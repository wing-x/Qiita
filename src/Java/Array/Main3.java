package Java.Array;

import java.util.Arrays;

/**
 * Created 2017/05/24.
 * Main3では通常のArrayにおける、多次元配列を作成した時の挙動一覧
 */
public class Main3 {
  public static void main(String[] args){
    //宣言と作成
    int [][] num = new int[2][3];
    
    //値の格納
    num[0][0] = 1;
    num[0][1] = 2;
    num[0][2] = 3;
    num[1][0] = 10;
    num[1][1] = 11;
    num[1][2] = 12;
    
    //値の取り出し方
    System.out.println(num[0][0]);
    //実行結果:1
    System.out.println(num[1][2]);
    //実行結果:12
    
    //まとめて全部取り出す場合
    //forを使って2重ループさせる
    //iはnum全体の要素数、num.lengthでループ
    for(int i = 0; i < num.length; i++){
      //jは各配列の要素数、num[i].lengthまでループ
      for(int j = 0; j < num[i].length;j++){
        System.out.print(num[i][j] + " ");
        //実行結果：1 2 3 10 11 12 
      }
    }

    System.out.println(" ");
    
    //拡張forの場合
    //こちらも2重ループで書く
    //取り出すデータとして配列を指定する
    for(int[] index : num) {
      //次にその配列から中身を取り出す形にする
      for (int element : index) {
        System.out.print(element + " ");
        //実行結果：1 2 3 10 11 12 
      }
    }

    System.out.println(" ");
    
    //一括表示
    //多次元配列の場合はArrays.deepToString();を使う
    System.out.println(Arrays.deepToString(num));
    //実行結果:[[1, 2, 3], [10, 11, 12]]
  }
}
