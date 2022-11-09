public class NestExample{
  public static void main(String... args){
    for(int a = 1; a <= 3; a++){
      System.out.println("変数aは" + a);
      for(int b = 1; b <= 3; b++){
        System.out.println("変数bは"+ b);
      }
    }
  }
}