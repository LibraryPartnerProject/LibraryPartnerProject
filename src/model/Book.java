package model;

import java.time.LocalDate;

public class Book {

	private Long id;
	private String title;
	private LocalDate publicationDate;
	private Author author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Long id, String title, LocalDate publicationDate, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.publicationDate = publicationDate;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", publicationDate=" + publicationDate + ", author=" + author
				+ "]";
	}
}