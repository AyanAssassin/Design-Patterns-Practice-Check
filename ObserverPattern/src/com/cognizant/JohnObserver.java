package com.cognizant;

public class JohnObserver implements INotificationObserver {

	public String name;

	public JohnObserver() {
		this.name = "John";
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
