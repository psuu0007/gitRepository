package product.test;

abstract class Tv {

	boolean power = false;
	int channel = 0;
	int volume = 0;
	
	abstract void power();
	abstract void channelUp();
	abstract void channelDown();
	abstract void volumeUp();
	abstract void volumeDown();
	
//	public void printInfo() {
//		System.out.println(power);
//		System.out.println(channel);
//		System.out.println(volume);
//	}
}
