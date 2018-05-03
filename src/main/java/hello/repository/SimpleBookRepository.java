package hello.repository;

import hello.model.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class SimpleBookRepository implements BookRepository {
  
  @Override
  @Cacheable("books")
  public Book getBookByISBN(String isbn) {
    simulateSlowService();
    return new Book(isbn, "Some Cool Book");
  }
  
  // simulating latency
  private void simulateSlowService() {
    try {
      long time = 3000L;
      Thread.sleep(time);
    } catch (InterruptedException ie) {
      throw new IllegalStateException();
    }
  }
}
