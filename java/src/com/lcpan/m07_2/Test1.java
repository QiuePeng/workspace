package com.lcpan.m07_2;

public class Test1 {

	public static void main(String[] args) {

		//Dog dog = new Dog();
		//dog.run();
		Animal animal = new Dog();
		animal.run();
		animal = new Cat();
		animal.run();
		animal = new Lion();
		animal.run();
		
		Feline feline = new Lion();
		feline.run();
	}

}
