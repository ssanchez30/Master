package com.sergio.humans;

public class Ninja extends Human {
	
	public Ninja(String typeHumanClass) {
		super(typeHumanClass);
		this.setStealth(10);

	}
	
	public void steal(Human human) {
		System.out.println("\nStealing....!!");
		System.out.println("Health Ninja before stealing.."+this.getHealth());
		System.out.println("Health Human before stealing..."+human.getHealth());
		int valueToTake = this.getStealth();
		this.setHealth(this.getHealth()+valueToTake);
		human.setHealth(human.getHealth()-valueToTake);
		System.out.println("Health Ninja after stealing: "+this.getHealth());
		System.out.println("Health Human after stealing: "+human.getHealth());
	}
	
	public void runAway() {
		System.out.println("\nRunning Away...!!");
		System.out.println("Ninja Health before running..."+this.getHealth());
		this.setHealth(this.getHealth()-10);
		System.out.println("Ninja Health after running: "+this.getHealth());
		
	}

}
