package org.scharati.javadespat.strategy.scratch4;

public class StrategyIntro {

	public static void main(String[] args) {
		Duck[] ducks = new Duck[3];
		FlyBehavior flyw = new FlyWithWings();
		FlyBehavior flyc = new FlyCircle();
		QuackBehavior quack = new Quack();
		QuackBehavior squeak = new Squeak();
		MallardDuck mD = new MallardDuck(flyw,quack);
		RubberDuck rD = new RubberDuck(new DefaultFly(),squeak);
		ducks[0] = rD;
		ducks[1] = mD;
		
		for(Duck d : ducks){
			if(d != null){
				System.out.println("--- starting ---");
				d.display();
				d.performFly();
				d.performQuack();
				System.out.println("--- ending ---");
			}
		}
		
		
	}

}
