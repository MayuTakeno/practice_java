public class DoWhileExample1{
  public static void main(String... args){
    // 変数iに5を代入
    int i = 5;
    // 繰り返し
    do{
      System.out.println(i);
      // iを1ずつ減らしていく
      i --;
    }while(i > 0);
    System.out.println("処理を終了します");
  }
}