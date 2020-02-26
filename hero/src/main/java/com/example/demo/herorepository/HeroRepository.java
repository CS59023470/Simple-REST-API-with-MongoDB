package com.example.demo.herorepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.herocontroller.Hero;

public interface HeroRepository extends MongoRepository<Hero, String>{

}
