public class Book {

        // Private attributes to store book information
        private String title;
        private String author;
        private int year;
      
        // Constructor to initialize book attributes during object creation
        public Book(String title, String author, int year) {
          this.title = title;
          this.author = author;
          this.year = year;
        }
      
        // Getter methods to access private attributes
        public String getTitle() {
          return title;
        }
      
        public String getAuthor() {
          return author;
        }
      
        public int getYear() {
          return year;
        }
      }
      
      public class Main {
      
        public static void main(String[] args) {
      
          // Create an array to store 5 Book objects
          Book[] library = new Book[5];
      
          // Instantiate Book objects with different details
          library[0] = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
          library[1] = new Book("Pride and Prejudice", "Jane Austen", 1813);
          library[2] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
          library[3] = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979);
          library[4] = new Book("The Martian", "Andy Weir", 2011);
      
          // Loop through the library array and print book details
          for (int i = 0; i < library.length; i++) {
            Book book = library[i]; // Get current book object
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getYear());
          }
        }
    }
      
