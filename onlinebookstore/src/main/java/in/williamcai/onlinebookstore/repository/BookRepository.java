package in.williamcai.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.williamcai.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
