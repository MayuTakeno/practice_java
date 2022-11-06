public class ForExample5{
  public static void main(String... args){
    // 変数sumに0を代入
    int sum = 0;
    // iが100以下の場合,iに1を足していく
    for(int i = 1; i <= 100; i++){
      // 変数sumにiを足していく
      sum += i;
      System.out.println(i + "を加えました。");
    }
    System.out.println("合計は" + sum + "です");
  }
}