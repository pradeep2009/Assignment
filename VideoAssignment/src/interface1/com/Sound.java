package interface1.com;

abstract  class Sound {
	
	abstract void listenSound();

}
class PercussionInstrument extends Sound  implements MusicInstrument
{
	public void play()
	{
		System.out.println("PercussionInstrument is played");
	}
	public void listenSound()
	{
		System.out.println("listen sound of PercussionInstrument");
	}
}
class StringedInstrument extends Sound   implements MusicInstrument
{
	public void play()
	{
		System.out.println("StringedInstrument is played");
	}
	public void listenSound()
	{
		System.out.println("listen sound of StringedInstrument");
	}
}