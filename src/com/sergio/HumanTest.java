package com.sergio;

import com.sergio.humans.Human;

public class HumanTest {

	public static void main(String[] args) {
		
		Human human1 = new Human("Human1");
		Human human2 = new Human("Human2");
		
		human1.attack(human2);

	}

}
