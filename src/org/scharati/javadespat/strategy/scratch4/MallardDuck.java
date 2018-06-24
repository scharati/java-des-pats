package org.scharati.javadespat.strategy.scratch4;

public class MallardDuck extends Duck {

	public MallardDuck(FlyBehavior fly, QuackBehavior quack) {
		super(fly, quack);
	}

	public void display() {
		System.out.println("+++ Mallard Duck !! +++");
	}


}
