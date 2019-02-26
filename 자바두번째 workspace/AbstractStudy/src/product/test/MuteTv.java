package product.test;

public class MuteTv extends Tv {

	@Override
	void power() {
		// TODO Auto-generated method stub
		power = !power;
	}

	@Override
	void channelUp() {
		// TODO Auto-generated method stub
		channel++;
	}

	@Override
	void channelDown() {
		// TODO Auto-generated method stub
		channel--;
	}

	@Override
	void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
	}

	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
	}
	
	public void printInfo() {
		System.out.println(power);
		System.out.println(channel);
		System.out.println(volume);
	}

}
