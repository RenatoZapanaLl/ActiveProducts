package com.example.ActiveProducts.Controller;

import com.example.ActiveProducts.Model.ActiveProducts;
import com.example.ActiveProducts.Service.ServiceActiveProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ControllerActiveProducts {
    @Autowired
    ServiceActiveProducts service;
    //Select ActiveProducts
    @GetMapping("/getActiveProducts")
    public Flux<ActiveProducts> getActiveProducts()
    {
        return service.findAll();
    }
    //
    @PostMapping("/postActiveProducts")
    Mono<ActiveProducts> postActiveProducts(@RequestBody ActiveProducts activeProducts){
       return service.save(activeProducts);
    }
}
