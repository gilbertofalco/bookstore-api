package com.gilberto.bookstore.repositories;

import com.gilberto.bookstore.domain.Book;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	

}
