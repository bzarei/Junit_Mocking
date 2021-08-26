package de.telekom.sea4.mockito;

public class App {

	private Top top;
	
	public static void main(String[] args) {
        
		Bottom bottom = new Bottom();
		Middle middle = new Middle(bottom);	
		Top top = new Top(middle);

		App app = new App(top);
		
		app.run(args); 
		System.out.println("Hello SEA Kollegen");

	}
	
	public void run(String[] args) {		
		
		System.out.println(top.topMethode());
	
	}
	
	public App(Top top) {
		this.top = top;
	}
}
