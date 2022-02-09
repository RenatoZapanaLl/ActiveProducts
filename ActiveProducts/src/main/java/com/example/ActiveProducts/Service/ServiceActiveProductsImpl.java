package com.example.ActiveProducts.Service;

import com.example.ActiveProducts.Model.ActiveProducts;
import com.example.ActiveProducts.Repository.ActiveProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServiceActiveProductsImpl implements  ServiceActiveProducts {

    @Autowired
    ActiveProductsRepository repository;


    @Override
    public Flux<ActiveProducts> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<ActiveProducts> save(ActiveProducts activeProducts) {
        return repository.save(activeProducts);
    }
}
