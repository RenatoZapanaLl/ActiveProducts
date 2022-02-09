package com.example.ActiveProducts.Service;
import com.example.ActiveProducts.Model.ActiveProducts;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ServiceActiveProducts {
    Flux<ActiveProducts> findAll();
    Mono<ActiveProducts> save(ActiveProducts activeProducts);
}
