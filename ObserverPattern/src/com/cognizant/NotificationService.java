package com.cognizant;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{

	List<INotificationObserver> list = new ArrayList<INotificationObserver>();
	@Override
	public void AddSubscriber(INotificationObserver o) {
		list.add(o);
		System.out.println(list);
	}

	@Override
	public void RemoveSubscriber(INotificationObserver o) {
		list.remove(o);
		System.out.println(list);
	}

	@Override
	public void NotifySubscriber() {
		for(INotificationObserver i : list) {
			i.OnServerDown();
		}
	}
	
}
