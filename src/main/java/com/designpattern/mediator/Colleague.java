package com.designpattern.mediator;

public abstract class Colleague {

	private Mediator mediator;
	public Colleague(Mediator m) {
		mediator = m;
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public Mediator getMediator() {
		return mediator;
	}
	
	public abstract void receive(String message);

}
