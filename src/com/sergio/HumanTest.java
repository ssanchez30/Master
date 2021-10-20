package com.sergio;

import com.sergio.humans.Human;
import com.sergio.humans.Ninja;
import com.sergio.humans.Samurai;
import com.sergio.humans.Wizard;

public class HumanTest {

	public static void main(String[] args) {
		
		Human human1 = new Human("Human1");
		Human human2 = new Human("Human2");
		Human human3 = new Human("Human3");
		Ninja ninja1 = new Ninja("Ninja1");
		Samurai samurai1 = new Samurai("Samurai1");
		Wizard wizard1 = new Wizard("Wizard1");
		
		
		System.out.println("\n ---- Playing ----");
		
		human1.attack(human2);
		ninja1.attack(human2);
		wizard1.heal(human2);
		samurai1.deathBlow(human1);
		ninja1.runAway();
		wizard1.fireball(human2);
		ninja1.steal(human3);
		samurai1.meditate();
		samurai1.howMany();

	}

}
