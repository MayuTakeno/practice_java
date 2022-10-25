public class Letter{
  private final String title;
  private final String author;
  Letter(String title, String author){
    this.title = title;
    this.author = author;
  }

  @Override
  public String toString(){
    return title + "Dear" + author;
  }
  public static void main(String... args){
    Book book = new Book
  }
}