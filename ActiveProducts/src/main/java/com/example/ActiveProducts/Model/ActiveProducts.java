package com.example.ActiveProducts.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "ActiveProducts")

public class ActiveProducts {

    @Id
    private  String id;
    private  String Type;
    private  int NumberCredits;

}
