public class StringTest{
  public static void main(String... args){
    if (args.length < 1){
      System.err.println("引数にメールのFromヘッダを指定してください");
      // プログラムを途中で終了する簡易コード
      System.exit(-1);
    }
    // コマンドライン引数の一つ目を表示
    String input = args[0];
    // 文字列から"<"と">"が両方見つかった場合,substringでその間の文字列を出力する
    int begin = input.indexOf('<');
    if (begin >= 0){
      begin ++;
      int end = input.indexOf('>');
      if (end > begin){
        String addr = input.substring(begin, end);
        System.out.println(addr);
      }
    }
  }
}