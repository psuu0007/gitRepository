
public class Tv {

	boolean power = false;
	int channel = 0;
	
	void power() {
		System.out.println("Tv에서 수행한거");
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
	
}




