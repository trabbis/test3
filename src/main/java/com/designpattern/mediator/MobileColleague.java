package com.designpattern.mediator;

public class MobileColleague extends Colleague {

	public MobileColleague(Mediator m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receive(String message) {
		System.out.println("Mobile received:" + message);
	}
	

}
