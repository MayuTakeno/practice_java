public class CalcExample2{
  public static void main(String... args){
    int i;
    i = 10;
    i ++;
    i /= 2;
    System.out.println("iの値は" + i);

    int j;
    j = i * 3;
    System.out.println("jの値は" + j);

    double c;
    c = j % 4;
    System.out.println("cの値は" + c);
  }
}