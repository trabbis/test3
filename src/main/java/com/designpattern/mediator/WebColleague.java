package com.designpattern.mediator;

public class WebColleague extends Colleague {

	public WebColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receive(String message) {
		System.out.println("WebColleague received: " + message);
		
	}

}
