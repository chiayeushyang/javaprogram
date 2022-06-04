public class Book
{
      private String title; 
      private String author;
      private String publisher; 
      private int copiedSold; 

      public Book(String title, String author, String publisher, int copiedSold){
            this.title = title;
            this.author = author; 
            this.publisher = publisher;
            this.copiedSold = copiedSold;
      }

      public String getTitle() {
            return this.title;
      }

      public void setTitle(String title) {
            this.title = title;
      }

      public String getAuthor() {
            return this.author;
      }

      public void setAuthor(String author) {
            this.author = author;
      }

      public String getPublisher() {
            return this.publisher;
      }

      public void setPublisher(String publisher) {
            this.publisher = publisher;
      }

      public int getCopiedSold() {
            return this.copiedSold;
      }

      public void setCopiedSold(int copiedSold) {
            this.copiedSold = copiedSold;
      }


      public static void main (String [] args) {

      }
}

