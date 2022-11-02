import java.util.Scanner;

public class InputExample1{
  public static void main(String... args){
    Scanner in  = new Scanner(System.in);
    System.out.println("あなたの名前は?");
    String name = in.next();
    System.out.println(name + "さん、こんにちは");
    in.close();
  }
}