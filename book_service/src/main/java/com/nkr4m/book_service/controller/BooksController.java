package com.nkr4m.book_service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nkr4m.book_service.entity.Books;
import com.nkr4m.book_service.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired
	BooksService bookService;
	
	@GetMapping("fetch-book")
	public ResponseEntity<Books> fetchSpecificBook(@RequestParam Integer id) throws Exception{
//		throw new Exception("BBBB");
		Books book = bookService.fetchSpecificBook(id);
		return new ResponseEntity<Books>(book, HttpStatus.OK);
	}
	
	@GetMapping("fetch-all-books")
	public ResponseEntity<Page<Books>> fetchAllBooks(@RequestParam Optional<Integer> pageNumber,
			Optional<Integer> pageSize){
		
		
		Page<Books> bookPage = bookService.fetchAllBooks(pageNumber, pageSize);
		
		return new ResponseEntity<Page<Books>>(bookPage, HttpStatus.OK);
	}

}
