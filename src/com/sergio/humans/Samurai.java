package com.sergio.humans;

public class Samurai extends Human {
	
	public Samurai(String typeHumanClass) {
		super(typeHumanClass);
		this.setHealth(200);
		
	}
	
	public void deathBlow(Human human) {
		System.out.println("\nKilling Human...!!");
		System.out.println("Human Health before attack: "+human.getHealth());
		System.out.println("Samurai Health before attack: "+this.getHealth());
		human.setHealth(0);
		this.setHealth(this.getHealth()/2);
		System.out.println("Human Health after attack: "+human.getHealth());
		System.out.println("Samurai Health after attack: "+ this.getHealth());
	}
	
	public void meditate() {
		System.out.println("\nMeditating....!!");
		System.out.println("Samurai Health before meditation: "+ this.getHealth());
		int valueToIncrease = this.getHealth()/2;
		this.setHealth(getHealth()+ valueToIncrease);
		System.out.println("Samurai Health after meditation: "+this.getHealth());
	}
	
	public void howMany() {
		System.out.print("\nSAMURAI INFO:\nHealth: "+this.getHealth()+"\nStrength: "+this.getStrength()+"\nStealth: "+this.getStealth()+"\nIntelligence: "+this.getIntelligence());
	}

}
