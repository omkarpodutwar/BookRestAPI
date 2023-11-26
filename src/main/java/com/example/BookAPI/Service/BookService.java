package com.example.BookAPI.Service;

import java.util.List;

import com.example.BookAPI.Entity.BookEntity;

public interface BookService {

	List<BookEntity> findAllBook();
	BookEntity findById(Long id);
	BookEntity saveBook(BookEntity bookEntity);
	BookEntity updateBook(BookEntity bookEntity);
	void deleteBook(Long id);
}
