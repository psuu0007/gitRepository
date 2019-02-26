
public interface Tv {

	public static final boolean POWER = false;
	final int CHANNEL_UP = 0;
	static int VOLUME = 0;
	String NAME = "";

	public abstract void power();
	
	int getVolume();
	
}
