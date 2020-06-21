package kr.pe.junho85.demo.service;

import kr.pe.junho85.demo.repository.BookRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
//public class BookService implements InitializingBean {
public class BookService {

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("=== afterPropertiesSet ===");
//    }

    @PostConstruct
    public void setup() {
        System.out.println("== post construct ==");
    }


    // 다 받아
//    @Autowired
//    List<BookRepository> bookRepository;

    @Autowired
    BookRepository myBookRepository;

//    @Autowired @Qualifier("myBookRepository")
//    BookRepository bookRepository;
//
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//
//    @Autowired
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    public void printBookRepository() {
//        System.out.println(bookRepository.getClass());
        System.out.println(myBookRepository.getClass());
        // 다 받아
//        this.bookRepository.forEach(System.out::println);
    }
}
