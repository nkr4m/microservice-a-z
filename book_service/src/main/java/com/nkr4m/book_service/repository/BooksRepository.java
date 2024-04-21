package com.nkr4m.book_service.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nkr4m.book_service.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {
	
	@Query(value="SELECT * FROM books b WHERE b.book_id = :bookId", nativeQuery = true)
	Books fetchBookById(@Param("bookId") Integer bookId);
	
	
	
}
