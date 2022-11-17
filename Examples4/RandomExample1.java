public class RandomExample1{
  public static void main(String... args){
    String[] janken = {"グー", "チョキ", "パー"};
    int i = (int)(Math.random()*3);
    System.out.println(janken[i]);
  }
}