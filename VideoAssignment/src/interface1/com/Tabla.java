package interface1.com;

public class Tabla {

	public static void main(String[] args) {
	
		PercussionInstrument tabla=new PercussionInstrument();
		tabla.play();
		tabla.listenSound();
		MusicInstrument.learnInstrument();
		System.out.println("----------------------------------------");
		StringedInstrument violin=new StringedInstrument();
		violin.play();
		violin.listenSound();
		MusicInstrument.learnInstrument();
		
	}

}
