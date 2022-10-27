public class Book2{
  private final String title;
  private final String author;
  Book2(String title, String author){
    this.title = title;
    this.author = author;
  }
  @Override
  public String toString(){
    return title + "written by" + author;
  }
  public static void main(String... args){
    Book2 book2 = new Book2("Peopleware", "DeMarco");
    System.out.println(book2);
  }
}