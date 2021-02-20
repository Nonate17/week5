package week5;

public class App {

	public static void main(String[] args) {
		Logger asterisk = new asteriskLogger();
		asterisk.log("Hello");
		asterisk.error("Hello");
		System.out.println("======================");
		
		Logger spaced = new SpacedLogger();
		spaced.log("Hello");
		spaced.error("Hello");
		
	}
		
}
