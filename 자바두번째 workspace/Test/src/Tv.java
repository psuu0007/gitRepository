
public class Tv {

	private boolean power;
	private int channel;
	private String manual;
	
	
	public void setPower(boolean power){
		this.power = power;
	}
	
	public boolean getPower() {
		return power;
	}
	
	public void setChannel(int channel){
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setManual(String manual){
		this.manual = manual;
	}
	
	public String getManual() {
		return manual;
	}
	
	public String toString() {
		return "power= " + power + ", channel= " + channel + ", manual= " + manual;
	}
	
	
	
}
