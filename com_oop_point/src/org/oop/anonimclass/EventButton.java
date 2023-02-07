package org.oop.anonimclass;

public class EventButton {
	private EventHandler handler;
	
	public EventButton(EventHandler handler) {
		this.handler = handler;
	}

	public void click() {
		handler.event();
	}
}

interface EventHandler {
	public void event();
}
