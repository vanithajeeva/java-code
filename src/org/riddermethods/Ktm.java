package org.riddermethods;

public class Ktm implements Bike, Dio {
@Override
public void cost() {
	System.out.println("one lakhs");
}
@Override
	public void speed() {
	System.out.println("650cc");	
	}
@Override
public void name() {
System.out.println("jawa");	
}
@Override
	public void number() {
System.out.println("9900");		
	}
public static void main(String[] args) {
	Ktm k = new Ktm();
	k.cost();
	k.speed();
	k.name();
	k.number();
}
}

