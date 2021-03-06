package org.scharati.javadespat.strategy.scratch2;

public class StrategyIntro {

	public static void main(String[] args) {
		Duck[] ducks = new Duck[3];
		MallardDuck mD = new MallardDuck();
		RubberDuck rD = new RubberDuck();
		ducks[0] = rD;
		ducks[1] = mD;
		
		for(Duck d : ducks){
			if(d != null){
				System.out.println("--- starting ---");
				d.display();
				d.quack();
				d.fly();
				System.out.println("--- ending ---");
			}
		}
		
		
	}

}
