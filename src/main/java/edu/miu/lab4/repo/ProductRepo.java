package edu.miu.lab4.repo;

import edu.miu.lab4.entity.Category;
import edu.miu.lab4.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    List<Product> findAllByPriceGreaterThan(float minPrice);
    List<Product> findAllByCategoryIsAndPriceLessThan(Category cat, float maxPrice);
    List<Product> findAllByNameContains(String keyword);
}
