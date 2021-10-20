package com.sergio.humans;

public class Human {
	
	private String typeHumanClass;
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	
	
	
	public Human(String typeHumanClass) {
		this.typeHumanClass = typeHumanClass;
		this.strength =3;
		this.stealth=3;
		this.intelligence=3;
		this.health=100;
		
		
	}
	
	
	public String getTypeHumanClass() {
		
		return this.typeHumanClass;
	}
	
	public int getStrength() {
		
		return this.strength;
	}
	
	public int getStealth() {
		
		return this.stealth;
	}
	
	public int getIntelligence() {
		return this.intelligence;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	
	public void setTypeHumanClass(String typeHumanClass) {
		this.typeHumanClass = typeHumanClass;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void setStealth(int stealth) {
		
		this.stealth = stealth;
		
	}
	
	public void setIntelligence(int intelligence) {
		
		this.intelligence = intelligence;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void attack(Human human) {
		
		System.out.println("Attacking...!!!");
		System.out.println("Health Human 1 before attack: "+this.getHealth());
		System.out.println("Health Human 2 before receive attack: "+human.getHealth());
		int loss=this.getStrength();
		human.setHealth(human.getHealth()-loss);
		System.out.println("Health Human 1 after attack: "+this.getHealth());
		System.out.println("Health Human 2 after receive attack: "+ human.getHealth());
	}

}
