package xyz.gokulnair.productservive.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import xyz.gokulnair.productservive.model.Product;



public interface ProductRepository extends MongoRepository<Product,String> {
}
