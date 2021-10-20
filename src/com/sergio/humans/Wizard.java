package com.sergio.humans;

public class Wizard extends Human{
	
	
	public Wizard(String typeHumanClass) {
		super(typeHumanClass);
		this.setHealth(50);
		this.setIntelligence(8);
	
		
	}
	
	public void heal(Human human) {
		System.out.println("\nHealing the human...!!");
		System.out.println("Human Health before healing: "+human.getHealth());
		human.setHealth(human.getHealth()+this.getIntelligence());
		System.out.println("Human Health after healing: "+human.getHealth());
	}
	
	public void fireball(Human human) {
		System.out.println("\nSending fireball...!!");
		System.out.println("Human Health before fireball attack: "+human.getHealth());
		human.setHealth(human.getHealth()-this.getIntelligence()*3);
		System.out.println("Human Health after fireball attack: "+ human.getHealth());
	}
	

}
