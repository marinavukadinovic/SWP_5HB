package ObserverMatura;

public class Main {

	public static void main(String[] args) {
		
		WeatherStation observable = new WeatherStation();
		Observer observer = new WeatherStation();
		
		observable.addObserver(observer);
		observable.addObserver("Test");
		System.out.println(observable.getNews() + "=" + observable);
		
		NewsAgencyJava observableJava = new NewsAgencyJava();
		NewsChannelJava observerJava = new NewsChannelJava();
		observableJava. addObserver (observerJava);
		observableJava.setNews("Test");
	}

	}

