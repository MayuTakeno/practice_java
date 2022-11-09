public class DoWhileExample2{
  public static void main(String... args){
    // sumに0を代入
    int sum = 0;
    // 繰り返し処理
    // intに1を代入
    // iが10以下の場合
    // iに１ずつ足していく
    for(int i = 1;i <= 10; i++){
      // sumにiを代入
      sum += i;
      System.out.println("変数sumに" + i + "を加えました" + "sumは" + sum);
      // sumが20より大きくなった場合
      if(sum > 20){
        System.out.println("合計が20を超えました。");
        break;
      }
    }
  }
}