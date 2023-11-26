package com.example.BookAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "bookname")
	private String bookName;
	
	@Column(name = "authorname")
	private String authorName;
	
	@Column(name = "publishdate")
	private String publishDate;
	
	@Column(name = "price")
	private Long price;
	
	
	public BookEntity(Long id, String bookName, String authorName, String publishDate, Long price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishDate = publishDate;
		this.price = price;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", publishDate="
				+ publishDate + ", price=" + price + "]";
	}
	
	
}
