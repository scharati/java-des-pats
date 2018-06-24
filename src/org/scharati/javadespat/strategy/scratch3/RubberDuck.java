package org.scharati.javadespat.strategy.scratch3;

public class RubberDuck extends Duck {
	@Override
	public void display() {
		System.out.println("+++ Rubber Duck +++");
	}
	@Override
	public void quack(){
		System.out.println("+++ squeak +++");
	}
}
