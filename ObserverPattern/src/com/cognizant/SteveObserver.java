package com.cognizant;

public class SteveObserver implements INotificationObserver {

	public String name;

	public SteveObserver() {
		this.name = "Steve";
	}

	@Override
	public void OnServerDown() {
		System.out.println("Notified : "+name);
	}

	@Override
	public String toString() {
		return name;
	}
}
