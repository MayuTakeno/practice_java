public class SwitchExample1{
  public static void main(String... args){
    int score = 3;
    switch(score){
      case 1:
        System.out.println("１");
        break;
      case 2:
        System.out.println("2");
        break;
      case 3:
        System.out.println("3");
        break;
      default:
        System.out.println("4以降");
        break;
    }
    System.out.println("システムを抜けました。");
  }
}