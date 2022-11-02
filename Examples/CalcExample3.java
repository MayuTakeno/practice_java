public class CalcExample3{
  public static void main(String... args){
    int i;
    int j = (i = 2 + 3) * 5;
    System.out.println("jの値は" + j);
  }
}