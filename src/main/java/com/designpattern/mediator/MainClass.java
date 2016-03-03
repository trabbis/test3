package com.designpattern.mediator;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationMediator mediator = new ApplicationMediator();
		
		Colleague desktop = new DeskTopColleague(mediator);
		Colleague mobile = new MobileColleague(mediator);
		Colleague web = new WebColleague(mediator);
		
		mediator.addColleague(desktop);
		mediator.addColleague(mobile);
		mediator.addColleague(web);
		
		desktop.send("1. Desktop sending message...\n");
		mobile.send("2. Mobile sending message...\n");
		web.send("3. Web sending message...\n");
		
		
	}
}
