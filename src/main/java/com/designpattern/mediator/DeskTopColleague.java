package com.designpattern.mediator;

public class DeskTopColleague extends Colleague {

	public DeskTopColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receive(String message) {
		System.out.println("DeskTopColleague received: " + message);
	}

}
