package com.gilberto.bookstore.repositories;

import com.gilberto.bookstore.domain.Category;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	

}
