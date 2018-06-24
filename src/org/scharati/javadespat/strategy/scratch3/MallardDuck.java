package org.scharati.javadespat.strategy.scratch3;

public class MallardDuck extends Duck implements Flyable {

	public void display() {
		System.out.println("+++ Mallard Duck !! +++");
	}

	@Override
	public void fly() {
		System.out.println("+++ Mallard duck flying +++");
	}
}
