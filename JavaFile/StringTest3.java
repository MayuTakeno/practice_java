public class StringTest3{
  public static void main(String... args){
    // もし1文字未満の場合
    if(args.length < 1){
      // （）の文字列を表示
      System.out.println("引数にメールのFromヘッダを指定してください");
      // システムの終了
      System.exit(-1);
    }
    // コマンドライン引数の一つ目を表示
    String input = args[0];
    int begin = input.indexOf('<');
    if(begin >= 0){
      begin ++;
      int end = input.indexOf('>');
      if(end > begin){
        String addr = input.substring(begin, end);
        System.out.println(addr);
      }
    }
  }
}