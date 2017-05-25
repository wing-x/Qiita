package Java.Array;

import java.util.ArrayList;

/**
 * Created 2017/05/24.
 *  * Main4ではArraysListの多次元での挙動について記載
 *  理解は出来るけど、扱い辛い
 */
public class Main4 {
  public static void main(String[] args){
    //二次元のArrayListの作り方
    //まずは普通のArrayListを2つ作成）
    ArrayList<Integer> num1 = new ArrayList(); 
    num1.add(1);
    num1.add(2);
    num1.add(3);
    
    System.out.println(num1);
    //実行結果:[1, 2, 3]
    
    ArrayList<Integer> num2 = new ArrayList<Integer>();
    num2.add(10);
    num2.add(11);
    num2.add(12);

    System.out.println(num2);
    //実行結果:[10, 11, 12]
    
    //次に格納するArrayListを作成します、宣言するデータ型に注目
    //データ型の宣言時に、格納するデータは「ArrayList<Integer>を格納します！」と宣言すれば入れられる
    ArrayList<ArrayList<Integer>> num_list =new ArrayList<>();
    num_list.add(num1);
    num_list.add(num2);
    
    //取り出し方
    //.get().get()で取り出し
    System.out.println(num_list.get(0).get(0));
    //実行結果:1
    System.out.println(num_list.get(0).get(2));
    //実行結果:3
    System.out.println(num_list.get(1).get(0));
    //実行結果:10
    
    //全部取り出す
    //for
    //iはnum全体の要素数、num.size()でループ
    for(int i = 0; i < num_list.size(); i++){
      //jは各配列の要素数、num[i].size(()までループ
      for(int j = 0; j < num_list.get(i).size();j++){ 
        System.out.print(num_list.get(i).get(j) + " ");
        //実行結果:1 2 3 10 11 12
      }
    }
    System.out.println(" ");
    
    //拡張for
    //変数宣言でArrayList<Integer> ＋変数名で宣言すれば、値を引っ張ることが出来る！
    for(ArrayList<Integer> index : num_list) {
      //後は普通の拡張for文で記載
      for (int element : index) {
        System.out.print(element + " ");
        //実行結果:1 2 3 10 11 12
      }
    }

    System.out.println(" ");
    
    //一括表示
    System.out.println(num_list);
    //実行結果:[[1, 2, 3], [10, 11, 12]]
    
    //値の追加方法
    //.add()を使用すればで良いが、各配列ごとに追加、あるいは新規に配列を作成して追加するしかない？
    //num_list.add()の形で直接追加してみたいけど、結局分からず
    
    num1.add(4);
    num2.add(13);
    
    //新規の配列追加
    ArrayList<Integer> num3 = new ArrayList<Integer>();
    num3.add(20);
    num3.add(21);
    num3.add(22);
    
    num_list.add(num3);
    
    System.out.println(num_list);
    //実行結果[[1, 2, 3, 4], [10, 11, 12, 13], [20, 21, 22]]
  }
}
