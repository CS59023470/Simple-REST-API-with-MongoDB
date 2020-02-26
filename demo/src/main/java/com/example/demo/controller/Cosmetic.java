package com.example.demo.controller;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "cosmetic")
public class Cosmetic {

	@Id
private String id;
	private String name;
	private int amount;

public Cosmetic(String id, String name, int amount) {
	this.id = id;
	this.name = name;
	this.amount = amount;
	}

public String getId() {
    return this.id;
	}

public void setId(String id) {
    this.id = id;
	}

public String getName() {
    return this.name;
	}

public void setName(String name) {
    this.name = name;
	}

public int getAmount() {
    return amount;
	}

public void setAmount(int amount) {
    this.amount = amount;
	}

@Override
public String toString() {
    return "Cosmetic{" +
            ", name='" + name + '\'' +
            ", amount=" + amount +
            '}';
	}
}
