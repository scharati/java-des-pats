package org.scharati.javadespat.strategy.scratch4;

public class Duck {
	
	private FlyBehavior fly = new DefaultFly();
	private QuackBehavior quack = new DefaultQuack();
	
	public Duck(FlyBehavior fly, QuackBehavior quack){
		this.fly = fly;
		this.quack = quack;
	}
	
	public void swim(){
		System.out.println("+++ Swimming +++");
	}
	
	public void display(){
		System.out.println("+++ Generic Duck +++");
	}

	void performFly(){
		fly.fly();
	}
	
	void performQuack(){
		quack.quack();
	}
}
