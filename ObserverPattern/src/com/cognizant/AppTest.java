package com.cognizant;

public class AppTest {
	public static void main(String[] args) {
		INotificationObserver steve = new SteveObserver();
		INotificationObserver john = new JohnObserver();
		INotificationService service = new NotificationService();
		
		service.AddSubscriber(john);
		service.NotifySubscriber();
		
		service.AddSubscriber(steve);
		service.NotifySubscriber();
		
		service.RemoveSubscriber(john);
		service.NotifySubscriber();
	}
}
