package kr.ac.hansung.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	List<Product> findByCategory(String category);
}
