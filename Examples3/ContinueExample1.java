public class ContinueExample1{
  public static void main(String... args){
    int sum = 0;
    for(int i = 0; i <= 10; i++){
      if(i % 2 == 0){
        continue;
      }
      sum += i;
      System.out.println("変数sumに" + i + "を加えました。" + "sumは" + sum);
    }
  }
}