package ObserverMatura;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

	private String news;
	
	private List <Observer> observs;
	
	public WeatherStation() {
		this.observs = new ArrayList<Observer>();
	}
	
	public void addObserver (Observer o) {
		this.observs.add(o);
	}
	
	public void removeObserver (Observer o) {
		this.observs.remove(o);
	}
	
	public void notifyObservers (Observer o) {
		this.observs.notify();
	}
	
}