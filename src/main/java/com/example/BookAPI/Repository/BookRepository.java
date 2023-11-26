package com.example.BookAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookAPI.Entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long>{

}
