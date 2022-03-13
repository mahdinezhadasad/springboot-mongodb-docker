package com.javatechie.docker.compose;

import com.javatechie.docker.compose.dao.BookRepository;
import com.javatechie.docker.compose.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringbootMongodbDockerApplication {

    @Autowired
    BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongodbDockerApplication.class, args);
    }


    @PostMapping
    public Book saveBook(@RequestBody Book book){


        return  bookRepository.save(book);
    }
    @GetMapping
    public List<Book> getBooks(){

        return  bookRepository.findAll();



    }

}
