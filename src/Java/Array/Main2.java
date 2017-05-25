package Java.Array;

import java.util.ArrayList;

/**
 * Created 2017/05/24.
 * Main2ではArraysListの通常挙動について記載
 */
public class Main2 {
  public static void main(String[] args) {
    //ArrayListの作成方法
    //基本的な宣言
    //ArrayList<Integer> num = new ArrayList<Integer>();

    //JavaSE7以降の定義例
    ArrayList<Integer> num = new ArrayList<>();

    //補足
    //new ArrayList<>();の()は、数値を入れることで、配列の初期サイズを決めることが出来る
    
    //格納方法
    //addメソッドを使う
    //書き方としてはadd(格納したいデータ）、またはadd(インデックス（格納する位置),格納したいデータ)で記述する
    //基本的に順番に格納されていく
    //インデックス指定した際に、既に値が存在している場合,値を上書きするのではなく、一つ横にずれるように格納されるので注意
    num.add(1);
    num.add(1, 2);
    num.add(3);
    //num.add(2,4);
    //このように追記した場合、[1,2,4]でなく、[1,2,4,3]という配列になるので注意すること
    //もし値を更新する場合はnum.set(2,4);のように、.set()を使うと[1.2,4]が得られる

    //値の取り出し
    
    //get()メソッドを使う
    System.out.println(num.get(0));
    //実行結果：1
    

    //まとめ手取り出す
    //for文
    //ArrayListの場合は、要素数を得るには.size()を使う
    for (int i = 0; i < num.size(); i++) { 
      System.out.print(num.get(i) + " ");
      //実行結果:1 2 3
    }
    
    System.out.println(" ");

    //拡張for文
    for (int value : num) {
      System.out.print(value + " ");
      //実行結果:1 2 3
    }
    
    System.out.println(" ");

    //pメソッドのように一括表示する際は、そのままprintlnに突っ込めば良い
    System.out.println(num);
    //実行結果:[1, 2, 3]
  }
}
