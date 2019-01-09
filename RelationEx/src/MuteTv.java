
public class MuteTv extends Tv{

	int volume = 0;
	boolean silence = false;
	int previousVolume = 0;
	
	void silenceButton(){
		silence = !silence;
		
		if(silence == true){
			previousVolume = volume;
			volume = 0;
		}else{
			volume = previousVolume;
		}
	}
	
	
}
