package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Oct 14, 2023
 */
public class Library {
	@Id
	@GeneratedValue
	private int id;
	private int aisle;
	private int booksAvailable;
	@ManyToOne (cascade=CascadeType.PERSIST)
	private Author author;
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<Book> Book;
	
	public Library(int id, int aisle, int booksAvailable, Author author, List<model.Book> book) {
		super();
		this.id = id;
		this.aisle = aisle;
		this.booksAvailable = booksAvailable;
		this.author = author;
		Book = book;
	}

	public Library(int aisle, int booksAvailable) {
		super();
		this.aisle = aisle;
		this.booksAvailable = booksAvailable;
	}

	public Library(int aisle, int booksAvailable, Author author) {
		super();
		this.aisle = aisle;
		this.booksAvailable = booksAvailable;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAisle() {
		return aisle;
	}

	public void setAisle(int aisle) {
		this.aisle = aisle;
	}

	public int getBooksAvailable() {
		return booksAvailable;
	}

	public void setBooksAvailable(int booksAvailable) {
		this.booksAvailable = booksAvailable;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Book> getBook() {
		return Book;
	}

	public void setBook(List<Book> book) {
		Book = book;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", aisle=" + aisle + ", booksAvailable=" + booksAvailable + ", author=" + author
				+ ", Book=" + Book + "]";
	}

}
