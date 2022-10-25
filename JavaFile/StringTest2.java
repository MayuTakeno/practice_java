public class StringTest2{
  public static void main(String... args){
    if(args.length < 1){
      // エラー分を出力
      System.err.println("引数にメールのFromヘッダを指定してください");
      // 処理終了
      System.exit(-1);
    }
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