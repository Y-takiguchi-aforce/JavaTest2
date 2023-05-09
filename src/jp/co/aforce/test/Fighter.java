package jp.co.aforce.test;

public class Fighter extends Airplane {
	@Override
	void fly() {
		System.out.println("飛行します");
	}
	
	void fight() {
		System.out.println("戦闘します");
	}
}
