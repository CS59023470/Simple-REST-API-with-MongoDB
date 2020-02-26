package com.example.demo.demorepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.controller.Cosmetic;

public interface ListRepository extends MongoRepository<Cosmetic, String>{

}
