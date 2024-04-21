package com.nkr4m.book_service.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.nkr4m.book_service.entity.Books;

public interface BooksService {
	
	Books fetchSpecificBook(Integer id);
	
	Page<Books> fetchAllBooks(Optional<Integer> pageNumber, Optional<Integer> pageSize);

}
