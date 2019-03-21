import java.text.NumberFormat;
public class BookShopApp{
  public static void main(String args[]){
    
  Book b1= new Book ();//displays the first book details
  b1.setTitle("Life of Pi");//sets the title of the book
  b1.setPages(348);//sets the number of pages in the book
  b1.setPrice(28.90);//sets the price of the book
  b1.displayBook();//displays book details
  
  Book b2= new Book ();//displays the secpnd book details
  b2.setTitle("Mister Pip");
  b2.setPages(240);
  b2.setPrice(22.70);
  b2.displayBook();
  
  Book b3= new Book ();//displays the third book details
  b3.setTitle("Cinderella");
  b3.setPages(200);
  b3.setPrice(20.50);
  b3.displayBook();
}
}