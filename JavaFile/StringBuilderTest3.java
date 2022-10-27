public class StringBuilderTest3{
  // 文字列に含まれる小文字を大文字にして出力
  static void stringBuilderToUpperCase(StringBuilder sb){
    for(int i = 0; i < sb.length(); i ++){
      char c = sb.charAt(i);
      char uc = Character.toUpperCase(c);
      sb.setCharAt(i, uc);
    }
  }
  public static void main(String... args){
    // もし1文字未満の場合
    if(args.length < 1){
      // エラー分出力
      System.err.println("引数に文字列を指定してください");
      // システム終了コマンド
      System.exit(-1);
    }
    StringBuilder input = new StringBuilder(args[0]);
    stringBuilderToUpperCase(input);
    // 入力した文字を出力
    System.out.println(input);
  }
}