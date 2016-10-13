package command.appliance;

public class Door {
	@SuppressWarnings("unused")
	private String state;
	
	public void open(){
		state = "open";
		System.out.println("Door is opened...");
	}
	
	public void close() {
		state = "close";
		System.out.println("Door is closed...");
	}
}
