package advanced.java.design.patterns.issue27.behavioral.observer;


import advanced.java.design.patterns.issue27.behavioral.observer.Subject;

public class ObserverDemo {

	public static void main(String args[]) {
		Subject subject = new MessageStream();

		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);

		phoneClient.addMessage("Here is a new message!");
		tabletClient.addMessage("Another new message!");
	}
	
}
