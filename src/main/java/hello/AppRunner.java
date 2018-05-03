package hello;

import hello.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
  
  private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
  
  private final BookRepository repository;
  
  public AppRunner(BookRepository repository) {
    this.repository = repository;
  }
  
  @Override
  public void run(String... args) {
    logger.info("...retrieving books");
    logger.info("isbn 1234 --> " + repository.getBookByISBN("1234"));
    logger.info("isbn 4567 --> " + repository.getBookByISBN("4567"));
    logger.info("isbn 1234 --> " + repository.getBookByISBN("1234"));
    logger.info("isbn 4567 --> " + repository.getBookByISBN("4567"));
    logger.info("isbn 1234 --> " + repository.getBookByISBN("1234"));
    logger.info("isbn 4567 --> " + repository.getBookByISBN("4567"));
    logger.info("...done retrieving books");
  }
}
