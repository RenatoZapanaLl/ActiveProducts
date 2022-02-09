package com.example.ActiveProducts.Repository;

import com.example.ActiveProducts.Model.ActiveProducts;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveProductsRepository extends  ReactiveMongoRepository<ActiveProducts,String>{
}
