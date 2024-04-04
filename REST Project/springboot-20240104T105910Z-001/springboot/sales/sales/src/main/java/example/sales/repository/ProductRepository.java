package example.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.sales.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional methods if needed
}
