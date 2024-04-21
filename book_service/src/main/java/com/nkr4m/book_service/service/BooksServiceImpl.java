package com.nkr4m.book_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nkr4m.book_service.entity.Books;
import com.nkr4m.book_service.repository.BooksRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BooksServiceImpl implements BooksService {

	@Autowired
	BooksRepository bookRepo;
	
	@Override
	public Books fetchSpecificBook(Integer id) {
		
		Books book = bookRepo.fetchBookById(id);
		return book;
	}

	@Override
	public Page<Books> fetchAllBooks(Optional<Integer> pageNumber, Optional<Integer> pageSize) {
	    int page = pageNumber.orElse(0);
	    int size = pageSize.orElse(10);
	    
	    Sort sort = Sort.by("bookId").ascending();
	    PageRequest pageRequest = PageRequest.of(page, size, sort);
	    
	    return bookRepo.findAll(pageRequest);
	}

	
}
