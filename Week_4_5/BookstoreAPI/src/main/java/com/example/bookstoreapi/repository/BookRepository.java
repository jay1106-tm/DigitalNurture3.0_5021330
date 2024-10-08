package com.example.bookstoreapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstoreapi.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

	public List<Book> findAll();

	public static Optional<Book> findById(String bookname) {
		return null;
	}

}
