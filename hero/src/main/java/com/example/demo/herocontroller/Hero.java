package com.example.demo.herocontroller;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hero")
public class Hero {
	
private String name;
	private int networth;
	private int level;
	private int kill;
	private int death;
	private int assist;
	private String primary_attribute;
	
public Hero(String name, int networth, int level, int kill, int death, int assist, String primary_attribute) {
	this.name = name;
	this.networth = networth;
	this.level = level;
	this.kill = kill;
	this.death = death;
	this.assist = assist;
	this.primary_attribute = primary_attribute;
	}

public String getName() {
	return this.name;
	}

public void setName(String name) {
	this.name = name;
	}

public int getNetworth() {
	return this.networth;
	}

public void setNetworth(int networth) {
	this.networth = networth;
	}

public int getLevel() {
	return this.level;
	}

public void setLevel(int level) {
	this.level = level;
	}

public int getKill() {
	return this.kill;
	}

public void setKill(int kill) {
	this.kill = kill;
	}

public int getDeath() {
	return this.death;
	}

public void setDeath(int death) {
	this.death = death;
	}

public int getAssist() {
	return this.assist;
	}

public void setAssist(int assist) {
	this.assist = assist;
	}

public String getPrimary_attribute() {
	return this.primary_attribute;
	}

public void setPrimary_attribute(String primary_attribute) {
	this.primary_attribute = primary_attribute;
	}

@Override
public String toString() {
    return "Hero{" +
            ", name='" + name + '\'' +
            ", networth='" + networth + '\'' +
            ", level='" + level + '\'' +
            ", kill='" + kill + '\'' +
            ", death='" + death + '\'' +
            ", assist'" + assist + '\'' +
            ", primary_attribute'" + primary_attribute +
            '}';
	}
}
