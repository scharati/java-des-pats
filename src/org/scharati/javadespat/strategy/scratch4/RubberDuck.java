package org.scharati.javadespat.strategy.scratch4;

public class RubberDuck extends Duck {
	
	public RubberDuck(FlyBehavior fly, QuackBehavior quack) {
		super(fly, quack);
	}

	@Override
	public void display() {
		System.out.println("+++ Rubber Duck +++");
	}
}
