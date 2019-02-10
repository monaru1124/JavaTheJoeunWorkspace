package code;

public class TV {
	
	boolean isTurnOn; // 켜져있는지.
	int channel; // 몇번 채널이 켜져있는지.
	
	public void turnOn() {
		
		this.isTurnOn = true;
	}
	
	public void turnOff() {
		
		this.isTurnOn = false;
		
	}

}
