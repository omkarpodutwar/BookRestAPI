package com.example.BookAPI.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookAPI.Entity.BookEntity;
import com.example.BookAPI.Repository.BookRepository;
import com.example.BookAPI.Service.BookService;
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository repository;

	@Override
	public List<BookEntity> findAllBook() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public BookEntity findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public BookEntity saveBook(BookEntity bookEntity) {
		// TODO Auto-generated method stub
		return repository.save(bookEntity);
	}

	@Override
	public BookEntity updateBook(BookEntity bookEntity) {
		// TODO Auto-generated method stub
		return repository.save(bookEntity);
	}

	@Override
	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

}
